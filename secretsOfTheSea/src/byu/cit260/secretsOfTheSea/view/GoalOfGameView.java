/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.secretsOfTheSea.view;

import byu.cit260.secretsOfTheSea.model.Player;
import java.util.Scanner;

/**
 *
 * @author jacieames
 */
public class GoalOfGameView {
    
    private final String MENU = "\n"
            
            + "\n*----------------------------------------*"
            + "\n* Goal of the game                       *"
            + "\n*----------------------------------------*"
            + "\n* The goal of the game is to calculate   *"
            + "\n* how much inventory you will need for   *"
            + "\n* voyage according to the number of crew *"
            + "\n* members.                               *"
            + "\n*----------------------------------------*"
            + "\n* After you have filled up your food,    *"
            + "\n* water, and munitions, the captian      *"
            + "\n* will assess if you are ready to set    *"
            + "\n* sail!                                  *"
            + "\n*----------------------------------------*"
            + "\n*                                        *"
            + "\n*                                        *"
            + "\nB - Back to Game Menu"
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
            case 'B':
                    this.backToGameMenu();
                    break;

            case 'E':
                    this.backToMain();
                    break;
            default:
                    System.out.println("\n*** Invalid selection *** Try again");
                    break;
        }
            
    }

    private void backToGameMenu() {
        // back to main menu
        GameMenuView gameMenu = new GameMenuView() { };
        gameMenu.displayMenu(); 
    }

    private void backToMain() {
        // back to main menu
        MainMenuView mainMenu = new MainMenuView() { };
        mainMenu.displayMenu();
             
    }
    

    private Player SecretsOfTheSea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  
    
}
