/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwimmingGroup;

import GeneratorsName.RandonSwimmingGroupGenerator;
import java.util.Random;

/**
 *
 * @author dvsdo
 */
public enum GroupType {
    
    BABY{
        @Override
        public SwimmingGroups getGroup() {
            RandonSwimmingGroupGenerator RSG = new RandonSwimmingGroupGenerator();
            String[] name = nameGeneratorGroup();
            return new Baby(name[0],name[1]);
        }

        @Override
        public String toString() {
            return "Baby";
        }
        
    },
    
    CHILD{
        @Override
        public SwimmingGroups getGroup() {
            RandonSwimmingGroupGenerator RSG = new RandonSwimmingGroupGenerator();
            String[] name = nameGeneratorGroup();
            return new Child(name[0], name[1]);
        }

        @Override
        public String toString() {
            return "Child";
        }
        
    },
    
    KID{
        @Override
        public SwimmingGroups getGroup() {
            RandonSwimmingGroupGenerator RSG = new RandonSwimmingGroupGenerator();
            String[] name = nameGeneratorGroup();
            return new Kid(name[0], name[1]);
        }

        @Override
        public String toString() {
            return "Kid";
        }
        
    },
    
    TEENAGER{
        @Override
        public SwimmingGroups getGroup() {
            RandonSwimmingGroupGenerator RSG = new RandonSwimmingGroupGenerator();
            String[] name = nameGeneratorGroup();
            return new Teenager(name[0], name[1]);
        }

        @Override
        public String toString() {
            return "Teenager";
        }
        
    },
    
    ADULT{
        @Override
        public SwimmingGroups getGroup() {
            RandonSwimmingGroupGenerator RSG = new RandonSwimmingGroupGenerator();
            String[] name = nameGeneratorGroup();
            return new Adult(name[0], name[1]);
        }

        @Override
        public String toString() {
            return "Adult";
        }
        
    },
    
    EXPERIENT{
        @Override
        public SwimmingGroups getGroup() {
            RandonSwimmingGroupGenerator RSG = new RandonSwimmingGroupGenerator();
            String[] name = nameGeneratorGroup();
            return new Experient(name[0], name[1]);
        }

        @Override
        public String toString() {
            return "Experient";
        }
        
    },
    
    ELDER{
        @Override
        public SwimmingGroups getGroup() {
            RandonSwimmingGroupGenerator RSG = new RandonSwimmingGroupGenerator();
            String[] name = nameGeneratorGroup();
            return new Elder(name[0], name[1]);
        }

        @Override
        public String toString() {
            return "Elder";
        }
        
    };
    
    public abstract SwimmingGroups getGroup();
    public abstract String toString();
    
    // Generates a Random group name
    private static String[] nameGeneratorGroup() {
        RandonSwimmingGroupGenerator RSG = new RandonSwimmingGroupGenerator();
        String name = RSG.getRandomName();
        return name.split(" ");
    }
    
    /**
     * 
     * @return All available types as a formatted multi-line String
     */
    public static String listSwimmerGroupTypes() {
        
        String list = "";
        GroupType[] types = GroupType.values();
        
        for (int counter = 0; counter < types.length; counter++){
            
            list = list.concat((counter + 1) + ": " + types[counter].toString() + "s \n");
        }
        return list;
    }
        
    public static GroupType Grouptype(){
        
        return GroupType.values()[new Random().nextInt(GroupType.values().length)];
    }
    
}
