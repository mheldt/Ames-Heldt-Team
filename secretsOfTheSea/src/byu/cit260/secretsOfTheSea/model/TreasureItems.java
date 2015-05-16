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
public class TreasureItems implements Serializable{
    
    
    // class instance variable
    private String treasureType;
    private String minQty;
    private String maxQty;

    public TreasureItems() {
    }

    
    public String getTreasureType() {
        return treasureType;
    }

    public void setTreasureType(String treasureType) {
        this.treasureType = treasureType;
    }

    public String getMinQty() {
        return minQty;
    }

    public void setMinQty(String minQty) {
        this.minQty = minQty;
    }

    public String getMaxQty() {
        return maxQty;
    }

    public void setMaxQty(String maxQty) {
        this.maxQty = maxQty;
    }

    @Override
    public String toString() {
        return "TreasureItems{" + "treasureType=" + treasureType + ", minQty=" + minQty + ", maxQty=" + maxQty + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.treasureType);
        hash = 97 * hash + Objects.hashCode(this.minQty);
        hash = 97 * hash + Objects.hashCode(this.maxQty);
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
        final TreasureItems other = (TreasureItems) obj;
        if (!Objects.equals(this.treasureType, other.treasureType)) {
            return false;
        }
        if (!Objects.equals(this.minQty, other.minQty)) {
            return false;
        }
        if (!Objects.equals(this.maxQty, other.maxQty)) {
            return false;
        }
        return true;
    }
    
    
}
