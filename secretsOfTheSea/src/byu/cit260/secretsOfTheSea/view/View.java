package byu.cit260.secretsOfTheSea.view;

import java.util.Scanner;

/**
 *
 * @author jacieames
 */
public class View implements ViewInterface {

    //private String promptMessage;
    //public View(String promptMessage) {
    //    this.promptMessage = promptMessage;  
    //}
    /*
    
       
    public void display() {
        String myInput = "";
        boolean done = false;
        do { 
            System.out.println(this.promptMessage); //display prompt message
            myInput = this.getInput(); //get value end user entered
            done = this.doAction(myInput);  // do action based on value entered                
        }    
        while (!done); 
    }
    
    */
    // THIS IS OUR ORIGINAL CODE
    
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
           
    
    
    /*
    public String getInput() {
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        boolean valid = false; //indicates if the command has been retrieved
        String myInput = null;
  
        while(!valid) { //while a valid command hasn't been retrieved

            //get the value from the keyboard
            myInput = keyboard.nextLine();
            myInput = myInput.trim();
            
            //prompt for the player's selection
            System.out.println("Please make a selection on the menu: ");

            if (myInput.length() < 1) {

                System.out.println("You must enter the menu letter");
                continue; // and repeat again
            }
            break; // out of the (exit) the repetition
        }

        return myInput; // return the selection
    }
    */
    
    // THIS IS OUR ORIGINAL CODE 
    
    public String getInput() {
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

    
    /*
    
    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String Message) {
        this.promptMessage = Message;
    }
    */

    private void doAction(char selection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void MENU() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
