/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.secretsOfTheSea.control;

import byu.cit260.secretsOfTheSea.model.Food;
import byu.cit260.secretsOfTheSea.model.Player;
import secretsofthesea.SecretsOfTheSea;

/**
 *
 * @author jacieames
 */
public class ProgramControl {

    public static Player createPlayer(String name) {
        System.out.println("\n**** createPlayer function called ****");
        
      if (name == null ) {  
        return null;
    }
    
    Player player = new Player ();
    player.setName(name);
    
    SecretsOfTheSea.setPlayer(player); // save the player
    
    return player;
    
    }

    public static Food createFood(String foodNeeded) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
