/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.secretsOfTheSea.control;

import byu.cit260.secretsOfTheSea.exceptions.ProgramControlExceptions;
import byu.cit260.secretsOfTheSea.model.Food;
import byu.cit260.secretsOfTheSea.model.Player;
import secretsofthesea.SecretsOfTheSea;

/**
 *
 * @author jacieames
 */

//Original Code

/** 
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

    public static void  createFood(String foodNeeded) {
        return null;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
*/


public class ProgramControl {

    public static Player createPlayer(String name) throws ProgramControlExceptions {
        throws ProgramControlExceptions{
        
        if (name == null ) {  
            throw new ProgramControlExceptions("Cannot create new player");
        
        
        
        }
    
        Player player = new Player ();
        player.setName(name);
    
        SecretsOfTheSea.setPlayer(player); // save the player
        
        return player; 
    }

    public static void  createFood(String foodNeeded) throws ProgramControlExceptions {
         throw new ProgramControlExceptions("Cannot create new food");
    }
    
}
