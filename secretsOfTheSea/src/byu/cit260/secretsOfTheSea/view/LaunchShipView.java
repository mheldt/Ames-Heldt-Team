package byu.cit260.secretsOfTheSea.view;

//import byu.cit260.secretsOfTheSea.control.GameControl;
//import byu.cit260.secretsOfTheSea.control.InventoryControl;
import byu.cit260.secretsOfTheSea.model.Player;
import java.util.Scanner;

/**
 *
 * @author MarkH
 */

public class LaunchShipView {
    private final String MENU = "\n"
            
            + "\n                                          "
            + "\n                                          "
            + "\n*----------------------------------------*"
            + "\n* Launch Checklist                       *"
            + "\n*----------------------------------------*"
            + "\n                                          "
            + "\n* Captain, here! Now that we've filled   *"
            + "\n* our inventory, analyze this checklist  *"
            + "\n* to  see if we are ready to set sail!   *"
            + "\n*----------------------------------------*"
            + "\n* 1. All hands are on board              *"
            + "\n* 2. All crew members are alert!         *"
            + "\n* 3. The sail is secured tightly         *"
            + "\n*----------------------------------------*"
            + "\n* Can we answer affirmatively to each    *"
            + "\n* of these items?                        *"
            + "\n                                          "
            + "\nY - Yes sir, Captain!"
            + "\nN - Not quite yet, Captain."
            + "\n                                          "
            + "\nE - Exit"
            + "\n*----------------------------------------*"
            + "\n                                          "
            + "\n                                          "
            + "\n                                          ";    
    private Object player;
    

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
            System.out.println("Are you ready to launch the ship?");

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
            case 'Y':
                    this.nowAtSea();
                    break;
            case 'N':
                    this.notPrepared();
                    break;

            case 'E':
                    this.backToGameMenu();
                    break;
            default:
                    System.out.println("\n*** Invalid selection *** Try again");
                    break;
        }
            
    }

    private void nowAtSea() {
        //create ObtainFoodView and start the program
        System.out.println("Good work, team! Congratulations, we are now at sea!");  
    }

    private void notPrepared() {
        //create ObtainFoodView and start the program
        System.out.println("Sorry, we have more to do before we can set sail!");     
    }
    

    private Player SecretsOfTheSea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void backToGameMenu() {
        // back to main menu
        GameMenuView gameMenu = new GameMenuView() { };
        gameMenu.displayMenu();
        
    }
    
}
    