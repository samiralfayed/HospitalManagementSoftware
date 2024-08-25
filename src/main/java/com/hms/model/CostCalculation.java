/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.hms.model;

/**
 *
 * @author samir
 */
public interface CostCalculation {
   double calculateTestCost();

    /**
     * Calculates the total cost for a given number of pathological tests.
     *
     * @param numberOfTests the number of tests to be conducted
     * @return the total cost for the tests
     */
    double calculateTotalCost(int numberOfTests);

    /**
     * Applies a discount to the test cost.
     *
     * @param discountPercentage the discount percentage to be applied
     * @return the cost after applying the discount
     */
    double applyDiscount(double discountPercentage);  
}
