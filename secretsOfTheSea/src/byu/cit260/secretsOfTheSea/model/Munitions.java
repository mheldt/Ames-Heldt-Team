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
public class Munitions implements Serializable{
    
    // class instance variables
    private String ammoType;
    private Double ammoQtyPerContainer;
    private Double containerWeight;
    private Double containerSize;

    public Munitions() {
    }

    
    public String getAmmoType() {
        return ammoType;
    }

    public void setAmmoType(String ammoType) {
        this.ammoType = ammoType;
    }

    public Double getAmmoQtyPerContainer() {
        return ammoQtyPerContainer;
    }

    public void setAmmoQtyPerContainer(Double ammoQtyPerContainer) {
        this.ammoQtyPerContainer = ammoQtyPerContainer;
    }

    public Double getContainerWeight() {
        return containerWeight;
    }

    public void setContainerWeight(Double containerWeight) {
        this.containerWeight = containerWeight;
    }

    public Double getContainerSize() {
        return containerSize;
    }

    public void setContainerSize(Double containerSize) {
        this.containerSize = containerSize;
    }

    @Override
    public String toString() {
        return "Munitions{" + "ammoType=" + ammoType + ", ammoQtyPerContainer=" + ammoQtyPerContainer + ", containerWeight=" + containerWeight + ", containerSize=" + containerSize + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.ammoType);
        hash = 53 * hash + Objects.hashCode(this.ammoQtyPerContainer);
        hash = 53 * hash + Objects.hashCode(this.containerWeight);
        hash = 53 * hash + Objects.hashCode(this.containerSize);
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
        final Munitions other = (Munitions) obj;
        if (!Objects.equals(this.ammoType, other.ammoType)) {
            return false;
        }
        if (!Objects.equals(this.ammoQtyPerContainer, other.ammoQtyPerContainer)) {
            return false;
        }
        if (!Objects.equals(this.containerWeight, other.containerWeight)) {
            return false;
        }
        if (!Objects.equals(this.containerSize, other.containerSize)) {
            return false;
        }
        return true;
    }
    
    
}
