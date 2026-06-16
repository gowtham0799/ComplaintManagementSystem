package com.cms.servlet;

import java.io.IOException;

import com.cms.dao.EmployeeDAO;
import com.cms.dto.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        EmployeeDAO dao = new EmployeeDAO();

        Employee emp = dao.loginEmployee(email, password);

        if(emp != null) {

            HttpSession session =
                    request.getSession();

            session.setAttribute("employee", emp);

            response.sendRedirect("dashboard");

        } else {

            response.sendRedirect("login.jsp");
        }
    }
}