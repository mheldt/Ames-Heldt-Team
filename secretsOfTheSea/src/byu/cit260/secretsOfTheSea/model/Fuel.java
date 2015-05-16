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
public class Fuel implements Serializable{
    
    // class instance variables
    private String fuelType;
    private Double fuelPrice;
    private Double fuelWeight;
    private Double fuelSize;

    public Fuel() {
    }

    
    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Double getFuelPrice() {
        return fuelPrice;
    }

    public void setFuelPrice(Double fuelPrice) {
        this.fuelPrice = fuelPrice;
    }

    public Double getFuelWeight() {
        return fuelWeight;
    }

    public void setFuelWeight(Double fuelWeight) {
        this.fuelWeight = fuelWeight;
    }

    public Double getFuelSize() {
        return fuelSize;
    }

    public void setFuelSize(Double fuelSize) {
        this.fuelSize = fuelSize;
    }

    @Override
    public String toString() {
        return "Fuel{" + "fuelType=" + fuelType + ", fuelPrice=" + fuelPrice + ", fuelWeight=" + fuelWeight + ", fuelSize=" + fuelSize + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.fuelType);
        hash = 59 * hash + Objects.hashCode(this.fuelPrice);
        hash = 59 * hash + Objects.hashCode(this.fuelWeight);
        hash = 59 * hash + Objects.hashCode(this.fuelSize);
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
        final Fuel other = (Fuel) obj;
        if (!Objects.equals(this.fuelType, other.fuelType)) {
            return false;
        }
        if (!Objects.equals(this.fuelPrice, other.fuelPrice)) {
            return false;
        }
        if (!Objects.equals(this.fuelWeight, other.fuelWeight)) {
            return false;
        }
        if (!Objects.equals(this.fuelSize, other.fuelSize)) {
            return false;
        }
        return true;
    }
    
    
}
