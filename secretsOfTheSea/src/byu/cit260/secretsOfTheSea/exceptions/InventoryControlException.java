
package byu.cit260.secretsOfTheSea.exceptions;

/**
 *
 * @author MarkH
 */
public class InventoryControlException extends Exception {

    public InventoryControlException() {
       System.out.println("\tMessage 1"); 
    }

    public InventoryControlException(String message) {
        super(message);
        System.out.println("\t  ");
        System.out.println("\t  ");
        System.out.println("\t*** Check your entry - Incorrect amount ***");

    }

    public InventoryControlException(String message, Throwable cause) {
        super(message, cause);
        System.out.println("\tMessage 3");
    }

    public InventoryControlException(Throwable cause) {
        super(cause);
        System.out.println("\tMessage 4");
    }

    public InventoryControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        System.out.println("\tMessage 5");
    }
  
}
