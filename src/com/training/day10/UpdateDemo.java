package com.training.day10;

import java.sql.*;

public class UpdateDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "root26";

        try {
            // 1. Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create Connection
            Connection con = DriverManager.getConnection(url, user, password);

            // 3. Create PreparedStatement
            String sql = "UPDATE employees_data SET Salary = ? WHERE EmpId = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);

            // 4. Set parameters
            pstmt.setDouble(1, 2000000); // New salary
            pstmt.setInt(2, 101);      // Employee ID to update

            // 5. Execute Update
            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Employee record updated successfully!");
            }

            // 6. Close resources
            pstmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
