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
public class Ships implements Serializable{
    
    // class instance variables
    private String description;
    private double width;
    private double length;
    private double height;
    private double maxWeightCapacity;
    private String inventoryComplete;

    public Ships() {
        this.description = "This is the ship";
        this.width = 0;
        this.length = 0;
        this.height = 0;
        this.maxWeightCapacity = 0;
        
    }

    
    public String getShipType() {
        return shipType;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType;
    }

    public String getInventoryComplete() {
        return inventoryComplete;
    }

    public void setInventoryComplete(String inventoryComplete) {
        this.inventoryComplete = inventoryComplete;
    }

    @Override
    public String toString() {
        return "Ships{" + "shipType=" + shipType + ", inventoryComplete=" + inventoryComplete + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.shipType);
        hash = 71 * hash + Objects.hashCode(this.inventoryComplete);
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
        final Ships other = (Ships) obj;
        if (!Objects.equals(this.shipType, other.shipType)) {
            return false;
        }
        if (!Objects.equals(this.inventoryComplete, other.inventoryComplete)) {
            return false;
        }
        return true;
    }
    
    
}
