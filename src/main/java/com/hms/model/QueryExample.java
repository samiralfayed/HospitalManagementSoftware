/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samir
 */
public class QueryExample {

    public static void main(String[] args) {
        String query = "SELECT * FROM Patients";

        // Use try-with-resources to manage connection, statement, and result set
        try (Connection conn = MySQLConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {

            // Process the result set
            while (rs.next()) {
                int patientId = rs.getInt("patient_id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age);
            }

        } catch (SQLException ex) {
            Logger.getLogger(QueryExample.class.getName()).log(Level.SEVERE, "Query execution error", ex);
        }
    }

}
