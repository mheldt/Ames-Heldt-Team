/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.secretsOfTheSea.control;

import byu.cit260.secretsOfTheSea.exceptions.MapControlException;
import byu.cit260.secretsOfTheSea.model.Actor;
import byu.cit260.secretsOfTheSea.model.Map;
import java.awt.Point;
import javafx.scene.Scene;
import secretsofthesea.SecretsOfTheSea;

/**
 *
 * @author jacieames
 */
public class MapControl {

// Blocking for testing purposes - Part of weeks assignment


    public MapControl() {
        
        // create the map
        //Map map = new Map(20, 20);
        
        // create a list of the different scenes in the game
        Scene[] scenes = createScenes();
        
        //assign the different scenes to locations in the map
        //GameControl.assignScenesToLocations(map, scenes);
        
        //return map;
        //return null;
    }

    public static void moveActorToLocation(Actor actor, Point coordinates) 
            throws MapControlException { 
      
        Map map = SecretsOfTheSea.getCurrentGame().getMap();
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        
        if (newRow < 0 || newRow >= map.getNoOfRows() ||
            newColumn < 0 || newColumn >= map.getNoOfColumns()) {
            
            throw new MapControlException("Can not move actor to location"
                        + coordinates.x + ", " + coordinates.y
                        + "because that location is outside"
                        + "the bounds of the map.");
        }
        
    }

    
    
     public static void moveActorToStartingLocation(Map map) 
            throws MapControlException { 
      
        Actor[] actors = Actor.values();
        // for every actor
        for (Actor actor : actors) {
            Point coordinates = actor.getCoordinates();
            MapControl.moveActorToLocation(actor, coordinates);
        
        
        }
        
    }
    
    
    
    
    
    
    
    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static Scene[] createScenes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
