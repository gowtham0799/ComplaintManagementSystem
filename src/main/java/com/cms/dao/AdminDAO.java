package com.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cms.dto.Admin;
import com.cms.util.DBConnection;

public class AdminDAO {

    public Admin loginAdmin(String username,String password){

        try{

            Connection con = DBConnection.getConnection();

            String query =
            "SELECT * FROM admin WHERE username=? AND password=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if(rs.next()){

                Admin admin = new Admin();

                admin.setId(rs.getInt("id"));
                admin.setUsername(rs.getString("username"));

                return admin;
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        return null;
    }
}