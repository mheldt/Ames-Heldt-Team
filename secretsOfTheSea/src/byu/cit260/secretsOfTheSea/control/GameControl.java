/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.secretsOfTheSea.control;

import byu.cit260.secretsOfTheSea.model.Game;
import byu.cit260.secretsOfTheSea.model.InventoryItem;
import byu.cit260.secretsOfTheSea.model.Map;
import byu.cit260.secretsOfTheSea.model.Player;
import byu.cit260.secretsOfTheSea.model.Ships;
import java.util.HashSet;
import java.util.Set;
import secretsofthesea.SecretsOfTheSea;

/**
 *
 * @author jacieames
 */
public class GameControl {
    
    
    public static void createNewGame(Player player) {
        
        
        Game game  = new Game(); // create new game
        SecretsOfTheSea.setCurrentGame(game); // save in SecretsOfTheSea
        
        game.setPlayer(player); // save player in game
        
        
        // create the inventory list and save in the game
        InventoryItem[] inventoryMenu = GameControl.createInventoryMenu();
        
        Ships ships = new Ships(); // create new ship
        game.setShips(ships); // save ships in game
        
        Map map = MapControl.createMap(); // create and initialize the map
        MapControl.moveActorToStartingLocation(map);
        
        
    }


    public static void createHelpMenu(Player SecretsOfTheSea) {
        System.out.println("\n*** createHelpMenu stub function called ***");
    }


    public static void createNewGame(Player SecretsOfTheSea) {
        System.out.println("\n*** createGameMenu stub function called ***");
    }
    
    
     public static void createInventoryMenu(Player SecretsOfTheSea) {
        System.out.println("\n*** createQtyOfFood stub function called ***");
    }

    public static InventoryItem[] createInventoryMenu() {
        
        // create array(list) of inventory items
        
        InventoryItem[] inventory = 
                new InventoryItem[Constants.NUMBER_OF_INVENTORY_ITEMS];
        
        InventoryItem food = newInventoryItem();
        food.setDescription("Food");
        food.setQuantityInStock(Double.NaN);
        food.setRequiredAmt(Double.MIN_NORMAL);
        inventory[Item.food.ordinal()] = food;
        
        
        InventoryItem water = newInventoryItem();
        water.setDescription("Water");
        water.setQuantityInStock(Double.NaN);
        water.setRequiredAmt(Double.MIN_NORMAL);
        inventory[Item.water.ordinal()] = water;
        
        
        InventoryItem food = newInventoryItem();
        munitions.setDescription("Munitions");
        munitions.setQuantityInStock(Double.NaN);
        munitions.setRequiredAmt(Double.MIN_NORMAL);
        inventory[Item.munitions.ordinal()] = munitions;
        
        
        
    }
}
