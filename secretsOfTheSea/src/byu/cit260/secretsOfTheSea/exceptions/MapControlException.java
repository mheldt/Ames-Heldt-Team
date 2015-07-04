/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.secretsOfTheSea.exceptions;

/**
 *
 * @author MarkH
 */
public class MapControlException extends Exception {

    /**
     * Creates a new instance of <code>MapControlException</code> without detail
     * message.
     */
    public MapControlException() {
    }

    /**
     * Constructs an instance of <code>MapControlException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public MapControlException(String msg) {
        super(msg);
    }
}
