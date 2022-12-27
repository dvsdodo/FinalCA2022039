/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swimmers;

import GeneratorsName.RandonSwimmer;
import SwimmingGroup.GroupType;

/**
 *
 * @author dvsdo
 */
public abstract class Swimmers {
    
    /*
    *All swimmers have a ID number as well as basic details
    *They are all assined a Group type
    */
    private String firstname;
    private String surname;
    private int swimmerID;
    private int age; // age
    private GroupType type; //Specific type
    
    private static int currentSwimmerNum = 1000;
    
    public Swimmers (String firstname, String surname, GroupType type) {
        
        this.firstname = firstname;
        this.surname = surname;
        this.swimmerID = newIDSwimmer(); // Generetes a new ID number
        this.age = age;
        this.type = type;
        
    }
    
    private int newIDSwimmer() {
        
        this.currentSwimmerNum++;
        return this.currentSwimmerNum;
        
    }
    
    @Override
    public String toString(){
        String details;
        details = "*********\n Name of Swimmer: " + this.firstname + " " + this.surname + "\n ID Swimmer: " + this.swimmerID + "\n Type of Group: " + this.type + "\n    \n";
        return details;
    }
    
    public GroupType getGroup(){
        return this.type;
    }
    
}
