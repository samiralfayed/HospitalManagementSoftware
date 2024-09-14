/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.hms.model;

/**
 *
 * @author samir
 */
public interface PathologicalTestCostCalculation {
    
 double calculateTestCost();

    // Calculate the total cost for a given number of tests.
    default double calculateTotalCost(int numberOfTests) {
        return calculateTestCost() * numberOfTests;
    }

    // Apply a discount to the total cost based on the provided discount percentage.
    default double applyDiscount(double discountPercentage) {
        double totalCost = calculateTotalCost(1); // Assuming single test cost without discount
        double discountAmount = totalCost * (discountPercentage / 100);
        return totalCost - discountAmount;
}
}
