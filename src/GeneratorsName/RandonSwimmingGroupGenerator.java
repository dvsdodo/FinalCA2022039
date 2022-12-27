/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeneratorsName;

import java.util.Random;

/**
 *
 * @author dvsdo
 */
public class RandonSwimmingGroupGenerator {
    
    protected String [] groupName ={"Shark", "Dolphin", "Turtle", "Seal", "Penguin", "Whale", "Swordfish", "Nemo", "Dora", "Mermaid", "Tuna", "Salmon", "Seahorse", "Squid", "Prawn", "Crab"};
    protected String [] numName ={"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    protected int [] numSwimmer = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
    protected String [] daysWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    
    public RandonSwimmingGroupGenerator (){
        
    }
    
    /**
     * Generates a random name using groupNames and numNames
     * @return the name as a String
     */
    public String getRandomName() {
        Random r = new Random();
        
        String gName = this.groupName[r.nextInt(groupName.length)];
        String nName = this.numName[r.nextInt(numName.length)];
        
        return (gName + " " + nName);
    }
    
    /**
     * Generates a random number using numSwimmer
     * @return the numSwimmer as an int
     */
    public int getNumSwimmer() {
        Random r = new Random();
        
        int nSwimmer = this.numSwimmer[r.nextInt(numSwimmer.length)];
        
        return nSwimmer;
    }
    
    /**
     * Generates a random name using daysWeek
     * @return the name as a String
     */
    public String getWeekDay() {
        Random r = new Random();
        
        String wDay = this.daysWeek[r.nextInt(daysWeek.length)];
        
        return wDay;
    }
    
}
