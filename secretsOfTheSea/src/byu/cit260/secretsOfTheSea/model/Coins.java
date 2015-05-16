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
public class Coins implements Serializable{
   
    private String coinType;
    private Double coinValue;
    private Double coinWeight;

    public Coins() {
    }

    
    public String getCoinType() {
        return coinType;
    }

    public void setCoinType(String coinType) {
        this.coinType = coinType;
    }

    public Double getCoinValue() {
        return coinValue;
    }

    public void setCoinValue(Double coinValue) {
        this.coinValue = coinValue;
    }

    public Double getCoinWeight() {
        return coinWeight;
    }

    public void setCoinWeight(Double coinWeight) {
        this.coinWeight = coinWeight;
    }

    @Override
    public String toString() {
        return "Coins{" + "coinType=" + coinType + ", coinValue=" + coinValue + ", coinWeight=" + coinWeight + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.coinType);
        hash = 29 * hash + Objects.hashCode(this.coinValue);
        hash = 29 * hash + Objects.hashCode(this.coinWeight);
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
        final Coins other = (Coins) obj;
        if (!Objects.equals(this.coinType, other.coinType)) {
            return false;
        }
        if (!Objects.equals(this.coinValue, other.coinValue)) {
            return false;
        }
        if (!Objects.equals(this.coinWeight, other.coinWeight)) {
            return false;
        }
        return true;
    }
    
    
}
