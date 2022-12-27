/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwimmingGroup;

import GeneratorsName.RandonSwimmingGroupGenerator;

/**
 *
 * @author dvsdo
 */
public abstract class SwimmingGroups {
    
    /*
    *All groups have a ID as well as basic details 
    *They are all assigned a group type
    */
    
    private String groupName;
    private String numName;
    private int groupID;
    private GroupType type; //specific type 
    private int numSwimmer; //number swimmers
    private String dayWeek; //which day of week
    
    private static int currentGroupNum = 1;
    
    public SwimmingGroups (String groupName, String numName, GroupType type) {
        
        this.groupName = groupName;
        this.numName = numName;
        this.groupID = newGroupID(); // Generetes a new ID number
        this.type = type;
        this.numSwimmer = getNumSwimmer();
        this.dayWeek = getDaysWeek();
        
    }
    
    private int newGroupID() {
        //create ID
        this.currentGroupNum++;
        return this.currentGroupNum;
    }
    
    /**
     * Generates a random number of Swimmers
     * @return numSwimmer as an int
     */
    private static int getNumSwimmer() {
        RandonSwimmingGroupGenerator getSwimmer = new RandonSwimmingGroupGenerator();
        int numSwimmer = getSwimmer.getNumSwimmer();
        return numSwimmer;
    }

    /**
     * Generates a random week day
     * @return wDay as a String
     */
    private static String getDaysWeek() {
        RandonSwimmingGroupGenerator getDayWeek = new RandonSwimmingGroupGenerator();
        String wDay = getDayWeek.getWeekDay();
        return wDay;
    }
    
    @Override
    public String toString(){
        String detalis;
        detalis = "*********\n Name of Group: " + this.groupName + " " + this.numName + "\n Type of Group: " + this.type + "\n Group ID:  " + this.groupID + "\n Number of Swimmers: " + this.numSwimmer + "\n Day of week: " + this.dayWeek + "\n    \n"; 
        return detalis;
    }
    
    public GroupType getGroup(){
        return this.type;
    }
    
    public String getDayWeek(){
        return this.dayWeek;
    }
        
}
