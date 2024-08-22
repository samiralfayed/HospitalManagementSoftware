/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

/**
 *
 * @author samir
 */
public class RadiologicalTest extends LabTest {

  private  String plateDimention;

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
    public String returnLabTestInfo() {
        String output = "Test Name: " + this.getTitle() + "\n<br>"+ "Cost: " + this.getCost() + "\n<br>" + "plate Dimention: " + this.getTitle()+ "\n<br>" + "Availability: " + this.isIsAvailable();
        return output;
    }

}
