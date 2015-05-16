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
public class InventoryItem implements Serializable{
    
    // class instance variables
    private String inventoryType;
    private Double quantityInStock;
    private Double requiredAmt;

    public InventoryItem() {
    }

    
    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public Double getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(Double quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public Double getRequiredAmt() {
        return requiredAmt;
    }

    public void setRequiredAmt(Double requiredAmt) {
        this.requiredAmt = requiredAmt;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "inventoryType=" + inventoryType + ", quantityInStock=" + quantityInStock + ", requiredAmt=" + requiredAmt + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.inventoryType);
        hash = 83 * hash + Objects.hashCode(this.quantityInStock);
        hash = 83 * hash + Objects.hashCode(this.requiredAmt);
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
        final InventoryItem other = (InventoryItem) obj;
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        if (!Objects.equals(this.quantityInStock, other.quantityInStock)) {
            return false;
        }
        if (!Objects.equals(this.requiredAmt, other.requiredAmt)) {
            return false;
        }
        return true;
    }
    
    
}
