/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwimmingGroup;

/**
 * Create a new group of swimmer and set as Adult
 * @author dvsdo
 */
public class Adult extends SwimmingGroups {

    public Adult(String nameGroup, String numName) {
        super (nameGroup, numName, GroupType.ADULT);
    }
    
}
