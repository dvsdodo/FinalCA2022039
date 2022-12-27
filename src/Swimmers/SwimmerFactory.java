/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swimmers;

import GeneratorsName.RandonSwimmer;

/**
 *
 * @author dvsdo
 */
public class SwimmerFactory {
    
    /**
     * @return a random swimmer 
     */    
    public String[] nameGeneratorSwimmer (){
        RandonSwimmer GN = new RandonSwimmer();
        String name = GN.getRandomName();
        return name.split(" ");
        
    }
    
    /**
     * @return a swimmer
     */
     public Swimmers getSwimmer() {
         RandonSwimmer RS = new RandonSwimmer();
         String[] name = nameGeneratorSwimmer();
         return new Swimmer(name[0], name[1]);
     }
    
}
