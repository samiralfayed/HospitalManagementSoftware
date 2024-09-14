/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.controller;

import com.hms.model.RadiologicalTest;

/**
 *
 * @author samir
 */
public class RadiologicalTestController {

    RadiologicalTest rTest;

    public void initializeRadiologicalTest(String title, double cost, String plateDimention, boolean isAvailable) {
        rTest = new RadiologicalTest(title, cost, plateDimention, isAvailable);
    }

    public String returnrLabTestInfo() {
        String rTestInfo = rTest.show();
        return rTestInfo;
    }
}
