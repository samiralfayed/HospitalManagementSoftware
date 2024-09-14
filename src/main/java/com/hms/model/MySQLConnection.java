package com.hms.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Provides a method to establish and test a connection to a MySQL database.
 * 
 * @author Samir Al Fayed Ifti
 */
public class MySQLConnection {

 // Database URL, username, and password
    private static final String URL = "jdbc:mysql://localhost:3306/hms";
    private static final String USER = "root";
    private static final String PASSWORD = "@Samir1691997";

    /**
     * Establishes and returns a connection to the MySQL database.
     * 
     * @return Connection object
     * @throws SQLException if a database access error occurs
     */
    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish the connection
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection established successfully.");
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Connection failed.");
            e.printStackTrace();
            throw e; // Rethrow to indicate failure
        }
        return connection;
    }

    public static void main(String[] args) {
        // Use try-with-resources to manage the connection
        try (Connection conn = getConnection()) {
            // Connection is established, now it is safe to use it
            // Perform any database operations here

        } catch (SQLException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, "Connection error", ex);
        }
    }
}
