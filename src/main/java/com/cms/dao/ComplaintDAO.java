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
"INSERT INTO complaint " +
"(title,description,category,priority,status,employee_id) " +
"VALUES(?,?,?,?,?,?)";
            PreparedStatement ps =
                    con.prepareStatement(query);

           ps.setString(1, complaint.getTitle());
ps.setString(2, complaint.getDescription());
ps.setString(3, complaint.getCategory());
ps.setString(4, complaint.getPriority());
ps.setString(5, complaint.getStatus());
ps.setInt(6, complaint.getEmployeeId());

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

            complaint.setCategory(
                    rs.getString("category"));

            complaint.setPriority(
                    rs.getString("priority"));

            complaint.setStatus(
                    rs.getString("status"));

            complaint.setEmployeeId(
                    rs.getInt("employee_id"));

            complaint.setCreatedAt(
                    rs.getTimestamp("created_at"));

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

    complaint.setCategory(
            rs.getString("category"));

    complaint.setPriority(
            rs.getString("priority"));

    complaint.setStatus(
            rs.getString("status"));

    complaint.setEmployeeId(
            rs.getInt("employee_id"));

    complaint.setCreatedAt(
            rs.getTimestamp("created_at"));

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
public ArrayList<Complaint> searchComplaints(String keyword) {

    ArrayList<Complaint> list =
            new ArrayList<>();

    try {

        Connection con =
                DBConnection.getConnection();

        String query =
                "SELECT * FROM complaint WHERE title LIKE ?";

        PreparedStatement ps =
                con.prepareStatement(query);

        ps.setString(1, "%" + keyword + "%");

        ResultSet rs =
                ps.executeQuery();

        while(rs.next()) {

            Complaint c =
                    new Complaint();

            c.setId(
                    rs.getInt("id"));

            c.setTitle(
                    rs.getString("title"));

            c.setDescription(
                    rs.getString("description"));

            c.setStatus(
                    rs.getString("status"));

            list.add(c);
        }

    } catch(Exception e) {
        e.printStackTrace();
    }

    return list;
}
public int getTotalComplaints() {

    int count = 0;

    try {

        Connection con = DBConnection.getConnection();

        PreparedStatement ps =
        con.prepareStatement(
        "SELECT COUNT(*) FROM complaint");

        ResultSet rs = ps.executeQuery();

        if(rs.next()) {
            count = rs.getInt(1);
        }

    } catch(Exception e) {
        e.printStackTrace();
    }

    return count;
}
public int getPendingComplaints() {

    int count = 0;

    try {

        Connection con = DBConnection.getConnection();

        PreparedStatement ps =
        con.prepareStatement(
        "SELECT COUNT(*) FROM complaint WHERE status='Pending'");

        ResultSet rs = ps.executeQuery();

        if(rs.next()) {
            count = rs.getInt(1);
        }

    } catch(Exception e) {
        e.printStackTrace();
    }

    return count;
}
/**
 * @return
 */
public int getResolvedComplaints() {

    int count = 0;

    try {

        Connection con = DBConnection.getConnection();

        PreparedStatement ps =
        con.prepareStatement(
        "SELECT COUNT(*) FROM complaint WHERE status='Resolved'");

        ResultSet rs = ps.executeQuery();

        if(rs.next()) {
            count = rs.getInt(1);
        }

    } catch(Exception e) {
        e.printStackTrace();
    }

    return count;
}
public int getInProgressComplaints() {

    int count = 0;

    try {

        Connection con = DBConnection.getConnection();

        PreparedStatement ps =
        con.prepareStatement(
        "SELECT COUNT(*) FROM complaint WHERE status='In Progress'");

        ResultSet rs = ps.executeQuery();

        if(rs.next()) {
            count = rs.getInt(1);
        }

    } catch(Exception e) {
        e.printStackTrace();
    }

    return count;
}
public int getEmployeeTotalComplaints(int employeeId) {

    int count = 0;

    try {

        Connection con = DBConnection.getConnection();

        PreparedStatement ps =
        con.prepareStatement(
        "SELECT COUNT(*) FROM complaint WHERE employee_id=?");

        ps.setInt(1, employeeId);

        ResultSet rs = ps.executeQuery();

        if(rs.next()) {
            count = rs.getInt(1);
        }

    } catch(Exception e) {
        e.printStackTrace();
    }

    return count;
}
public int getEmployeePendingComplaints(int employeeId) {

    int count = 0;

    try {

        Connection con = DBConnection.getConnection();

        PreparedStatement ps =
        con.prepareStatement(
        "SELECT COUNT(*) FROM complaint WHERE employee_id=? AND status='Pending'");

        ps.setInt(1, employeeId);

        ResultSet rs = ps.executeQuery();

        if(rs.next()) {
            count = rs.getInt(1);
        }

    } catch(Exception e) {
        e.printStackTrace();
    }

    return count;
}
public int getEmployeeInProgressComplaints(int employeeId) {

    int count = 0;

    try {

        Connection con = DBConnection.getConnection();

        PreparedStatement ps =
        con.prepareStatement(
        "SELECT COUNT(*) FROM complaint WHERE employee_id=? AND status='In Progress'");

        ps.setInt(1, employeeId);

        ResultSet rs = ps.executeQuery();

        if(rs.next()) {
            count = rs.getInt(1);
        }

    } catch(Exception e) {
        e.printStackTrace();
    }

    return count;
}
public int getEmployeeResolvedComplaints(int employeeId) {

    int count = 0;

    try {

        Connection con = DBConnection.getConnection();

        PreparedStatement ps =
        con.prepareStatement(
        "SELECT COUNT(*) FROM complaint WHERE employee_id=? AND status='Resolved'");

        ps.setInt(1, employeeId);

        ResultSet rs = ps.executeQuery();

        if(rs.next()) {
            count = rs.getInt(1);
        }

    } catch(Exception e) {
        e.printStackTrace();
    }

    return count;
}
public ArrayList<Complaint> searchEmployeeComplaints(
        String keyword,
        int employeeId) {

    ArrayList<Complaint> list =
            new ArrayList<>();

    try {

        Connection con =
                DBConnection.getConnection();

        String query =
        "SELECT * FROM complaint " +
        "WHERE employee_id=? AND title LIKE ?";

        PreparedStatement ps =
                con.prepareStatement(query);

        ps.setInt(1, employeeId);
        ps.setString(2, "%" + keyword + "%");

        ResultSet rs =
                ps.executeQuery();

        while(rs.next()) {

            Complaint c =
                    new Complaint();

            c.setId(rs.getInt("id"));
            c.setTitle(rs.getString("title"));
            c.setDescription(rs.getString("description"));
            c.setCategory(rs.getString("category"));
            c.setPriority(rs.getString("priority"));
            c.setStatus(rs.getString("status"));

            list.add(c);
        }

    } catch(Exception e) {
        e.printStackTrace();
    }

    return list;
}
}