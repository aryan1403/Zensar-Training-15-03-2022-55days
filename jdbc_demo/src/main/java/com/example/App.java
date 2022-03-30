package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public final class App {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/employeedb", "root", "");
            // Statement st = con.createStatement();
            // st.execute("select * from Empdata");
            String query = "select * from Empdata";
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                System.out.println("Name: " + rs.getString("nameMeow"));
                System.out.println("Role: " + rs.getString("roleEmp"));
                System.out.println("Salary: " + rs.getInt("salary"));
                System.out.println("Meow: " + rs.getString("meow"));
            }
            con.close();
        } catch(SQLException se) {
            System.out.println(se.getMessage());
        }
    }
}
