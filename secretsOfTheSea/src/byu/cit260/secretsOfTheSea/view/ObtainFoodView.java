
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

    //public ObtainFoodView() {       }

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
            gameMenu.displayMenu();
      
        //END        
   
            displayBanner ();
        
        }

    private void displayBanner() {
        
        System.out.println("\n\n*************");     
        System.out.println("*                                                      *"
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
            
            break; // out of the (exit) the repetition
        }
        return totalPeople; // return the name   
    }
        String totalPeople = null;        
        
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
            break; // out of the (exit) the repetition
        }      
        return daysAtSea; // return the name 
    }
    String daysAtSea = null;   
         

    private String getFoodNeeded() {
        return null;
       
    }

    private void displayFoodNeeded(Food foodb) {
        
        System.out.println("\n\n=================");
        //System.out.println("\tYou now have " + foodb.getFoodNeeded());
        System.out.println("\tYou now have " + foodb);
        System.out.println("\tGood luck on your journey!");
        System.out.println("====================");
        
    }
}

