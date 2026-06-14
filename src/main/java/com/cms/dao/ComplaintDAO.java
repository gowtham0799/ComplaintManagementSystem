package com.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.cms.dto.Complaint;
import com.cms.util.DBConnection;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ComplaintDAO {

    public boolean raiseComplaint(Complaint complaint) {

        try {

            Connection con = DBConnection.getConnection();

            String query =
            "INSERT INTO complaint(title,description,status,employee_id) VALUES(?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(1, complaint.getTitle());
            ps.setString(2, complaint.getDescription());
            ps.setString(3, complaint.getStatus());
            ps.setInt(4, complaint.getEmployeeId());

            int rows = ps.executeUpdate();

            return rows > 0;

        } catch(Exception e) {
            e.printStackTrace();
        }

        return false;
    }
    public ArrayList<Complaint> getComplaintsByEmployee(int employeeId) {

    ArrayList<Complaint> list = new ArrayList<>();

    try {

        Connection con = DBConnection.getConnection();

        String query =
                "SELECT * FROM complaint WHERE employee_id=?";

        PreparedStatement ps =
                con.prepareStatement(query);

        ps.setInt(1, employeeId);

        ResultSet rs = ps.executeQuery();

        while(rs.next()) {

            Complaint complaint = new Complaint();

            complaint.setId(rs.getInt("id"));
            complaint.setTitle(rs.getString("title"));
            complaint.setDescription(rs.getString("description"));
            complaint.setStatus(rs.getString("status"));

            list.add(complaint);
        }

    } catch(Exception e) {
        e.printStackTrace();
    }

    return list;
}
public ArrayList<Complaint> getAllComplaints() {

    ArrayList<Complaint> list = new ArrayList<>();

    try {

        Connection con = DBConnection.getConnection();

        String query = "SELECT * FROM complaint";

        PreparedStatement ps =
                con.prepareStatement(query);

        ResultSet rs = ps.executeQuery();

        while(rs.next()) {

            Complaint complaint = new Complaint();

            complaint.setId(rs.getInt("id"));
            complaint.setTitle(rs.getString("title"));
            complaint.setDescription(rs.getString("description"));
            complaint.setStatus(rs.getString("status"));
            complaint.setEmployeeId(rs.getInt("employee_id"));

            list.add(complaint);
        }

    } catch(Exception e) {
        e.printStackTrace();
    }

    return list;
}
public boolean updateStatus(int id, String status) {

    try {

        Connection con = DBConnection.getConnection();

        String query =
                "UPDATE complaint SET status=? WHERE id=?";

        PreparedStatement ps =
                con.prepareStatement(query);

        ps.setString(1, status);
        ps.setInt(2, id);

        int rows = ps.executeUpdate();

        return rows > 0;

    } catch(Exception e) {
        e.printStackTrace();
    }

    return false;
}
}