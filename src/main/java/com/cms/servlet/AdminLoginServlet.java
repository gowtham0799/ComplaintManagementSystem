package com.cms.servlet;

import java.io.IOException;

import com.cms.dao.AdminDAO;
import com.cms.dto.Admin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/adminLogin")
public class AdminLoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String username =
                request.getParameter("username");

        String password =
                request.getParameter("password");

        AdminDAO dao = new AdminDAO();

        Admin admin =
                dao.loginAdmin(username,password);

        if(admin != null){

            HttpSession session =
                    request.getSession();

            session.setAttribute("admin", admin);

            response.sendRedirect("adminDashboard.jsp");

        }else{

            response.sendRedirect("adminLogin.jsp");
        }
    }
}