/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.secretsOfTheSea.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author jacieames
 */
public enum Actor implements Serializable{
    
    Jacie("Team Member 1"),
    Mark("Team Member 2");
    
    

    private final String description;
    private final Point coordinates;

    
    Actor(String description) {
        this.description = description;
        coordinates = new Point (1,1);
    }
    
    

    

    public String getDescription() {
        return description;
    }

    

    public Point getCoordinates() {
        return coordinates;
    }

    

    

    
            
    
    
            
    
    
}
