package com.jdbchomework;
import java.sql.*;

public class Student {

    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1043", "root", "root");
        Statement stmt = conn.createStatement();

        // CREATE
        stmt.executeUpdate("INSERT INTO student VALUES (1, 'Sahl Thorve', 'sahilthorve@gmail.com', 20, 'Male', 'Computer Science')");
        System.out.println("Record Inserted");

        // READ
        ResultSet rs = stmt.executeQuery("SELECT * FROM student");
        while (rs.next()) {
            System.out.println(
                rs.getInt("id") + " " +
                rs.getString("name") + " " +
                rs.getString("email") + " " +
                rs.getInt("age") + " " +
                rs.getString("gender") + " " +
                rs.getString("department")
            );
        }

        // UPDATE
//        stmt.executeUpdate("UPDATE student SET name='Sahil Thorve', age=22 WHERE id=1");
//        System.out.println("Record Updated");

        // DELETE
//        stmt.executeUpdate("DELETE FROM student WHERE id=1");
//        System.out.println("Record Deleted");

      
        conn.close();
    }
}
