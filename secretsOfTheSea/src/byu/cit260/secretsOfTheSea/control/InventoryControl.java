/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.secretsOfTheSea.control;

import byu.cit260.secretsOfTheSea.model.Player;

/** Original Code
 *
 * @author jacieames
 
public class InventoryControl {

    public static void createInventoryMenu(Player SecretsOfTheSea) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    public double calcWaterNeeded(double totalPeople, double daysAtSea) {
        
        if (totalPeople < 10 || totalPeople > 30) {
            return -1;
        }
		

        if (daysAtSea > 30) {
            return -1; 
        }
		

	double gallonsOfWaterPerPersonPerDay = .5;

	double waterNeeded = (totalPeople * daysAtSea * gallonsOfWaterPerPersonPerDay);


	return waterNeeded;    
      



    }
    
    public double calcQtyOfFood (double totalPeople, double daysAtSea, double mealsPerDay) {
        
        if (totalPeople < 10 || totalPeople > 30) {
            return -1;
        }
		

        if (daysAtSea > 10) {
            return -1; 
        }
		

	mealsPerDay = 3;

	double totalMeals = (totalPeople * daysAtSea * mealsPerDay);

	return totalMeals;    
      
    }
    
    

    public double calcQtyOfAmmo(double totalPeople, double bulletsPerGun) {
        
        if (totalPeople < 10 || totalPeople > 30) {
            return -1;
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

 */


public class InventoryControl {

    public static void createInventoryMenu(Player SecretsOfTheSea) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    public double calcWaterNeeded(double totalPeople, double daysAtSea) {
        
        if (totalPeople < 10 || totalPeople > 30) {
            return -1;
        }
		

        if (daysAtSea > 30) {
            return -1; 
        }
		

	double gallonsOfWaterPerPersonPerDay = .5;

	double waterNeeded = (totalPeople * daysAtSea * gallonsOfWaterPerPersonPerDay);


	return waterNeeded;    
      



    }
    
    public double calcQtyOfFood (double totalPeople, double daysAtSea, double mealsPerDay) {
        
        if (totalPeople < 10 || totalPeople > 30) {
            return -1;
        }
		

        if (daysAtSea > 10) {
            return -1; 
        }
		

	mealsPerDay = 3;

	double totalMeals = (totalPeople * daysAtSea * mealsPerDay);

	return totalMeals;    
      
    }
    
    

    public double calcQtyOfAmmo(double totalPeople, double bulletsPerGun) {
        
        if (totalPeople < 10 || totalPeople > 30) {
            return -1;
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
