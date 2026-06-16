package com.cms.servlet;

import java.io.IOException;

import com.cms.dao.ComplaintDAO;
import com.cms.dto.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/dashboard")
public class DashboardServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session =
                request.getSession(false);

        if(session == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        Employee emp =
                (Employee) session.getAttribute("employee");

        if(emp == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        ComplaintDAO dao =
                new ComplaintDAO();

        request.setAttribute(
                "total",
                dao.getEmployeeTotalComplaints(emp.getId()));

        request.setAttribute(
                "pending",
                dao.getEmployeePendingComplaints(emp.getId()));

        request.setAttribute(
                "inProgress",
                dao.getEmployeeInProgressComplaints(emp.getId()));

        request.setAttribute(
                "resolved",
                dao.getEmployeeResolvedComplaints(emp.getId()));

        request.getRequestDispatcher("dashboard.jsp")
               .forward(request, response);
    }
}