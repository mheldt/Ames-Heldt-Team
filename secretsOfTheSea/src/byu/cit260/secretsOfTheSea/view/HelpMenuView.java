
package byu.cit260.secretsOfTheSea.view;

import byu.cit260.secretsOfTheSea.control.GameControl;
import byu.cit260.secretsOfTheSea.model.Player;
import java.util.Scanner;

/**
 *
 * @author jacieames
 */      

public class HelpMenuView {
    
    
    private final String MENU = "\n"
            
            + "\n---------------------------------------"
            + "\n| Help Menu                           |"
            + "\n|----------------------------         |"
            + "\nG - Goal of the Game"
            + "\nM - How to Move"
            + "\nS - How to Save"
            + "\nE - Exit"
            + "\n---------------------------------------";
 
    
    public void displayMenu() {
        
       char selection = ' ';
       do {
            
            System.out.println(MENU); //display the main menu
            
            String input = this.getInput(); //get user's selection
            selection = input.charAt(0);//get first character of string
            
            this.doAction(selection); // do action based on selection
            
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
		case 'G':
			this.goalOfGame();
			break;
		case 'M':
			this.howToMove();
			break;
		case 'S':
			this.howToSave();
			break;
		case 'E':
			this.backToMain();
                        break;   
		default:
			System.out.println("\n*** Invalid selection *** Try again");
			break;
        }
      
    }

    private void goalOfGame() {
        System.out.println("*** Goal Of Game Function Called ***");
    }

    private void howToMove() {
        System.out.println("*** How To Move Function Called ***");
    }

    private void howToSave() {
        System.out.println("*** Explore Location Function Called ***");   
    }    

    private void backToMain() {
       // back to main menu
        MainMenuView mainMenu = new MainMenuView() { };
        mainMenu.displayMenu();
        }
    

    
    
    
    
    
    
}
