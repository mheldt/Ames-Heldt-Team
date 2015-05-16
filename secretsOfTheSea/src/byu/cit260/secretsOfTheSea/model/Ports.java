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
public class Ports implements Serializable{
    
    // class instance variables
    private String portCountry;
    private String portName;
    private String portcoordinates;
    private String portMaster;
    private String portAmenities;
    private String portStore;

    public Ports() {
    }

    
    public String getPortCountry() {
        return portCountry;
    }

    public void setPortCountry(String portCountry) {
        this.portCountry = portCountry;
    }

    public String getPortName() {
        return portName;
    }

    public void setPortName(String portName) {
        this.portName = portName;
    }

    public String getPortcoordinates() {
        return portcoordinates;
    }

    public void setPortcoordinates(String portcoordinates) {
        this.portcoordinates = portcoordinates;
    }

    public String getPortMaster() {
        return portMaster;
    }

    public void setPortMaster(String portMaster) {
        this.portMaster = portMaster;
    }

    public String getPortAmenities() {
        return portAmenities;
    }

    public void setPortAmenities(String portAmenities) {
        this.portAmenities = portAmenities;
    }

    public String getPortStore() {
        return portStore;
    }

    public void setPortStore(String portStore) {
        this.portStore = portStore;
    }

    @Override
    public String toString() {
        return "Ports{" + "portCountry=" + portCountry + ", portName=" + portName + ", portcoordinates=" + portcoordinates + ", portMaster=" + portMaster + ", portAmenities=" + portAmenities + ", portStore=" + portStore + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.portCountry);
        hash = 79 * hash + Objects.hashCode(this.portName);
        hash = 79 * hash + Objects.hashCode(this.portcoordinates);
        hash = 79 * hash + Objects.hashCode(this.portMaster);
        hash = 79 * hash + Objects.hashCode(this.portAmenities);
        hash = 79 * hash + Objects.hashCode(this.portStore);
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
        final Ports other = (Ports) obj;
        if (!Objects.equals(this.portCountry, other.portCountry)) {
            return false;
        }
        if (!Objects.equals(this.portName, other.portName)) {
            return false;
        }
        if (!Objects.equals(this.portcoordinates, other.portcoordinates)) {
            return false;
        }
        if (!Objects.equals(this.portMaster, other.portMaster)) {
            return false;
        }
        if (!Objects.equals(this.portAmenities, other.portAmenities)) {
            return false;
        }
        if (!Objects.equals(this.portStore, other.portStore)) {
            return false;
        }
        return true;
    }
    
    
}
