/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

/**
 *
 * @author samir
 */
public class User {
    
     // Attributes
    String username;
    String password;
    boolean isLoggedIn;

    // Constructor
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.isLoggedIn = false; // Initially not logged in
    }

    // Method to display login information
    String show() {
        String output = "Username: " + this.username + "<br>" + "Logged In: " + this.isLoggedIn;
        return output;
    }

    // Method to handle login
    void login(String username, String password) {
        // Example hardcoded credentials (Replace with real authentication in practice)
        if (this.username.equals(username) && this.password.equals(password)) {
            this.isLoggedIn = true;
            System.out.println("Login successful!");
            System.out.println(show());
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    // Method to handle logout
    void logout() {
        if (this.isLoggedIn) {
            this.isLoggedIn = false;
            System.out.println("Logged out successfully.");
        } else {
            System.out.println("Already logged out.");
        }
    
}
}
