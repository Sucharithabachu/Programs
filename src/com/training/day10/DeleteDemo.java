package com.training.day10;

import java.sql.*;

public class DeleteDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "root26";

        try {
            // 1. Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create Connection
            Connection con = DriverManager.getConnection(url, user, password);

            // 3. Create PreparedStatement for DELETE
            String sql = "DELETE FROM employees_data WHERE EmpId = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);

            // 4. Set parameter (ID to delete)
            pstmt.setInt(1, 104);

            // 5. Execute Delete
            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Employee record deleted successfully!");
            } else {
                System.out.println("No record found with the given EmpId.");
            }

            // 6. Close resources
            pstmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
