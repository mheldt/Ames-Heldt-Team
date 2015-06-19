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
public abstract class View implements ViewInterface {
       
    private String promptMessage;
    public View(String promptMessage) {
        this.promptMessage = promptMessage;  
    }
 
    @Override
    public void display() {
        
        String value = "";
        boolean done = false;
        
        char selection = ' ';
        do { 
            System.out.println(this.promptMessage); //display the main menu
            
            String input = this.getInput(); //get user's selection
            selection = input.charAt(0);//get first character of string
            boolean doAction = this.doAction(selection); // do action based on selection
            
            } 
        while (selection != 'E'); //a selection is not "Exit" 
    }
            

        @Override
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
       
    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    
    
    
}
