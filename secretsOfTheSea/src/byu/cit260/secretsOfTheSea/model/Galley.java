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
public class Galley implements Serializable{
    
    // class instance variables
    private String fuelType;
    private Double shipLength;
    private Double shipWidth;
    private Double shipHeight;
    private Double shipWeight;

    public Galley() {
    }

    
    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Double getShipLength() {
        return shipLength;
    }

    public void setShipLength(Double shipLength) {
        this.shipLength = shipLength;
    }

    public Double getShipWidth() {
        return shipWidth;
    }

    public void setShipWidth(Double shipWidth) {
        this.shipWidth = shipWidth;
    }

    public Double getShipHeight() {
        return shipHeight;
    }

    public void setShipHeight(Double shipHeight) {
        this.shipHeight = shipHeight;
    }

    public Double getShipWeight() {
        return shipWeight;
    }

    public void setShipWeight(Double shipWeight) {
        this.shipWeight = shipWeight;
    }

    @Override
    public String toString() {
        return "Galley{" + "fuelType=" + fuelType + ", shipLength=" + shipLength + ", shipWidth=" + shipWidth + ", shipHeight=" + shipHeight + ", shipWeight=" + shipWeight + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.fuelType);
        hash = 29 * hash + Objects.hashCode(this.shipLength);
        hash = 29 * hash + Objects.hashCode(this.shipWidth);
        hash = 29 * hash + Objects.hashCode(this.shipHeight);
        hash = 29 * hash + Objects.hashCode(this.shipWeight);
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
        final Galley other = (Galley) obj;
        if (!Objects.equals(this.fuelType, other.fuelType)) {
            return false;
        }
        if (!Objects.equals(this.shipLength, other.shipLength)) {
            return false;
        }
        if (!Objects.equals(this.shipWidth, other.shipWidth)) {
            return false;
        }
        if (!Objects.equals(this.shipHeight, other.shipHeight)) {
            return false;
        }
        if (!Objects.equals(this.shipWeight, other.shipWeight)) {
            return false;
        }
        return true;
    }
    
    
}
