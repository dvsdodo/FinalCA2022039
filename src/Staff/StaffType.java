/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Staff;

import GeneratorsName.GeneratorsName;
import clubStaff.*;
import coaching.*;
import java.util.ArrayList;

/**
 *
 * @author dvsdo
 */
public enum StaffType {
    
    RECEPTIONIST{
        @Override
        public staff getStaff() {
            GeneratorsName GN = new GeneratorsName();
            String[] name = nameGenerator();
            return new Receptionist(name[0],name[1]);
        }
        /**
         * 
         * @return ClubStaff for all Club Staff sub-types
         */

        @Override
        public Departments whichDep() {
            return Departments.CLUBSTAFF;
        }
        
        @Override
        public String toString() {
            return "Receptionist";
        }
        
    },
    CLEANER{
        @Override
        public staff getStaff() {
            GeneratorsName GN = new GeneratorsName();
            String[] name = nameGenerator();
            return new Cleaner(name[0],name[1]);
        }
        /**
         * 
         * @return ClubStaff for all Club Staff sub-types
         */

        @Override
        public Departments whichDep() {
            return Departments.CLUBSTAFF;
        }
        
        @Override
        public String toString() {
            return "Cleaner";
        }
        
    },
    CARETAKER{
        @Override
        public staff getStaff() {
            GeneratorsName GN = new GeneratorsName();
            String[] name = nameGenerator();
            return new Caretaker(name[0],name[1]);
        }
        /**
         * 
         * @return ClubStaff for all Club Staff sub-types
         */

        @Override
        public Departments whichDep() {
            return Departments.CLUBSTAFF;
        }
        
        @Override
        public String toString() {
            return "Caretaker";
        }
        
    },
    HEADCOACH{
        @Override
        public staff getStaff() {
            GeneratorsName GN = new GeneratorsName();
            String[] name = nameGenerator();
            return new HeadCoach(name[0],name[1]);
        }
        /**
         * 
         * @return Coaching for all Coaching sub-types
         */

        @Override
        public Departments whichDep() {
            return Departments.COACHING;
        }
        
        @Override
        public String toString() {
            return "Head Coach";
        }
        
    },
    ASSISTANTCOACH{
        @Override
        public staff getStaff() {
            GeneratorsName GN = new GeneratorsName();
            String[] name = nameGenerator();
            return new AssistantCoach(name[0],name[1]);
        }
        /**
         * 
         * @return Coaching for all Coaching sub-types
         */

        @Override
        public Departments whichDep() {
            return Departments.COACHING;
        }
        
        @Override
        public String toString() {
            return "Assistant Coach";
        }
        

    },
    SWIMTEACHER{
        @Override
        public staff getStaff() {
            GeneratorsName GN = new GeneratorsName();
            String[] name = nameGenerator();
            return new SwimTeacher(name[0],name[1]);
        }
        /**
         * 
         * @return Coaching for all Coaching sub-types
         */

        @Override
        public Departments whichDep() {
            return Departments.COACHING;
        }
        
        @Override
        public String toString() {
            return "Swim Teacher";
        }
        
    },
        SWINTEACHER{
        @Override
        public staff getStaff() {
            GeneratorsName GN = new GeneratorsName();
            String[] name = nameGenerator();
            return new SwimTeacher(name[0],name[1]);
        }
        /**
         * 
         * @return Coaching for all Coaching sub-types
         */

        @Override
        public Departments whichDep() {
            return Departments.COACHING;
        }
        
        @Override
        public String toString() {
            return "Swim Teacher";
        }
        
    };
    
    public abstract staff getStaff();
    
    public abstract Departments whichDep();
    
    private static String[] nameGenerator() {
        
        GeneratorsName GN = new GeneratorsName();
        String name = GN.getRandomName();
        return name.split(" ");
        
    }
    
    //@return arraylist of only ClubStaff roles
    public static ArrayList<StaffType> listClubStaff() {
        StaffType[] allClubTypes = StaffType.values();
        ArrayList<StaffType> cStaff = new ArrayList<StaffType>();
        for (StaffType t: allClubTypes) {
            if (t.whichDep() == Departments.CLUBSTAFF) {
                cStaff.add(t);
            }
        }
        return cStaff;
    }

    //@return arraylist of only Coaching roles
    public static ArrayList<StaffType> listCoaching() {
        StaffType[] allCoachingTypes = StaffType.values();
        ArrayList<StaffType> coachingStaff = new ArrayList<StaffType>();
        for (StaffType t: allCoachingTypes) {
            if (t.whichDep() == Departments.COACHING) {
                coachingStaff.add(t);
            }
        }
        return coachingStaff;
    }
    
    
    
}
