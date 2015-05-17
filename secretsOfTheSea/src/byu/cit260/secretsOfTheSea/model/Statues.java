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
public class Statues implements Serializable{
    
    private String statueType;
    private String statueDescription;

    public Statues() {
    }
    
    

    public String getStatueType() {
        return statueType;
    }

    public void setStatueType(String statueType) {
        this.statueType = statueType;
    }

    public String getStatueDescription() {
        return statueDescription;
    }

    public void setStatueDescription(String statueDescription) {
        this.statueDescription = statueDescription;
    }

    @Override
    public String toString() {
        return "Statues{" + "statueType=" + statueType + ", statueDescription=" + statueDescription + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.statueType);
        hash = 47 * hash + Objects.hashCode(this.statueDescription);
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
        final Statues other = (Statues) obj;
        if (!Objects.equals(this.statueType, other.statueType)) {
            return false;
        }
        if (!Objects.equals(this.statueDescription, other.statueDescription)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
