/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
            + "\n---------------------------------------"
            + "\n| Main Menu                           |"
            + "\n|----------------------------         |"
            + "\nN - Start new game"
            + "\nG - Start existing game"
            + "\nH - Help menu"
            + "\nS - Save game"
            + "\nE - Exit"
            + "\n---------------------------------------";
            
    public void displayMenu() {
        
        char selection = ' ';
        do {
            
            System.out.println(MENU); //display the main menu
            
            String input = this.getInput(); //get user's selection
            selection = input.charAt(0);//get first character of string
            
            this.doAction(selection); // do action based on selection
            
        } while (selection != 'E'); //a selection is not "Exit"
        

        
    }
            

    //void displayMenu() {
        //System.out.println("*** MainMenuView.displayMenu() function called ***");
    //}

     
        

        
        private String getInput() {
        boolean valid = false; //indicates if the command has be retrieved
        String selection = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid) { //while a valid command hasn't been retrieved
            
            // prompt for the player's selection
            System.out.println("Please make a selection on the menu");
            
            //get the selection from the keyboard and trim off the blanks
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
			this.startExistingGame();
			break;
		case 'H':
			this.displayHelpMenu();
			break;
		case 'S':
			this.saveGame();
			break;
		case 'E':
			return;
		default:
			System.out.println("\n*** Invalid selection *** Try again");
			break;
    }
        
        
        

        
    }

   //**
    
    //private void startNewGame() {
        //create a new game
        //GameControl.createNewGame(SecretsOfTheSea.getPlayerOne());
        
        //display the game
        //GameMenuView gameMenu = new GameMenuView();
        //gameMenu.displayMenu();
        
    //}
    
    //**
    
    private void displayHelpMenu() {
            // display help menu
        GameControl.createHelpMenu(SecretsOfTheSea());
        
        //display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
        
    }
    
    
    private void startNewGame() {
            // create a new game
        GameControl.createGameMenu(SecretsOfTheSea());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
        
        
  
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

    
    /**
    private static class GameMenuView {

        public GameMenuView() {
        }

        private void displayMenu() {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
         }
    **/

    
       
        
}
    

