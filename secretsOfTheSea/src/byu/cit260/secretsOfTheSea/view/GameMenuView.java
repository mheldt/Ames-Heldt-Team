
package byu.cit260.secretsOfTheSea.view;

//import byu.cit260.secretsOfTheSea.control.GameControl;
import byu.cit260.secretsOfTheSea.control.InventoryControl;
import byu.cit260.secretsOfTheSea.model.Player;
import java.util.Scanner;

/**
 *
 * @author jacieames
 */

public class GameMenuView extends View {
    
    public GameMenuView() {
        super("\n"
            + "\n|-------------------------------------|"
            + "\n| Game Menu                           |"
            + "\n|-------------------------------------|"
            + "\nM - Move to a New Location "
            + "\nM - How to Move"
            + "\nO - Explore Location"
            + "\nI - View Inventory"
            + "\nW - Work on the Ship"
            + "\nV - View Ship Status"
            + "\nR - Exchange resources"
            + "\nL - Launch the ship"
            + "\nD - Dock the ship"
            + "\nE - Main Menu"
            + "\n---------------------------------------");
    }
    
    @Override
    public boolean doAction(Object Obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        return false;
    }
    
        private void doAction(char myInput) {
            switch (myInput) {
                case 'G':
                        this.goalOfGame();
                        break;
                case 'M':
                        this.howToMove();
                        break;
                case 'O':
                        this.exploreLocation();
                        break;
                case 'I':
                        this.viewInventory();
                        break;

                case 'W':
                        this.workOnShip();
                        break;

                case 'V':
                        this.viewShipStatus();
                        break;

                case 'R':
                        this.exchangeResources();
                        break;

                case 'L':
                        this.launchShip();
                        break;

                case 'D':
                        this.dockShip();
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

        private void exploreLocation() {
            System.out.println("*** Explore Location Function Called ***");   
        }     

        private void viewInventory() { 
            //System.out.println("*** View Inventory Function Called ***");
            // display Inventory menu
            InventoryControl.createInventoryMenu(SecretsOfTheSea());

            //display the inventory menu
            InventoryMenuView inventoryMenu = new InventoryMenuView();
            inventoryMenu.displayMenu();   
        }

        private void workOnShip() {
            System.out.println("*** Work on Ship Function Called ***");
        }

        private void viewShipStatus() {
            System.out.println("*** View Ship Status Function Called ***");
        }

        private void exchangeResources() {
            System.out.println("*** Exchange Resources Function Called ***");
        }

        private void launchShip() {
            System.out.println("*** Launch Ship Function Called ***");
        }

        private void dockShip() {
            System.out.println("*** Dock Ship Function Called ***");
        }

        private void backToMain() {
            // back to main menu
            MainMenuView mainMenu = new MainMenuView() { };
            mainMenu.display();
            }

        private Player SecretsOfTheSea() {
            return null;
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        //@Override
        //public boolean doAction(Object obj) {
        //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //}
   
   
        //@Override
        //public boolean doAction(Object obj) {
        //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    @Override
    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


  
    
    
    
    
    
    
    
 
