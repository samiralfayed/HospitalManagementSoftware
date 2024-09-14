/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

/**
 *
 * @author Samir Al Fayed Ifti
 *
 */
public class PathologicalTest extends LabTest {

private String title;
    private String reagent;
    private double cost;
    private boolean isAvailable;

    public PathologicalTest(String title,
            String reagent,
            double cost,
            boolean isAvailable) {
        this.title = title;
        this.reagent = reagent;
        this.cost = cost;
        this.isAvailable = isAvailable;
    }

    public PathologicalTest() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String returnrLabTestInfo() {
        String output = "Test Name: " + this.getTitle() + "\n<br>" + "Reagent Name: " + this.getReagent() + "\n<br>" + "Cost: " + this.getCost() + "\n<br>" + "Availability: " + this.isIsAvailable();
        return output;
    }

    public String getReagent() {
        return reagent;
    }

    public void setReagent(String reagent) {
        this.reagent = reagent;
    }

    public void search(String title) {
        if (this.getTitle() == title) {
            returnrLabTestInfo();
        } else {
            System.out.println("Not Found");
        }

    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public boolean isIsAvailable() {
        return isAvailable;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String show() {

        return super.toString() + "\n" + reagent;
    }


}
