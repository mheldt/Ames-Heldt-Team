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
public class Gems implements Serializable{
    
    // class instance variables
    private String gemType;
    private Double gemValue;
    private Double gemWeight;

    public Gems() {
    }

    
    public String getGemType() {
        return gemType;
    }

    public void setGemType(String gemType) {
        this.gemType = gemType;
    }

    public Double getGemValue() {
        return gemValue;
    }

    public void setGemValue(Double gemValue) {
        this.gemValue = gemValue;
    }

    public Double getGemWeight() {
        return gemWeight;
    }

    public void setGemWeight(Double gemWeight) {
        this.gemWeight = gemWeight;
    }

    @Override
    public String toString() {
        return "Gems{" + "gemType=" + gemType + ", gemValue=" + gemValue + ", gemWeight=" + gemWeight + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.gemType);
        hash = 79 * hash + Objects.hashCode(this.gemValue);
        hash = 79 * hash + Objects.hashCode(this.gemWeight);
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
        final Gems other = (Gems) obj;
        if (!Objects.equals(this.gemType, other.gemType)) {
            return false;
        }
        if (!Objects.equals(this.gemValue, other.gemValue)) {
            return false;
        }
        if (!Objects.equals(this.gemWeight, other.gemWeight)) {
            return false;
        }
        return true;
    }
    
    
}
