/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coaching;

import Staff.Coaching;
import Staff.StaffType;

/**
 * Create a new Coaching and set role as Assistant Swim Teacher
 * @author dvsdo
 */
public class SwimTeacher extends Coaching{
    
    public SwimTeacher (String firstName, String surName) {
        
        super (firstName, surName, StaffType.SWIMTEACHER);
        
    }
    
}
