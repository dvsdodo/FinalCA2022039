/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Staff;

/**
 *
 * @author dvsdo
 */
public abstract class Coaching extends staff{
    
    public Coaching (String firstName, String surName, StaffType role){
        
        super (firstName, surName, Departments.COACHING, role);
        
    }
    
}
