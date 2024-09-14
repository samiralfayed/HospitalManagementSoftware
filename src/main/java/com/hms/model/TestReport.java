/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.hms.model;

/**
 *
 * @author samir
 */
public interface TestReport {
    String generateReport();

    String getTestTitle();

    double getTestCost();

    boolean isTestAvailable();
    
}
