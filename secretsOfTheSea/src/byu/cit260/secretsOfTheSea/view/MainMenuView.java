package byu.cit260.secretsOfTheSea.view;

import byu.cit260.secretsOfTheSea.control.GameControl;
import byu.cit260.secretsOfTheSea.model.Player;
import java.util.Scanner;

/**
 *
 * @author jacieames
 */
public abstract class MainMenuView extends View {  
    
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
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
    
        return false;
    }
   
    
    private void doAction(char myInput) {
        switch (myInput) {
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
                    this.endGame();
                    break;
            default:
                    System.out.println("\n*** Invalid selection *** Try again");
                    break;
            }
        }
    
    private void startNewGame() {
        GameControl.createGameMenu(SecretsOfTheSea());
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
    
    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }
   
    private void displayHelpMenu() {
        GameControl.createHelpMenu(SecretsOfTheSea());
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();   
    }
 
    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }

    private Player SecretsOfTheSea() {
        Player currentGame = null;
        return currentGame;
    }   

    private void endGame() {
        // back to main menu
        //private void displayWelcomeMessage(Player player) {   
    }
      
}
   