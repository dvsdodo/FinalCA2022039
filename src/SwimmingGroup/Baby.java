/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwimmingGroup;

/**
 * Create a new group of swimmer and set as Baby
 * @author dvsdo
 */
public class Baby extends SwimmingGroups {

    public Baby(String nameGroup, String numName) {
        super (nameGroup, numName, GroupType.BABY);
    }
    
}
