/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

/**
 *
 * @author Samir
 */
public class PathologicalTest {
    
    String title;
    double cost;
    boolean isAvailable;
    
    
    PathologicalTest( String title,
                       double cost,
                       boolean isAvailable){
        this.title = title;
        this.cost = cost;
        this.isAvailable = isAvailable;
    }
    
    String show(){
        String output = "Test Name: "+this.title+"<br>" +"Cost: "+this.cost+"<br>"+"Availability: "+this.isAvailable;
        return output;
    }
    
   void search(String title){
       if (this.title == title)
           show();
       else
           System.out.println("Not Found");
       
   } 
}
