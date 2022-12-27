/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwimmingGroup;

import java.util.Random;

/**
 *
 * @author dvsdo
 */
public class GroupFactory {
    
    /**
     * @return a random group
     */
    public SwimmingGroups getSwimmerGroup () {
        Random r = new Random();
        GroupType[] types = GroupType.values();
        int number = r.nextInt(types.length);
        return getSwimmingGroup(types[number]);
    }
    
    /**
     * 
     * @param type
     * @return a group of a specific type
     */
    public SwimmingGroups getSwimmingGroup (GroupType type) {
        return type.getGroup();
    }
}
