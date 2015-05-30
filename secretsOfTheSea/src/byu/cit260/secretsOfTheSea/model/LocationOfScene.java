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
 * @author jacieames
 */
public class LocationOfScene implements Serializable{
    
    private Double row; 
    private Double column;
    private String visited;
    private Double amountRemaining;

    public LocationOfScene() {
    }
    
    

    public Double getRow() {
        return row;
    }

    public void setRow(Double row) {
        this.row = row;
    }

    public Double getColumn() {
        return column;
    }

    public void setColumn(Double column) {
        this.column = column;
    }

    public String getVisited() {
        return visited;
    }

    public void setVisited(String visited) {
        this.visited = visited;
    }

    public Double getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(Double amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    @Override
    public String toString() {
        return "LocationOfScene{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", amountRemaining=" + amountRemaining + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.row);
        hash = 43 * hash + Objects.hashCode(this.column);
        hash = 43 * hash + Objects.hashCode(this.visited);
        hash = 43 * hash + Objects.hashCode(this.amountRemaining);
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
        final LocationOfScene other = (LocationOfScene) obj;
        if (!Objects.equals(this.row, other.row)) {
            return false;
        }
        if (!Objects.equals(this.column, other.column)) {
            return false;
        }
        if (!Objects.equals(this.amountRemaining, other.amountRemaining)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}