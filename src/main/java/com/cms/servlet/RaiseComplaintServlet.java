package com.cms.servlet;

import java.io.IOException;

import com.cms.dao.ComplaintDAO;
import com.cms.dto.Complaint;
import com.cms.dto.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/raiseComplaint")
public class RaiseComplaintServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String title = request.getParameter("title");
        String description = request.getParameter("description");

        HttpSession session = request.getSession(false);

        if(session == null || session.getAttribute("employee") == null){
            response.sendRedirect("login.jsp");
            return;
        }
        Employee emp =
                (Employee) session.getAttribute("employee");

        Complaint complaint = new Complaint();

        complaint.setTitle(title);
        complaint.setDescription(description);
        complaint.setStatus("Pending");
        complaint.setEmployeeId(emp.getId());

        ComplaintDAO dao = new ComplaintDAO();

        boolean status = dao.raiseComplaint(complaint);

        if(status) {
            response.sendRedirect("complaintSuccess.jsp");
        } else {
            response.sendRedirect("error.jsp");
        }
    }
}