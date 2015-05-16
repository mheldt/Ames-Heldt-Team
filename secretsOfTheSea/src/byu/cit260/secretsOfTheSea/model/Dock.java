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
public class Dock implements Serializable{
    
    // class instance variables
    private String dockLocation;
    private Double dockSize;
    private Double dockLength;
    private Double dockWidth;
    private Double dockHeight;

    public Dock() {
    }

    
    public String getDockLocation() {
        return dockLocation;
    }

    public void setDockLocation(String dockLocation) {
        this.dockLocation = dockLocation;
    }

    public Double getDockSize() {
        return dockSize;
    }

    public void setDockSize(Double dockSize) {
        this.dockSize = dockSize;
    }

    public Double getDockLength() {
        return dockLength;
    }

    public void setDockLength(Double dockLength) {
        this.dockLength = dockLength;
    }

    public Double getDockWidth() {
        return dockWidth;
    }

    public void setDockWidth(Double dockWidth) {
        this.dockWidth = dockWidth;
    }

    public Double getDockHeight() {
        return dockHeight;
    }

    public void setDockHeight(Double dockHeight) {
        this.dockHeight = dockHeight;
    }

    @Override
    public String toString() {
        return "Dock{" + "dockLocation=" + dockLocation + ", dockSize=" + dockSize + ", dockLength=" + dockLength + ", dockWidth=" + dockWidth + ", dockHeight=" + dockHeight + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.dockLocation);
        hash = 59 * hash + Objects.hashCode(this.dockSize);
        hash = 59 * hash + Objects.hashCode(this.dockLength);
        hash = 59 * hash + Objects.hashCode(this.dockWidth);
        hash = 59 * hash + Objects.hashCode(this.dockHeight);
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
        final Dock other = (Dock) obj;
        if (!Objects.equals(this.dockLocation, other.dockLocation)) {
            return false;
        }
        if (!Objects.equals(this.dockSize, other.dockSize)) {
            return false;
        }
        if (!Objects.equals(this.dockLength, other.dockLength)) {
            return false;
        }
        if (!Objects.equals(this.dockWidth, other.dockWidth)) {
            return false;
        }
        if (!Objects.equals(this.dockHeight, other.dockHeight)) {
            return false;
        }
        return true;
    }
    
    
}
