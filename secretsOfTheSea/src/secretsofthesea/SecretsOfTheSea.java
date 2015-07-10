package secretsofthesea;

//import byu.cit260.secretsOfTheSea.model.Actor;
import byu.cit260.secretsOfTheSea.model.Player;
import byu.cit260.secretsOfTheSea.model.Artifacts;
import byu.cit260.secretsOfTheSea.model.Clipper;
import byu.cit260.secretsOfTheSea.model.Coins;
import byu.cit260.secretsOfTheSea.model.Dirigible;
import byu.cit260.secretsOfTheSea.model.Dock;
import byu.cit260.secretsOfTheSea.model.Food;
import byu.cit260.secretsOfTheSea.model.Fuel;
import byu.cit260.secretsOfTheSea.model.Galley;
import byu.cit260.secretsOfTheSea.model.Gems;
import byu.cit260.secretsOfTheSea.model.InventoryItem;
import byu.cit260.secretsOfTheSea.model.IronClad;
import byu.cit260.secretsOfTheSea.model.Munitions;
import byu.cit260.secretsOfTheSea.model.ObstacleMessage;
import byu.cit260.secretsOfTheSea.model.Ports;
import byu.cit260.secretsOfTheSea.model.Ships;
import byu.cit260.secretsOfTheSea.model.Submersible;
import byu.cit260.secretsOfTheSea.model.TimeClock;
import byu.cit260.secretsOfTheSea.model.TreasureItems;
import byu.cit260.secretsOfTheSea.model.Water;
import byu.cit260.secretsOfTheSea.model.Game;
import byu.cit260.secretsOfTheSea.model.LocationOfScene;
import byu.cit260.secretsOfTheSea.model.Map;
import byu.cit260.secretsOfTheSea.model.RegularTypeScene;
import byu.cit260.secretsOfTheSea.model.ResourceTypeScene;
import byu.cit260.secretsOfTheSea.model.ShipTypeScene;
import byu.cit260.secretsOfTheSea.model.Statues;
import byu.cit260.secretsOfTheSea.model.Tokens;
import byu.cit260.secretsOfTheSea.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author jacieames
 */


public class SecretsOfTheSea {

    /**
     * @param args the command line arguments
     */
    
    private static Game currentGame = null;
    private static final Player player = null;
 
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
    
       
    public static void main(String[] args) { 
        
        try {
            
            // open character stream files for end user input and output
            SecretsOfTheSea.inFile = 
                    new BufferedReader(new InputStreamReader(System.in));
                    
            SecretsOfTheSea.outFile = new PrintWriter(System.out, true);
            
            //open log file
            String filePath = "log.txt";
            SecretsOfTheSea.logFile = newPrintWriter(filePath);
            

            // create StartProgramView and start the program
        StartProgramView startProgramView = new StartProgramView();   
        startProgramView.startProgramView.display();
        return;
        
    }   catch (Throwable e) {
        
        System.out.println("Exception: " + e.toString() +
                           "\nCause: " + e.getCause() +
                           "\nMessage: " + e.getMessage());
        
        e.printStackTrace();;
    }
        
    finally {
        try {
            if (SecretsOfTheSea.inFile != null)
            SecretsOfTheSea.inFile.close();
            
            if (SecretsOfTheSea.inFile != null)
            SecretsOfTheSea.outFile.close();
            
            if (SecretsOfTheSea.logFile != null)
                SecretsOfTheSea.logFile.close();

        }    catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
        
        }
 
    }

        
        
        
        
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        SecretsOfTheSea.currentGame = currentGame;
    }

    public static Game getPlayerOne() {
        return currentGame;
    }

    private static PrintWriter newPrintWriter(String filePath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setPlayerOne(Player playerOne) {
        this.playerOne = playerOne;
    }
    
    public static Game getPlayer() {            
        return currentGame;
        }
    
    public static void setPlayer(Player player) {
          
        } 
    
    public static Game startNewGame() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return currentGame;
    }

 
    public static Game getPlayersName() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return currentGame;
    }
    
    
    public static PrintWriter getOutFile() {
        return outFile;
    }
    
    public static void setOutFile(PrintWriter outFile) {
        SecretsOfTheSea.outFile = outFile;
    }
    
    public static BufferedReader getInFile() {
        return inFile;
    }
    
    public static void setInFile(BufferedReader inFile) {
        SecretsOfTheSea.inFile = inFile;
    }
    
    
    public static PrintWriter getLogFile() {
        return logFile;
    }
    
    public static void setLogFile(PrintWriter logFile) {
        SecretsOfTheSea.logFile = logFile;
    }
    


    Player playerOne = new Player();
    Artifacts artifactsOne = new Artifacts();
    Clipper clipperOne = new Clipper();
    Coins coinsOne = new Coins();
    Dirigible dirigibleOne = new Dirigible();
    Dock dockOne = new Dock();
    Food foodOne = new Food();
    Fuel fuelOne = new Fuel();
    Galley galleyOne = new Galley();
    Gems gemsOne = new Gems();
    InventoryItem inventoryItemOne = new InventoryItem();
    IronClad ironCladOne = new IronClad();
    Munitions munitionsOne = new Munitions();
    ObstacleMessage obstacleMessageOne = new ObstacleMessage();
    Ports portsOne = new Ports();
    Ships shipsOne = new Ships();
    Submersible submersibleOne = new Submersible();
    TimeClock timeClockOne = new TimeClock();
    TreasureItems treasureItemsOne = new TreasureItems();
    Water waterOne = new Water();
    //Actor actorOne = new Actor();
    Game gameOne = new Game();
    Map mapOne = new Map();
    LocationOfScene locationOfSceneOne = new LocationOfScene();
    ResourceTypeScene resourceTypeSceneOne = new ResourceTypeScene();
    RegularTypeScene regularTypeSceneOne = new RegularTypeScene();
    ShipTypeScene shipTypeSceneOne = new ShipTypeScene();
    Tokens tokensOne = new Tokens(); 
    Statues statuesOne = new Statues();
         
}
    
