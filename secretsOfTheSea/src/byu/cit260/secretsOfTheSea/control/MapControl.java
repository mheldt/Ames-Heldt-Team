/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.secretsOfTheSea.control;
import byu.cit260.secretsOfTheSea.exceptions.MapControlException;
import byu.cit260.secretsOfTheSea.model.Player;

/**
 *
 * @author jacieames
 */
public class MapControl {


    public double calcQtyOfAmmo(double totalPeople, double bulletsPerGun) 
        // New Line before the {
        throws MapControlException {
        
        if (totalPeople < 10 || totalPeople > 30)  {
            // return -1;
            
            // New line
            totalPeople = 0;
            throw new MapControlException("Only 10 to 30 people can be on the ship");
        }
		
        if (bulletsPerGun <10 || bulletsPerGun > 100) {
            return -1; 
        }
		
        double gunPowderShotsPerKeg = 100;
	double totalGuns = totalPeople * 2;

	double totalBullets = (bulletsPerGun * totalGuns);
	double totalPowderKegs = totalBullets/gunPowderShotsPerKeg;
       
        return totalGuns+totalBullets+totalPowderKegs;
        
    }

    double calcQuantityOfMunitions(double totalPeople, double bulletsPerGun) {
        return 0;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
