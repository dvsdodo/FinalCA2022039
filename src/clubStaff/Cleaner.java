/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubStaff;

import Staff.ClubStaff;
import Staff.StaffType;

/**
 * Create a new ClubStaff and set role as Cleaner
 * @author dvsdo
 */
public class Cleaner extends ClubStaff{
    
        public Cleaner (String firstName, String surName){

            super (firstName, surName, StaffType.CLEANER);
        }
    
}
