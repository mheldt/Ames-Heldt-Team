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
      
        
        
    
    
}
