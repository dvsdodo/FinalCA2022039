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
public class RandonSwimmer {
    
    protected String [] firstname = {"Dodo", "Binho", "Lucas", "Vanilda", "Lipe", "Patal", "Paixao", "Guegue", "Rose", "Diego", "Edvania", "Thiago", "Tiago", "Alex", "Gordinho", "Verano", "Pedrones", "Pedrao", "Barba", "Camis", "Mandinha", "Aninha", "Magruts", "Ze", "Casca", "Corote", "Yasmin", "Duda", "Eloa", "Patrik", "Cleu", "Mustafa", "Anastasia", "Aldana", "Ken", "Michael", "Mika"};
    protected String [] surname = {"Ferreira", "Fenomeno", "Sayjin", "Kakaroto", "Saitama", "Luke", "Terry", "Conrinthians", "Timao", "Pumba", "Ikki", "Saya", "Titi", "Kira", "Akira", "Kiko", "Chaves", "Madruga", "Florinda", "Barriga", "Manoca", "Trunks", "Hakuna", "Matata"};
    
    public RandonSwimmer() {
        
    }
    
    /**
     * Generates a random name using firstnames and surnames
     * @return the name as a String
     */
    public String getRandomName() {
        Random r = new Random();
        
        String fname = this.firstname[r.nextInt(firstname.length)];
        String sname = this.surname[r.nextInt(surname.length)];
        
        return (fname + " " + sname);
    }
    
}
