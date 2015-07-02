
package byu.cit260.secretsOfTheSea.view;

//import byu.cit260.secretsOfTheSea.control.GameControl;
import byu.cit260.secretsOfTheSea.control.InventoryControl;
import byu.cit260.secretsOfTheSea.model.Player;
import java.util.Scanner;

/**
 *
 * @author jacieames
 */

public class GameMenuView {
    
    private final String MENU = "\n"
            
            + "\n---------------------------------------"
            + "\n| Game Menu                           |"
            + "\n|----------------------------         |"
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
            + "\n---------------------------------------";
            
    
    public void displayMenu() {
        
       char selection = ' ';
       do {
            System.out.println(MENU); //display the main menu
            String input = this.getInput(); //get user's selection
            selection = input.charAt(0);//get first character of string
            this.doAction(selection); // do action based on selection   
        } 
        while (selection != 'E'); //a selection is not "Exit"            
    }
    
    private String getInput() {
        boolean valid = false; //indicates if the command has be retrieved
        String selection = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream

        while(!valid) { //while a valid command hasn't been retrieved

            // prompt for the player's selection
            System.out.println("Please make a selection on the menu");

            //get the selection from the keyboard and trim off the blanks
            selection = keyboard.nextLine();
            selection = selection.trim();

            //if name is invalid
            if (selection.length() > 1) {

                System.out.println("Invalid character");
                continue; // and repeat again

            }
            break; // out of the (exit) the repetition
        }

        return selection; // return the selection
       
    }         

    private void doAction(char selection) {
        switch (selection) {
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
        mainMenu.displayMenu();
        }

    private Player SecretsOfTheSea() {
        return null;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
