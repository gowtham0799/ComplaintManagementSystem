package com.cms.servlet;

import java.io.IOException;
import java.util.ArrayList;

import com.cms.dao.ComplaintDAO;
import com.cms.dto.Complaint;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/adminSearchComplaint")
public class AdminSearchComplaintServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        String keyword =
                request.getParameter("keyword");

        ComplaintDAO dao =
                new ComplaintDAO();

        ArrayList<Complaint> list =
                dao.searchComplaints(keyword);

        request.setAttribute("complaints", list);

        request.getRequestDispatcher("viewAllComplaints.jsp")
               .forward(request, response);
    }
}