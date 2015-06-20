package byu.cit260.secretsOfTheSea.view;

import byu.cit260.secretsOfTheSea.control.GameControl;
import byu.cit260.secretsOfTheSea.model.Player;
import java.util.Scanner;

/**
 *
 * @author jacieames
 */
public class MainMenuView extends View {
    
    
    public MainMenuView() {
     super("\n"
            + "\n|-------------------------------------|"
            + "\n| Main Menu                           |"
            + "\n|-------------------------------------|"
            + "\nN - Start new game"
            + "\nG - Start existing game"
            + "\nH - Help menu"
            + "\nS - Save game"
            + "\nE - Exit"
            + "\n---------------------------------------");
            
        }
    
    @Override
    public boolean doAction(Object obj) {
    
        String value = String.valueOf(obj);

        value = value.toUpperCase(); // convert all to uppercase
        char choice = value.charAt(0); // get first character entered
        
        return false;

    } 
    
    
    private void doAction(char selection) {
        switch (selection) {
		case 'N':
			this.startNewGame(); // go to Game Menu
			break;
		case 'G':
			this.startExistingGame(); // start a saved game
			break;
		case 'H':
			this.displayHelpMenu(); // display the help menu
			break;
		case 'S':
			this.saveGame(); // save the current game
			break;
		case 'E':
			return;
		default:
			System.out.println("\n*** Invalid selection *** Try again");
			break;
                }
    }

    private void displayHelpMenu() {
            // display help menu
        GameControl.createHelpMenu(SecretsOfTheSea());
        
        //display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();   
    }
 
    private void startNewGame() {
            // create a new game
        GameControl.createGameMenu(SecretsOfTheSea());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
    
    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private Player SecretsOfTheSea() {
        Player currentGame = null;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        return currentGame;
    }

    
        
}
    

