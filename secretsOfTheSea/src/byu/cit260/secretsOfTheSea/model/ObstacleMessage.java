/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.secretsOfTheSea.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author MarkH
 */
public class ObstacleMessage implements Serializable{
    
    // class instance variables
    private String obstacleType;
    private String obstacleLocation;
    private Double obstacleDistance;

    public ObstacleMessage() {
    }

    
    public String getObstacleType() {
        return obstacleType;
    }

    public void setObstacleType(String obstacleType) {
        this.obstacleType = obstacleType;
    }

    public String getObstacleLocation() {
        return obstacleLocation;
    }

    public void setObstacleLocation(String obstacleLocation) {
        this.obstacleLocation = obstacleLocation;
    }

    public Double getObstacleDistance() {
        return obstacleDistance;
    }

    public void setObstacleDistance(Double obstacleDistance) {
        this.obstacleDistance = obstacleDistance;
    }

    @Override
    public String toString() {
        return "ObstacleMessage{" + "obstacleType=" + obstacleType + ", obstacleLocation=" + obstacleLocation + ", obstacleDistance=" + obstacleDistance + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.obstacleType);
        hash = 89 * hash + Objects.hashCode(this.obstacleLocation);
        hash = 89 * hash + Objects.hashCode(this.obstacleDistance);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ObstacleMessage other = (ObstacleMessage) obj;
        if (!Objects.equals(this.obstacleType, other.obstacleType)) {
            return false;
        }
        if (!Objects.equals(this.obstacleLocation, other.obstacleLocation)) {
            return false;
        }
        if (!Objects.equals(this.obstacleDistance, other.obstacleDistance)) {
            return false;
        }
        return true;
    }
    
    
}
