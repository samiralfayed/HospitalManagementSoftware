/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

/**
 *
 * @author Samir Al Fayed Ifti

 */
public class PathologicalTest {
  
    private String title;
    private String testType;
    private double cost;
    private boolean isAvailable;
    
    
    public PathologicalTest( String title,
                       String testType,
                       double cost,
                       boolean isAvailable){
        this.title = title;
        this.testType = testType;
        this.cost = cost;
        this.isAvailable = isAvailable;
    }
    
    public String show(){
        String output = "Test Name: "+this.getTitle()+"\n<br>" +"Cost: "+this.getCost()+"\n<br>"+"Availability: "+this.isIsAvailable();
        return output;
    }
    
   public void search(String title){
       if (this.getTitle() == title)
           show();
       else
           System.out.println("Not Found");
       
   } 

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the cost
     */
    public double getCost() {
        return cost;
    }

    /**
     * @return the isAvailable
     */
    public boolean isIsAvailable() {
        return isAvailable;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * @param isAvailable the isAvailable to set
     */
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}
