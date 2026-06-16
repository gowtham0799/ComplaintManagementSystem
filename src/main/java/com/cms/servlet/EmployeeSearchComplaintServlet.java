package com.cms.servlet;

import java.io.IOException;
import java.util.ArrayList;

import com.cms.dao.ComplaintDAO;
import com.cms.dto.Complaint;
import com.cms.dto.Employee;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/employeeSearchComplaint")
public class EmployeeSearchComplaintServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        String keyword =
                request.getParameter("keyword");

        ComplaintDAO dao =
                new ComplaintDAO();

        HttpSession session =
        request.getSession();

Employee emp =
        (Employee) session.getAttribute("employee");

ArrayList<Complaint> list =
        dao.searchEmployeeComplaints(
                keyword,
                emp.getId());

        request.setAttribute("complaints", list);

        request.getRequestDispatcher("viewComplaints.jsp")
               .forward(request, response);
    }
}