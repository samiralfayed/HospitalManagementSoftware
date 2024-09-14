/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

import java.util.ArrayList;

/**
 *
 * @author samir
 */
public class PathologicalTestSearchInfo {
    
     private static ArrayList<PathologicalTest> testList = new ArrayList<>();

    // Static block to initialize some test data
    static {
        testList.add(new PathologicalTest("Blood Test", "Reagent A", 100, true));
        testList.add(new PathologicalTest("Urine Test", "Reagent B", 50, false));
        testList.add(new PathologicalTest("X-Ray", "Reagent C", 200, true));
        testList.add(new PathologicalTest("MRI Scan", "Reagent D", 500, true));
        testList.add(new PathologicalTest("CT Scan", "Reagent E", 400, false));
    }

    // Method to get the test list
    public static ArrayList<PathologicalTest> getTestList() {
        return testList;
    }
    
}
