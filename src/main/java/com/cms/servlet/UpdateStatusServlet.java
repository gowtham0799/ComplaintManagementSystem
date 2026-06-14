package com.cms.servlet;

import java.io.IOException;

import com.cms.dao.ComplaintDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/updateStatus")
public class UpdateStatusServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        int id =
                Integer.parseInt(request.getParameter("id"));

        String status =
                request.getParameter("status");

        ComplaintDAO dao = new ComplaintDAO();

        boolean result =
                dao.updateStatus(id, status);

        if(result) {
            response.sendRedirect("viewAllComplaints");
        } else {
            response.sendRedirect("error.jsp");
        }
    }
}