package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public final class App {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Register the Driver
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

            String query = "insert into test1 values(?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, "P"); // name
            ps.setInt(2, 45); // age
            ps.setInt(3, 34); // salary

            if(ps.execute()) {
                System.out.println("Inserted");
            }
            con.close();
        } catch(SQLException | ClassNotFoundException se) {
            System.out.println(se.getMessage());
        }
    }
}
