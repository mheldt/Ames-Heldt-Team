package byu.cit260.secretsOfTheSea.view;

//import byu.cit260.secretsOfTheSea.control.GameControl;
//import byu.cit260.secretsOfTheSea.control.InventoryControl;
import byu.cit260.secretsOfTheSea.model.Player;
import java.util.Scanner;

/**
 *
 * @author MarkH
 */

public class InventoryMenuView {
    private final String MENU = "\n"
            
            + "\n*--------------------------------------*"
            + "\n* Inventory Menu                       *"
            + "\n*--------------------------------------*"
            + "\nW - How Much Water Needed "
            + "\nF - How Much Food Needed"
            + "\nA - How Much Ammunition Needed"
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
            case 'W':
                    this.waterNeeded();
                    break;
            case 'F':
                    this.qtyOfFood();
                    break;
            case 'A':
                    this.qtyOfMunitions();
                    break;
            case 'E':
                    return;
            default:
                    System.out.println("\n*** Invalid selection *** Try again");
                    break;
    	}
    }

    private void waterNeeded() {
        //create ObtainFoodView and start the program
        WaterNeededView startWaterView = new WaterNeededView();
        startWaterView.startProgram();   
    }

    private void qtyOfFood() {
        //create ObtainFoodView and start the program
        ObtainFoodView startFoodView = new ObtainFoodView();
        startFoodView.startProgram();     
    }
    
    private void qtyOfMunitions() {
        //create QtyOfMunitionsView and start the program
        QtyOfMunitionsView startMunitionsView = new QtyOfMunitionsView();
        startMunitionsView.startProgram();    
    }

    private Player SecretsOfTheSea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
    