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
public class Artifacts implements Serializable{
    
    // class instance variables
    private String artifactType;
    private Double artifactValue;
    private Double artifactSize;
    private Double artifactWeight;

    public Artifacts() {
    }

    
    public String getArtifactType() {
        return artifactType;
    }

    public void setArtifactType(String artifactType) {
        this.artifactType = artifactType;
    }

    public Double getArtifactValue() {
        return artifactValue;
    }

    public void setArtifactValue(Double artifactValue) {
        this.artifactValue = artifactValue;
    }

    public Double getArtifactSize() {
        return artifactSize;
    }

    public void setArtifactSize(Double artifactSize) {
        this.artifactSize = artifactSize;
    }

    public Double getArtifactWeight() {
        return artifactWeight;
    }

    public void setArtifactWeight(Double artifactWeight) {
        this.artifactWeight = artifactWeight;
    }

    @Override
    public String toString() {
        return "Artifacts{" + "artifactType=" + artifactType + ", artifactValue=" + artifactValue + ", artifactSize=" + artifactSize + ", artifactWeight=" + artifactWeight + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.artifactType);
        hash = 23 * hash + Objects.hashCode(this.artifactValue);
        hash = 23 * hash + Objects.hashCode(this.artifactSize);
        hash = 23 * hash + Objects.hashCode(this.artifactWeight);
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
        final Artifacts other = (Artifacts) obj;
        if (!Objects.equals(this.artifactType, other.artifactType)) {
            return false;
        }
        if (!Objects.equals(this.artifactValue, other.artifactValue)) {
            return false;
        }
        if (!Objects.equals(this.artifactSize, other.artifactSize)) {
            return false;
        }
        if (!Objects.equals(this.artifactWeight, other.artifactWeight)) {
            return false;
        }
        return true;
    }
   
}
