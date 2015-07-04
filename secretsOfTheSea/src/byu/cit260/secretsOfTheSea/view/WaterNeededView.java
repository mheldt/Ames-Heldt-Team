
package byu.cit260.secretsOfTheSea.view;

import byu.cit260.secretsOfTheSea.exceptions.InventoryControlException;
import java.util.Scanner;

/**
 *
 * @author MarkH
 */
public class WaterNeededView {

    private Object mainMenu;
    private Object water;

    public void startProgram() {
        
        //BEGIN
        
            //Display Banner Screen
            this.displayBanner();
            
            try {
                //Get the Total People & Calc Results
                this.getTotalWater();
            } catch (InventoryControlException ex) {
                //Logger.getLogger(QtyOfMunitionsView.class.getName()).log(Level.SEVERE, null, ex);
            }

        //END   
            
            //System.out.println("\n\n=================");
            System.out.println("\t ");
            System.out.println("\t ");
            System.out.println("\t Recalculate Water by ");
            System.out.println("\tChoosing Option Again");
            //System.out.println("====================");
        
    }

    private void displayBanner() {
        
        System.out.println("\n\n***************************************************");     
        System.out.println("\n* Let's figure out how much water you will need     *");
        System.out.println("\n* for your voyage!                                  *");
        System.out.println("\n\n***************************************************");  
    
    }
    
    public boolean getTotalWater() 
        throws InventoryControlException {  // new throws line { was there
        
        boolean valid = false; //indicates if amount needed has been retrieved
        Scanner scnr = new Scanner(System.in);
          
        
        byte daysAtSea;

        // Enter total number of days on trip
        System.out.print("Enter no more than 30 total number of days at sea: ");
        daysAtSea = scnr.nextByte();
        
        //Error Checking totalPerople
        if (daysAtSea < 1 || daysAtSea > 30)  {
            throw new InventoryControlException(" ");  
        }
        

        byte totalPeople;

        // Enter total people on trip
        System.out.print("Enter between 10-30 total people for the voyage: ");
        totalPeople = scnr.nextByte();
        
        //Error Checking totalPerople
        if (totalPeople < 10 || totalPeople > 30)  {
            throw new InventoryControlException(" ");
        }
        
        
        
    // Calculate & Display the water needed
    double gallonsOfWaterPerPersonPerDay = .5;
    double totWater = totalPeople * daysAtSea * gallonsOfWaterPerPersonPerDay;
 
    // Results of the ammunition needed

    System.out.println("\t  ");
    System.out.println("\t  ");
    System.out.println("\tTotal People            = " + totalPeople);
    System.out.println("\tTotal Days at Sea       = " + daysAtSea);
    System.out.println("\tTotal Gallons of Water  = " + totWater);
    //System.out.println("\tTotal Powder Kegs = " + totPowderKegs);

    return false;  
    }
}

