/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.secretsOfTheSea.view;

import byu.cit260.secretsOfTheSea.control.ProgramControl;
import byu.cit260.secretsOfTheSea.model.Player;
import java.util.Scanner;

/**
 *      
 * @author jacieames
 */
public class StartProgramView {
    
        
    
    public StartProgramView() {
        
    }
    
    
    public void startProgram() {
        
        //BEGIN
        
            //Display banner screen
            this.displayBanner();
            //Get the players name
            String playersName = this.getPlayersName();
            
            //Create a new player
            Player player = ProgramControl.createPlayer(playersName);
            
            //Display a customized welcome message
            this.displayWelcomeMessage(player);
            
            //Display the main menu
            MainMenuView mainMenu = new MainMenuView();
            mainMenu.display();
      
        //END        
   
            displayBanner ();
        
        }

    private void displayBanner() {
        
        System.out.println("\n\n*************");
        
        
        System.out.println ("*                                                      *"
        +"\n* This is the game of Secrets of the Sea Secrets of the                 *"
        +"\n* Sea, is a text-based role-playing adventure. In this game,            *"
        +"\n* you will be taking on the role as captain of a ship. You will         *"
        +"\n* navigate 7 ports and 22 excavation sites as you seek to acquire       *"
        +"\n* 8 highly valuable statues. On each token there is a piece of an       *"
        +"\n* ancient inscription, and when all 8 are put together a secret code    *" 
        +"\n* is unlocked. As time has gone on, the statues have changed from       *"
        +"\n* history to possible myths. Some believe in their ability to unlock    *" 
        +"\n* hidden treasure, while others think it is nothing but a made up story.*" 
        +"\n* Groups will form and leaders will be needed to guide ships on a race  *"
        +"\n* to the finish. Upon gaining equipment and other necessities, voyages  *"
        +"\n* will be chosen to not only find these hidden statues, but to survive  *"
        +"\n* the now tumultuous atmosphere of the world.                           *");
                

        System.out.println ("*                                                      *"
        +"\n* After picking a crew and packing a ship, you will as captain, lead    *"
        +"\n* your team on an adventure of a lifetime. Those who preserve and work  *"
        +"\n* together are likely to unlock the mysteries awaiting on both sea and  *"
        +"\n* land.                                                                 *");                                               
        
        System.out.println("\n\n*************");
        
        
        
    }

    public String getPlayersName() {
        boolean valid = false; //indicates if the name has be retrieved
        String playersName = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid) { //while a valid name hasn't been retrieved
            
            // prompt for the player's name
            System.out.println("Enter the player's name below:");
            
            //get the name from the keyboard and trim off the blanks
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            //if name is invalid
            if (playersName.length() < 2) {
                
                System.out.println("Invalid name - the name must not be blank");
                continue; // and repeat again
               
            }
            break; // out of the (exit) the repetition
        }
        
        return playersName; // return the name
        
        
    
    }

    private void displayWelcomeMessage(Player player) {
        System.out.println("\n\n=================");
        System.out.println("\tWelcome to the game " + player.getName());
        System.out.println("\tWe hope you have fun!");
        System.out.println("====================");
        
    }
    
                
    
    
}
