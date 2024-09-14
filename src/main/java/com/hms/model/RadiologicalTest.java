/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

import java.util.logging.Logger;

/**
 *
 * @author samir
 */
public class RadiologicalTest extends LabTest{

    private String plateDimention;
    private static final Logger LOG = Logger.getLogger(RadiologicalTest.class.getName());

    public RadiologicalTest() {
    }

    public RadiologicalTest(String title,
            double cost,
            String plateDimention,
            boolean isAvailable) {
        super(title, cost, isAvailable); // Call the superclass constructor
        this.title = title;
        this.cost = cost;
        this.plateDimention = plateDimention;
        this.isAvailable = isAvailable;
    }

    @Override
    public String returnrLabTestInfo() {
        String output = "Test Name: " + this.getTitle() + "\n<br>" + "Cost: " + this.getCost() + "\n<br>" + "plate Dimention: " + this.getTitle() + "\n<br>" + "Availability: " + this.isIsAvailable();
        return output;
    }

    /**
     * @return the plateDimention
     */
    private String getPlateDimention() {
        return plateDimention;
    }

    /**
     * @param plateDimention the plateDimention to set
     */
    private void setPlateDimention(String plateDimention) {
        this.plateDimention = plateDimention;
    }

    public String show() {
        String output = "Test Name: " + this.getTitle() + "\n<br>" + "plate Dimention: " + this.getPlateDimention() + "\n<br>" + "Cost: " + this.getCost() + "\n<br>" + "Availability: " + this.isIsAvailable();
        return output;
    }
}