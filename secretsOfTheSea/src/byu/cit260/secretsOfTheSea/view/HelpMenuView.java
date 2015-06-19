/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.secretsOfTheSea.view;

import byu.cit260.secretsOfTheSea.control.GameControl;
import byu.cit260.secretsOfTheSea.model.Player;
import java.util.Scanner;

/**
 *
 * @author jacieames
 */      

    
 
    public class HelpMenuView extends View {
    
    
    public HelpMenuView() {
     super("\n"
            + "\n---------------------------------------"
            + "\n| Help Menu                           |"
            + "\n|----------------------------         |"
            + "\nG - Goal of the Game"
            + "\nM - How to Move"
            + "\nS - How to Save"
            + "\nE - Exit"
            + "\n---------------------------------------");
            
        }

    
    @Override
    public boolean doAction(Object obj) {
    
    String value = (String) obj;
    
    value = value.toUpperCase(); // convert all to uppercase
    char choice = value.charAt(0); // get first character entered
        return false;
      
    }
      
        
    private void doAction(char selection) {
        switch (selection) {
		case 'G':
			this.goalOfGame();
			break;
		case 'M':
			this.howToMove();
			break;
		case 'S':
			this.howToSave();
			break;
                    
                
		case 'E':
			this.backToMain();
                        break; 
                    
		default:
			System.out.println("\n*** Invalid selection *** Try again");
			break;
        }
      
    }

    private void goalOfGame() {
        System.out.println("*** Goal Of Game Function Called ***");
    }

    private void howToMove() {
        System.out.println("*** How To Move Function Called ***");
    }

    private void howToSave() {
        System.out.println("*** Explore Location Function Called ***");   
    }     


    private void backToMain() {
        
        // back to main menu
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
        
    }
    

    
    
    
    
    
    
}

  
    
    
    
    
    
    
    
 
