/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swimmers;

import SwimmingGroup.GroupType;
import java.util.Random;

/**
 * Create a new Swimmer
 * @author dvsdo
 */
public class Swimmer extends Swimmers {

    public Swimmer(String firstname, String surname) {
       // type = Grouptype();
        super (firstname, surname, GroupType.Grouptype());
    }

}
