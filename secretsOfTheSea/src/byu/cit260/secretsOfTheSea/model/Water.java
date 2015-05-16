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
public class Water implements Serializable{
    
    // class instance variables
    private Double weightPerContainer;
    private Double size;
    private Double volume;

    public Water() {
    }

    
    public Double getWeightPerContainer() {
        return weightPerContainer;
    }

    public void setWeightPerContainer(Double weightPerContainer) {
        this.weightPerContainer = weightPerContainer;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Water{" + "weightPerContainer=" + weightPerContainer + ", size=" + size + ", volume=" + volume + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.weightPerContainer);
        hash = 59 * hash + Objects.hashCode(this.size);
        hash = 59 * hash + Objects.hashCode(this.volume);
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
        final Water other = (Water) obj;
        if (!Objects.equals(this.weightPerContainer, other.weightPerContainer)) {
            return false;
        }
        if (!Objects.equals(this.size, other.size)) {
            return false;
        }
        if (!Objects.equals(this.volume, other.volume)) {
            return false;
        }
        return true;
    }
    
    
}
