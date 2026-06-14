package com.cms.servlet;

import java.io.IOException;
import java.util.ArrayList;

import com.cms.dao.ComplaintDAO;
import com.cms.dto.Complaint;
import com.cms.dto.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/viewComplaints")
public class ViewComplaintsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);

        if(session == null || session.getAttribute("employee") == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        Employee emp = (Employee) session.getAttribute("employee");

        ComplaintDAO dao = new ComplaintDAO();

        ArrayList<Complaint> complaints =
                dao.getComplaintsByEmployee(emp.getId());

        request.setAttribute("complaints", complaints);

        request.getRequestDispatcher("viewComplaints.jsp")
               .forward(request, response);
    }
}