package byu.cit260.secretsOfTheSea.view;

import byu.cit260.secretsOfTheSea.control.GameControl;
import byu.cit260.secretsOfTheSea.control.InventoryControl;
import byu.cit260.secretsOfTheSea.model.Player;
import java.util.Scanner;

/**
 *
 * @author MarkH
 */

    public class InventoryMenuView extends View {
    public InventoryMenuView() {
        super("\n"
            + "\n|--------------------------------------|"
            + "\n| Inventory Menu                       |"
            + "\n|--------------------------------------|"
            + "\nW - How Much Water Needed "
            + "\nF - How Much Food Needed"
            + "\nA - How Much Ammunition Needed"
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
            case 'W':
                    this.waterNeeded();
                    break;
            case 'F':
                    this.qtyOfFood();
                    break;
            case 'A':
                    this.quantityOfMunitions();
                    break;
            case 'E':
                    return;
            default:
                    System.out.println("\n*** Invalid selection *** Try again");
                    break;
    	}
    }

    private void waterNeeded() {
        System.out.println("*** Calculate Amount of Water Function Called ***");
    }

    private void qtyOfFood() {
        // create a new game
        GameControl.createInventoryMenu(SecretsOfTheSea());
        InventoryMenuView inventoryMenu = new InventoryMenuView();
        inventoryMenu.display();
        //System.out.println("*** Calculate Amount of Food Function Called ***");
    }
    private void quantityOfMunitions() {
        System.out.println("*** Calculate Amount of Ammo Function Called ***");   
    }

    private Player SecretsOfTheSea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    //private void startNewGame() 
    //    GameControl.createGameMenu(SecretsOfTheSea());
    //    GameMenuView gameMenu = new GameMenuView();
    //    gameMenu.display();
    //}