package com.cms.servlet;

import java.io.IOException;

import com.cms.dao.EmployeeDAO;
import com.cms.dto.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("Register Servlet Called");

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String department = request.getParameter("department");

        Employee emp = new Employee();

        emp.setName(name);
        emp.setEmail(email);
        emp.setPassword(password);
        emp.setDepartment(department);

        EmployeeDAO dao = new EmployeeDAO();

        boolean status = dao.registerEmployee(emp);
        System.out.println("Status = " + status);

        if(status){
            response.sendRedirect("login.jsp");
        } else {
            response.sendRedirect("error.jsp");
        }
    }
}