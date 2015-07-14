/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.secretsOfTheSea.view;

import java.io.PrintWriter;
import secretsofthesea.SecretsOfTheSea;

/**
 *
 * @author jacieames

public class ErrorView {
    
    private static final PrintWriter errorFile = SecretsOfTheSea.getOutFile();
    private static final PrintWriter logFile = SecretsOfTheSea.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println{
                    
               "--------------------------------------------"
              + "\n - ERROR - " + errorMessage
              + "\n------------------------------------------");
                
        // log error
        logFile.println(className + " - " + errorMessage);
    
    }
        
        
    }
         
        
    
    
}
 */