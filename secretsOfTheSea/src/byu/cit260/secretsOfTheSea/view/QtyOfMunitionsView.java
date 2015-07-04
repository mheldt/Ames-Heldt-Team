
package byu.cit260.secretsOfTheSea.view;

import byu.cit260.secretsOfTheSea.exceptions.InventoryControlException;
import java.util.Scanner;

/**
 *
 * @author MarkH
 */
public class QtyOfMunitionsView {
    private Object mainMenu;
    private Object ammo;

    public void startProgram() {
        
        //BEGIN
        
            //Display Banner Screen
            this.displayBanner();
            
        try {
            //Get the Total People & Calc Results
            this.getTotalPeople();
        } catch (InventoryControlException ex) {
            //Logger.getLogger(QtyOfMunitionsView.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        //END   
            
            //System.out.println("\n\n=================");
            System.out.println("\t ");
            System.out.println("\t ");
            System.out.println("\t Recalculate Ammo by ");
            System.out.println("\tChoosing Option Again");
            //System.out.println("====================");
        
    }

    private void displayBanner() {
        
        System.out.println("\n\n***************************************************");     
        System.out.println("\n* Let's figure out how much amunition you will need *");
        System.out.println("\n* for your voyage!                                  *");
        System.out.println("\n\n***************************************************");  
    
    }

    public boolean getTotalPeople() 
        throws InventoryControlException {  // new throws line { was there
        
        boolean valid = false; //indicates if amount needed has been retrieved
        int bulletsPerGun = 10;        
        int gunPowderShotsPerKeg = 100;
   
        Scanner scnr = new Scanner(System.in);
        byte totalPeople;

        // Enter total people on trip
        System.out.print("Enter between 10-30 total people for the voyage: ");
        totalPeople = scnr.nextByte();
        
        //Error Checking totalPerople
        if (totalPeople < 10 || totalPeople > 30)  {
            throw new InventoryControlException(" "); 
        }
	
        // Calculate the ammunition needed
        int totGuns = totalPeople * 2;
        int totBullets = bulletsPerGun * totGuns;
        int totPowderKegs = totBullets/gunPowderShotsPerKeg;
                
        // Results of the ammunition needed
    
        System.out.println("\t  ");
        System.out.println("\t  ");
        System.out.println("\tTotal People      = " + totalPeople);
        System.out.println("\tTotal Guns        = " + totGuns);
        System.out.println("\tTotal Bullets     = " + totBullets);
        System.out.println("\tTotal Powder Kegs = " + totPowderKegs);

        return false;  
    }
                
}
