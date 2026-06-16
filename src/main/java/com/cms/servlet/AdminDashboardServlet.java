package com.cms.servlet;

import java.io.IOException;

import com.cms.dao.ComplaintDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/adminDashboard")
public class AdminDashboardServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        ComplaintDAO dao =
                new ComplaintDAO();

        request.setAttribute(
                "total",
                dao.getTotalComplaints());

        request.setAttribute(
                "pending",
                dao.getPendingComplaints());
        request.setAttribute(
        "inProgress",
        dao.getInProgressComplaints());

        request.setAttribute(
                "resolved",
                dao.getResolvedComplaints());

        request.getRequestDispatcher(
                "adminDashboard.jsp")
                .forward(request,response);
    }
}