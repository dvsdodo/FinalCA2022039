/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Staff;

import java.util.ArrayList;

/**
 *
 * @author dvsdo
 */
public enum Departments {
    
    CLUBSTAFF {
        @Override
        public staff getStaff(StaffType type) {
            return type.getStaff();
        }

        @Override
        public ArrayList<StaffType> listTypes() {
            return StaffType.listClubStaff();
        }

        @Override
        public String toString() {
            return "Club Staff Department";
        }
        
    },
    
    COACHING {
        @Override
        public staff getStaff(StaffType type) {
            return type.getStaff();
        }

        @Override
        public ArrayList<StaffType> listTypes() {
            return StaffType.listCoaching();
        }

        @Override
        public String toString() {
            return "Coaching Department";
        }
        
    };
    
    //@return a Staff of a specific type
    public abstract staff getStaff (StaffType type);
    
    public abstract  ArrayList<StaffType> listTypes();
    
    public abstract String toString();
    
    
}
