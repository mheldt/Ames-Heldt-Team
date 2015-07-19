/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.secretsOfTheSea.view;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author MarkH
 */
public class EdgeOfTheWorld {
      
    public void startProgram() {    
        //BEGIN
        
            //Display Banner Screen
            this.displayBanner();
            
            //System.out.println("Got this Far 2 ");
            this.getDestination();
  
    }

    private void displayBanner() {
        
        System.out.println("\n\n***************************************************");     
        System.out.println("\n* You have just left the Port                       *");
        System.out.println("\n* Good luck on your Voyage to the Edge of the World!     *");
        System.out.println("\n\n***************************************************");  
        System.out.println("\n  "); 
    }
    
    public void getDestination() { 
        
        int num = 10;
        int count = 0;
        while ( count <= num )
        {
           count++ ;
           System.out.println("|");
 
        }
        System.out.println("  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -->  X");   
        System.out.println("  ");  
        System.out.println("  ");  

        System.out.println("You Just Arrived Safely At Invisible Island");      
 
    
    }

}