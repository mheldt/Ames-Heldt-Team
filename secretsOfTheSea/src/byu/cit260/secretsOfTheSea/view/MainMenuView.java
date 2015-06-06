/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.secretsOfTheSea.view;

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
        
        return selection; // return the name
        
        
    
    }

    private void doAction(char selection) {
        switch (selection) {
		case 'N':
			this.startNewGame();
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

    private void startNewGame() {
        System.out.println("*** startNewGame function called ***");
    }
    
    private void displayHelpMenu() {
        System.out.println("*** displayHelpMenu function called ***");
    }
    
    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    

    
	
         
   

        
        
}
    

