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
public class GeneratorsName {
    
    protected String [] firstNames = {"Davison", "Ivanilda", "Fabio", "Lucas", "Felipe", "Ana Paula", "Leila", "Paixao", "Kennedy", "Jair", "Karem", "Gabriela", "Xade", "Helenice", "Gustavo", "Benjamin", "Danilela", "Rafael", "Eduardo", "Sonia", "Leonardo", "Anderson", "Fred", "Fernando", "Fatima", "Gleydson", "Marcelino", "Nana", "Eliane", "Yasmin", "Victor", "Vincent", "Vegeta", "Bulma", "Goku", "Amanda"};
    protected String [] surNames = {"Ferreira", "Antonio", "Vendramini", "Martines", "Beraldo", "Queiros", "Oliveira", "Silva", "Santos", "Furquin", "Guedes", "Chaves"};
    protected int [] level = {1, 2, 3, 4};
    
    public GeneratorsName (){
        
    }
    
    /**
     * Generates a random name using firstNames and surNames
     * @return the name as a String
     */
    public String getRandomName() {
        Random r = new Random();
        
        String fname = this.firstNames[r.nextInt(firstNames.length)];
        String sname = this.surNames[r.nextInt(surNames.length)];
        
        return (fname + " " + sname);
    }
     /**
      * Generates a random level using level
      * @return the level as an int
      */
    public int getRandomLevel() {
        Random r = new Random();
        
        int lvel = this.level[r.nextInt(level.length)];
        
        return lvel;
    }
}
