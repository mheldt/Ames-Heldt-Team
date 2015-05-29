/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.secretsOfTheSea.control;

/**
 *
 * @author jacieames
 */
public class InventoryControl {
    
    
    
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
    
}
