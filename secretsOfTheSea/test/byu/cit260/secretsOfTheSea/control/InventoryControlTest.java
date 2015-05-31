/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.secretsOfTheSea.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jacieames
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of calcWaterNeeded method, of class InventoryControl.
     */
    @Test
    public void testCalcWaterNeeded() {
        System.out.println("calcWaterNeeded");
        
        /***Test case #1***/
        
        System.out.println("\tTest case #1");
        
        //input values for test case 1
        double totalPeople = 30;
        double daysAtSea = 30;
        
        double expResult = 450;
        
        InventoryControl instance = new InventoryControl();
        
        
        double result = instance.calcWaterNeeded(totalPeople, daysAtSea);
        
        assertEquals(expResult, result, 0.0001);
        // **TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype."); //
        
        
        
        
        /******************/
        /***Test case #2***/
        /******************/
        
        System.out.println("\tTest case #2");
        
        //input values for test case 2
        totalPeople = -1;
        daysAtSea = 30;
        expResult = -1.0;
        
        //InventoryControl instance = new InventoryControl();//
        
        result = instance.calcWaterNeeded(totalPeople, daysAtSea);
        
        assertEquals(expResult, result, 0.0001);
        // **TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype."); //
        
      
        
        
        /******************/
        /***Test case #3***/
        /******************/
        
        System.out.println("\tTest case #3");
        
        //input values for test case 3
        totalPeople = 40;
        daysAtSea = 30;
        expResult = -1;
        
        //InventoryControl instance = new InventoryControl();//
        
        result = instance.calcWaterNeeded(totalPeople, daysAtSea);
        
        assertEquals(expResult, result, 0.0001);
        // **TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype."); //
        
        
        
        /******************/
        /***Test case #4***/
        /******************/
        
        System.out.println("\tTest case #4");
        
        //input values for test case 4
        totalPeople = 30;
        daysAtSea = 29;
        expResult = 435;
        
        //InventoryControl instance = new InventoryControl();//
        
        result = instance.calcWaterNeeded(totalPeople, daysAtSea);
        
        assertEquals(expResult, result, 0.0001);
        // **TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype."); //
        
        
        
        /******************/
        /***Test case #5***/
        /******************/
        
        System.out.println("\tTest case #5");
        
        //input values for test case 5
        totalPeople = 0;
        daysAtSea = 30;
        expResult = -1;
        
        //InventoryControl instance = new InventoryControl();//
        
        result = instance.calcWaterNeeded(totalPeople, daysAtSea);
        
        assertEquals(expResult, result, 0.0001);
        // **TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype."); //
        
        
        
        /******************/
        /***Test case #6***/
        /******************/
        
        System.out.println("\tTest case #6");
        
        //input values for test case 6
        totalPeople = 30;
        daysAtSea = 30;
        expResult = 450;
        
        //InventoryControl instance = new InventoryControl();//
        
        result = instance.calcWaterNeeded(totalPeople, daysAtSea);
        
        assertEquals(expResult, result, 0.0001);
        // **TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype."); //
        
        
        
        /******************/
        /***Test case #7***/
        /******************/
        
        System.out.println("\tTest case #7");
        
        //input values for test case 7
        totalPeople = 30;
        daysAtSea = 30;
        expResult = 450;
        
        //InventoryControl instance = new InventoryControl();//
        
        result = instance.calcWaterNeeded(totalPeople, daysAtSea);
        
        assertEquals(expResult, result, 0.0001);
        // **TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype."); //
        
        
        
        /******************/
        /***Test case #8***/
        /******************/
        
        System.out.println("\tTest case #8");
        
        //input values for test case 8
        totalPeople = 30;
        daysAtSea = 1;
        expResult = 15;
        
        //InventoryControl instance = new InventoryControl();//
        
        result = instance.calcWaterNeeded(totalPeople, daysAtSea);
        
        assertEquals(expResult, result, 0.0001);
        // **TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype."); //
    }   

    /**
     * Test of calcQuantityOfMunitions method, of class InventoryControl.
     */
    @Test
    public void testCalcQuantityOfMunitions() {
        // System.out.println("calcQuantityOfMunitions");
        System.out.println("calcQuantityOfMunitions");
        System.out.println("\tTest case #1");
        double totalPeople = 30;
        double bulletsPerGun = 100;
        InventoryControl instance = new InventoryControl();
        double expResult = 6120;
        double result = instance.calcQuantityOfMunitions(totalPeople, bulletsPerGun);
        assertEquals(expResult, result, 0.0001);

        System.out.println("\tTest case #2");
        totalPeople = 3;
        bulletsPerGun = 50;
        expResult = -1.0;
        result = instance.calcQuantityOfMunitions(totalPeople, bulletsPerGun);
        assertEquals(expResult, result, 0.0001);       

        System.out.println("\tTest case #3");
        totalPeople = 1;
        bulletsPerGun = 110;
        expResult = -1.0;
        result = instance.calcQuantityOfMunitions(totalPeople, bulletsPerGun);
        assertEquals(expResult, result, 0.0001);

        System.out.println("\tTest case #4");
        totalPeople = 0;
        bulletsPerGun = 100;
        expResult = -1.0;
        result = instance.calcQuantityOfMunitions(totalPeople, bulletsPerGun);
        assertEquals(expResult, result, 0.0001);

        System.out.println("\tTest case #5");
        totalPeople = 30;
        bulletsPerGun = 0;
        expResult = -1.0;
        result = instance.calcQuantityOfMunitions(totalPeople, bulletsPerGun);
        assertEquals(expResult, result, 0.0001);

        System.out.println("\tTest case #6");
        totalPeople = 3;
        bulletsPerGun = 50;
        expResult = -1.0;
        result = instance.calcQuantityOfMunitions(totalPeople, bulletsPerGun);
        assertEquals(expResult, result, 0.0001);
        
        
      
    }


    /**
     * Test of calcQtyOfFood method, of class InventoryControl.
     */

    @Test
    public void testCalcQtyOfFood() {
        System.out.println("calcQtyOfFood");
        
        
        /******************/
        /***Test case #1 - Food***/
        /******************/
        
        System.out.println("\tTest case #1 for Food");
        double totalPeople = 30;
        double daysAtSea = 10;
        double mealsPerDay = 3;
        InventoryControl instance = new InventoryControl();
        double expResult = 900;
        double result = instance.calcQtyOfFood(totalPeople, daysAtSea, mealsPerDay);
        assertEquals(expResult, result, 0.0001);
        
        
        System.out.println("\tTest case #2 for Food");
        totalPeople = -1;
        daysAtSea = 10;
        mealsPerDay = 3;
        expResult = -1.0;
        result = instance.calcQtyOfFood(totalPeople, daysAtSea, mealsPerDay);
        assertEquals(expResult, result, 0.0001);
       
    }
      
    
        /******************/
        /***Test case #2 - Food***/
        /******************/
        
       
        

    
}
