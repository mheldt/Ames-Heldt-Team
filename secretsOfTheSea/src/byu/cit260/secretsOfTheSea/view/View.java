package byu.cit260.secretsOfTheSea.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import secretsofthesea.SecretsOfTheSea;

/**
 *
 * @author jacieames
 */
public class View implements ViewInterface {

    
    private String message;
    protected final BufferedReader keyboard = SecretsOfTheSea.getInFile();
    protected final PrintWriter console = SecretsOfTheSea.getOutFile();
    
    public View() {
        
    }
   
    
    
    public void displayMenu() {
        char selection = ' ';
        char displayMenu = ' ';
        do { 
            System.out.println(displayMenu); //display the main menu

            String input = this.getInput(); //get user's selection
            selection = input.charAt(0); //get first character of string
            this.doAction(selection);  // do action based on selection                 
        }    
        while (selection != 'E'); //a selection is not "Exit"  
    }  
           

    public String getInput() {
        
        boolean valid = false; //indicates if the command has been retrieved
        String selection = null;
  
    //while a valid command hasn't been retrieved
    while(!valid) { 

            //get the value from the keyboard
            selection = this.keyboard.readLine();
            selection = selection.trim();
            
            //prompt for the player's selection
            System.out.println("Please make a selection on the menu: ");

            if (selection.length() < 1) { // blank value entered

                System.out.println("You must enter the menu letter");
                continue; // and repeat again
            }
            break; // out of the (exit) the repetition
        }

        return selection; // return the selection
    }
    
    
    

    private void doAction(char selection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void MENU() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
