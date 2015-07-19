/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.secretsOfTheSea.view;

import byu.cit260.secretsOfTheSea.control.InventoryControl;
//import byu.cit260.secretsOfTheSea.exceptions.MapControlException;
import byu.cit260.secretsOfTheSea.model.Player;
import java.util.Scanner;

/**
 *
 * @author MarkH
 */
public class MapMenuView {
    
    private final String MENU = "\n"
            
            + "\n---------------------------------------"
            + "\n| Destinations to Choose               |"
            + "\n|--------------------------------------"
            + "\nI - Invisible Island"
            + "\nW - Edge of the World"
            + "\nE - Exit "
            + "\n "
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
            System.out.println("Choose Your Destination");

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
            case 'I':
                    this.invisibleIsland();
                    break;
           
            case 'W':
                    this.edgeWorld();
                    break;

            case 'E':
                    //this.backToMain();
                    //break;
                return;
            default:
                    System.out.println("\n*** Invalid selection *** Try again");
                    break;
        }
            
    }

    private void invisibleIsland() {
        // go to Goal of Game menu
        InvisibleIslandView islandMenu = new InvisibleIslandView();
        islandMenu.startProgram();
    }

    private void edgeWorld() {
        EdgeOfTheWorld edgeMenu = new EdgeOfTheWorld();
        edgeMenu.startProgram();
    }
 
    
    private void backToMain() {
        // back to main menu
        MainMenuView mainMenu = new MainMenuView() { };
        mainMenu.displayMenu();
        }

    private Player SecretsOfTheSea() {
        return null;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
 
}
