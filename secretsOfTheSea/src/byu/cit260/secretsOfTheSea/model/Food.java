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
public class Food implements Serializable{
   
    // class instance variables
    private String foodType;
    private Double requiredAmt;

    public Food() {
    }

    
    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public Double getRequiredAmt() {
        return requiredAmt;
    }

    public void setRequiredAmt(Double requiredAmt) {
        this.requiredAmt = requiredAmt;
    }

    @Override
    public String toString() {
        return "Food{" + "foodType=" + foodType + ", requiredAmt=" + requiredAmt + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.foodType);
        hash = 71 * hash + Objects.hashCode(this.requiredAmt);
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
        final Food other = (Food) obj;
        if (!Objects.equals(this.foodType, other.foodType)) {
            return false;
        }
        if (!Objects.equals(this.requiredAmt, other.requiredAmt)) {
            return false;
        }
        return true;
    }
    
    
}
