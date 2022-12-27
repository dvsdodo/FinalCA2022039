/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubStaff;

import Staff.ClubStaff;
import Staff.StaffType;

/**
 * Create a new ClubStaff and set role as Caretaker
 * @author dvsdo
 */
public class Caretaker extends ClubStaff {
    
    public Caretaker (String firstName, String surName) {
        
        super (firstName, surName, StaffType.CARETAKER);
    }
    
}
