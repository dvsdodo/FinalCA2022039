/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Staff;

import GeneratorsName.GeneratorsName;
import java.util.ArrayList;

/**
 *
 * @author dvsdo
 */
public abstract class staff {
    
    /*
    *All staff members have a staff ID as well as basic personal details
    *They are all assigned to a Dept and have a role
    */
    
    private String firstName;
    private String surName;
    private int staffID;
    private Departments dept;//the department they work in
    private StaffType role; //specific role (or job title)
    private int level; // their level
    
    private static int currentStaffNum = 100; //Start the staff ID badges at 100
    
    //To hire a new staff member you need their name, the department where they will work, and their job title (role)
    public staff (String firstName, String surName, Departments dept, StaffType role) {
        
        this.firstName = firstName;
        this.surName = surName;
        this.staffID = newIDBadge(); //they get a new ID number
        this.dept = dept;
        this.role = role;
        this.level = getLevel(); //they get their level
    }
    
    private int newIDBadge() {
        // creating a new ID number
        this.currentStaffNum++;
        return this.currentStaffNum;
    }
    
    /**
     * Generate a random level
     * @return number of level
     */
    private static int getLevel() {
        GeneratorsName getLevel = new GeneratorsName();
        int level = getLevel.getRandomLevel();
        return level;
    }
    
    @Override
    //return the staff member's name in full
    public String toString() {
        String a ="";
        if ((this.role == StaffType.RECEPTIONIST) || (this.role == StaffType.CARETAKER) || (this.role == StaffType.CLEANER)){
            a = "\n********* \n Staff ID:\t" + this.staffID + "\nFirstname:\t" + this.firstName + "\nSurname:\t" + this.surName + "\nRole:\t" + this.role.toString();
        } else if (this.role == StaffType.HEADCOACH){
            a = "\n********* \n Staff ID:\t" + this.staffID + "\nFirstname:\t" + this.firstName + "\nSurname:\t" + this.surName + "\nRole:\t" + this.role.toString() + "\nLevel:  5\t";
        } else {
             a = "\n********* \n Staff ID:\t" + this.staffID + "\nFirstname:\t" + this.firstName + "\nSurname:\t" + this.surName + "\nRole:\t" + this.role.toString() + "\nLevel:\t" + this.level;
        }
        
        return a;
    }
        
    public StaffType getRole() {

            return this.role;
    }

    public String getfirstName() {

            return this.firstName;
    }

    public String getSurname() {

            return this.surName;
    }
        
 /*       public static ArrayList<StaffType> listClubStaff() {
            StaffType[] allClubTypes = StaffType.values();
            ArrayList<StaffType> cStaff = new ArrayList<StaffType>();
            for (StaffType t: allClubTypes) {
                if (t.whichDep() == Departments.CLUBSTAFF) {
                    cStaff.add(t);
                }
            }
            return cStaff;
        }
        
        public static ArrayList<StaffType> listCoaching() {
            StaffType[] allCoachingTypes = StaffType.values();
            ArrayList<StaffType> coachingStaff = new ArrayList<StaffType>();
            for (StaffType t: allCoachingTypes) {
                if (t.whichDep() == Departments.COACHING) {
                    coachingStaff.add(t);
                }
            }
            return coachingStaff;
        }*/
    
}
