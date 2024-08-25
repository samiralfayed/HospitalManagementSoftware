/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.controller;

import com.hms.model.PathologicalTest;

/**
 *
 * @author samir
 */
public class PathologicalTestController {

    PathologicalTest pTest;

    public void initializePathologicalTest(String title, String Reagent, double cost, boolean isAvailable) {
        pTest = new PathologicalTest(title, Reagent, cost, isAvailable);
    }

    public String returnLabTestInfo() {
        String pTestInfo = pTest.show();
        return pTestInfo;
    }

    ///
//    public double getTestCost() {
//        return pTest.calculateTestCost();
//    }
//
//    public double getTotalCostForTests(int numberOfTests) {
//        return pTest.calculateTotalCost(numberOfTests);
//    }
//
//    public double getDiscountedCost(double discountPercentage) {
//        return pTest.applyDiscount(discountPercentage);
//    }

}
