package byu.cit260.secretsOfTheSea.view;

import byu.cit260.secretsOfTheSea.control.GameControl;
import byu.cit260.secretsOfTheSea.model.Player;
import java.util.Scanner;

/**
 *
 * @author jacieames
 */
public class MainMenuView {  
    
    private final String MENU = "\n"
            
            + "\n|-------------------------------------|"
            + "\n| Main Menu                           |"
            + "\n|-------------------------------------|"
            + "\nN - Start new game"
            + "\nG - Start existing game"
            + "\nH - Help menu"
            + "\nS - Save game"
            + "\nE - Exit"
            + "\n---------------------------------------";
    private Object console;
    private Object SecretsOfTheSea;
            
        
    public void displayMenu() {
        char selection = ' ';
        do { 
            System.out.println(MENU); //display the main menu
            //this.console.println(this.MENU); //display the main menu

            String input = this.getInput(); //get user's selection
            selection = input.charAt(0); //get first character of string
            this.doAction(selection);  // do action based on selection                 
        }    
        while (selection != 'E'); //a selection is not "Exit"  
    }
    
    private String getInput() {
        boolean valid = false; //indicates if the command has be retrieved
        String selection = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream

        while(!valid) { //while a valid command hasn't been retrieved

            // prompt for the player's selection
            System.out.println("Please make a selection on the menu");

            //get the selection from the keyboard and trim off the blanks
            //see modified below - selection = keyboard.nextLine();
            selection = keyboard.nextLine();
            selection = selection.trim();

            //if name is invalid
            if (selection.length() > 1) {

                System.out.println("Invalid character");
                continue; // and repeat again
            }


            break; // out of the (exit) the repetition
        }

        return selection; // return the selection
    }

    private void doAction(char selection) {
        switch (selection) {
            case 'N':
                    this.startNewGame(); // go to Game Menu
                    break;
            case 'G':
                    this.startSavedGame(); // start a saved game
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
            // create a new game
        //System.out.println("*** Start New Game function called ***");
        GameControl.createGameMenu(SecretsOfTheSea());
        //System.out.println("*** Start New Game 2 function called ***");
        
        GameMenuView gameMenu = new GameMenuView();
        //System.out.println("*** Start New Game 3 function called ***");

        gameMenu.displayMenu();
        //System.out.println("*** Start New Game 4 function called ***");
    }
    
    
    
    
    private void startSavedGame() {
        
        // prompt for and get the name of the file to save the game in
        System.out.println("\n\nEnter the file path for file where the game"
                           + "is to be saved.");
    
        String filePath = this.getInput();
        
        try {
            // start a saved game
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    
    
    }
   
    private void displayHelpMenu() {
            // display help menu
        GameControl.createHelpMenu(SecretsOfTheSea());
        
        //display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();   
    }
 
    private void saveGame() {
        // prompt for and get the name of the file to save the gamein
        System.out.println("\n\nEnter the file path for file where the game "
                            + "is to be saved.");
        
        String filePath = this.getInput();
        
        try {
            // save the game to the specified file
            GameControl.saveGame(SecretsOfTheSea.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
            
        }
    }

    private Player SecretsOfTheSea() {
        Player currentGame = null;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return currentGame;
    }   

    private void endGame() {
        // back to main menu
        //private void displayWelcomeMessage(Player player) {
        
        
    }

    public class keyboard {

        public String readLine() {
            return null;
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public keyboard() {
        }
    }
      
}
   