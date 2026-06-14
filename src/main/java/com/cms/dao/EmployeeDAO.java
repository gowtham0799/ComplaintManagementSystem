package com.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cms.dto.Employee;
import com.cms.util.DBConnection;

public class EmployeeDAO {

    public boolean registerEmployee(Employee emp) {

        try {

            Connection con = DBConnection.getConnection();
            System.out.println("Connection = " + con);

            String query =
                    "INSERT INTO employee(name,email,password,department) VALUES(?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(1, emp.getName());
            ps.setString(2, emp.getEmail());
            ps.setString(3, emp.getPassword());
            ps.setString(4, emp.getDepartment());
            System.out.println(emp.getName());
            System.out.println(emp.getEmail());
            System.out.println(emp.getPassword());
            System.out.println(emp.getDepartment());

            int rows = ps.executeUpdate();

            return rows > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
    public Employee loginEmployee(String email, String password) {

    try {

        Connection con = DBConnection.getConnection();

        String query =
            "SELECT * FROM employee WHERE email=? AND password=?";

        PreparedStatement ps =
            con.prepareStatement(query);

        ps.setString(1, email);
        ps.setString(2, password);

        ResultSet rs = ps.executeQuery();

        if(rs.next()) {

            Employee emp = new Employee();

            emp.setId(rs.getInt("id"));
            emp.setName(rs.getString("name"));
            emp.setEmail(rs.getString("email"));
            emp.setDepartment(rs.getString("department"));

            return emp;
        }

    } catch(Exception e) {
        e.printStackTrace();
    }

    return null;
}
}