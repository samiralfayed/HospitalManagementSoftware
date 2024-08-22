/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

/**
 *
 * @author samir
 */
public class LabTest {

    protected String title;
    protected double cost;
    protected boolean isAvailable;
   

    public LabTest() {
    }

    @Override
    public String toString() {
        return "LabTest{" + "title=" + title + ", cost=" + cost + ", isAvailable=" + isAvailable + '}';
    }

    public LabTest(String title,
          //  String reagent,
            double cost,
            boolean isAvailable) {
        this.title = title;
       // this.reagent = reagent;
        this.cost = cost;
        this.isAvailable = isAvailable;
    }

    public String returnLabTestInfo() {
        String output = "Test Name: " + this.getTitle() + "\n"+  "Cost: " + this.getCost() + "\n"
                + "Availability: " + this.isIsAvailable();
        return output;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

}
