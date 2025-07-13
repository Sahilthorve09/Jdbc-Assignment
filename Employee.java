package com.jdbchomework;

import java.sql.*;
import java.util.Scanner;

public class Employee {

   

    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1043", "root", "root");

        // CREATE
        PreparedStatement pstmtInsert = conn.prepareStatement("INSERT INTO employee VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
        pstmtInsert.setInt(1, 101);
        pstmtInsert.setString(2, "Sahil Thorve");
        pstmtInsert.setString(3, "sahilthorve@gmail.com");
        pstmtInsert.setInt(4, 30);
        pstmtInsert.setString(5, "Male");
        pstmtInsert.setString(6, "HR");
        pstmtInsert.setDouble(7, 65000.50);
        pstmtInsert.setDate(8, Date.valueOf("2004-09-14"));
        pstmtInsert.executeUpdate();
        System.out.println("Employee inserted!");

        // READ
//        PreparedStatement pstmtSelect = conn.prepareStatement("SELECT * FROM employee");
//        ResultSet rs = pstmtSelect.executeQuery();
//        System.out.println("\nEmployee Records:");
//        while (rs.next()) {
//            System.out.println(
//                rs.getInt("id") + " " +
//                rs.getString("name") + " " +
//                rs.getString("email") + " " +
//                rs.getInt("age") + " " +
//                rs.getString("gender") + " " +
//                rs.getString("department") + " " +
//                rs.getDouble("salary") + " " +
//                rs.getDate("joiningDate")
//            );
//        }

        // UPDATE (e.g. change salary and department)
//        PreparedStatement pstmtUpdate = conn.prepareStatement("UPDATE employee SET salary = ?, department = ? WHERE id = ?");
//        pstmtUpdate.setDouble(1, 72000.00);
//        pstmtUpdate.setString(2, "Finance");
//        pstmtUpdate.setInt(3, 101);
//        pstmtUpdate.executeUpdate();
//        System.out.println("\nEmployee updated!");

        // DELETE
//        PreparedStatement pstmtDelete = conn.prepareStatement("DELETE FROM employee WHERE id = ?");
//        pstmtDelete.setInt(1, 101);
//        pstmtDelete.executeUpdate();
//        System.out.println("\nEmployee deleted!");

        conn.close();
    }
}
