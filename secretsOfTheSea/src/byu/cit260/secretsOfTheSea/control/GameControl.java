package byu.cit260.secretsOfTheSea.control;

import byu.cit260.secretsOfTheSea.model.Game;
//import byu.cit260.secretsOfTheSea.model.InventoryItem;
import byu.cit260.secretsOfTheSea.model.Map;
import byu.cit260.secretsOfTheSea.model.Player;
import byu.cit260.secretsOfTheSea.model.Ships;
//import java.util.HashSet;
//import java.util.Set;
import secretsofthesea.SecretsOfTheSea;

/**
 *
 * @author jacieames
 */
public class GameControl {
 
    /**
    public static void createNewGame(Player player) {
        
        Game game  = new Game(); // create new game
        SecretsOfTheSea.setCurrentGame(game); // save in SecretsOfTheSea
        
        game.setPlayer(player); // save player in game
        
        // create the inventory list and save in the game
        //InventoryItem[] inventoryMenu = GameControl.createInventoryMenu();
        
        Ships ships = new Ships(); // create new ship
        game.setShips(ships); // save ships in game
        
        //Map map = MapControl.createMap(); // create and initialize the map
        //MapControl.moveActorToStartingLocation(map);  
    }
     * @param SecretsOfTheSea
    **/

    public static void createHelpMenu(Player SecretsOfTheSea) {
        //System.out.println("\n*** createHelpMenu stub function called ***");
    }


    public static void createNewGame(Player SecretsOfTheSea) {
        //System.out.println("\n*** createGameMenu stub function called ***");
    }
    
    
    public static void createInventoryMenu(Player SecretsOfTheSea) {
        //System.out.println("\n*** createInventoryMenu stub function called ***");
    }

    public static void createGameMenu(Player SecretsOfTheSea) {
        //System.out.println("\n*** createGameMenu stub function called ***");
        
    }
}
