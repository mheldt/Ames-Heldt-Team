/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.secretsOfTheSea.view;

import byu.cit260.secretsOfTheSea.control.ProgramControl;
import byu.cit260.secretsOfTheSea.model.Food;
import byu.cit260.secretsOfTheSea.model.Player;
import java.util.Scanner;

/**
 *      
 * @author jacieames
 */
public class ObtainFoodView {
    private Object mainMenu;
    private Object food;
    
        
    
    public ObtainFoodView() {
        
    }
    
    
    public void startProgram() {
        
        //BEGIN
        
            //Display banner screen
            this.displayBanner();
            //Get the players name
            String foodNeeded = this.getFoodNeeded();
            
            //Create the food
            Food food = ProgramControl.createFood(foodNeeded);
            
            //Display a food status
            this.displayFoodNeeded(food);
            
            //Display the game menu
            GameMenuView gameMenu = new GameMenuView();
            mainMenu.display();
      
        //END        
   
            displayBanner ();
        
        }

    private void displayBanner() {
        
        System.out.println("\n\n*************");
        
        
        System.out.println ("*                                                      *"
        +"\n* Welcome to the food station where you can load up food                *"
        +"\n* for your voyage!                                                      *");
                                                             
        
        System.out.println("\n\n*************");
        
        
        
    }

    public String getTotalPeople() {
        boolean valid = false; //indicates if amount needed has been retrieved
        String playersName = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid) { //while a valid name hasn't been retrieved
            
            // prompt for total people
            System.out.println("Enter total people for the voyage.");
            
            //get the amount from the keyboard and trim off the blanks
            String totalPeople = keyboard.nextLine();
            totalPeople = playersName.trim();
            
               
            }
            break; // out of the (exit) the repetition
        }
        String totalPeople = null;
        
        return totalPeople; // return the name
        
        
        
        
        
        public String getDaysAtSea() {
        boolean valid = false; //indicates if amount needed has been retrieved
        String playersName = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid) { //while a valid name hasn't been retrieved
            
            // prompt for total people
            System.out.println("Enter the days you will be at sea.");
            
            //get the amount from the keyboard and trim off the blanks
            String totalPeople = keyboard.nextLine();
            totalPeople = playersName.trim();
            
               
            }
            break; // out of the (exit) the repetition
        
        String daysAtSea = null;
        
        return daysAtSea; // return the name
        
        }
        
        
        

    private String getFoodNeeded() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayFoodNeeded(Food food) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        
        
        
    
    }

    private void displayFoodNeeded(Food food) {
        System.out.println("\n\n=================");
        System.out.println("\tYou now have " + food.getFoodNeeded());
        System.out.println("\tGood luck on your journey!");
        System.out.println("====================");
        
    }

    private void displayFoodNeeded(Food food) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
                
    
    
}
