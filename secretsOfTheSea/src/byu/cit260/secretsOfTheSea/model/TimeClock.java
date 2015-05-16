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
public class TimeClock implements Serializable{
    
    //Class instance variable
    private String travelTime;
    private String inputTime;
    private String currentTime;

    public TimeClock() {
    }
    
    
   

    public String getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(String travelTime) {
        this.travelTime = travelTime;
    }

    public String getInputTime() {
        return inputTime;
    }

    public void setInputTime(String inputTime) {
        this.inputTime = inputTime;
    }

    public String getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

    @Override
    public String toString() {
        return "TimeClock{" + "travelTime=" + travelTime + ", inputTime=" + inputTime + ", currentTime=" + currentTime + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.travelTime);
        hash = 13 * hash + Objects.hashCode(this.inputTime);
        hash = 13 * hash + Objects.hashCode(this.currentTime);
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
        final TimeClock other = (TimeClock) obj;
        if (!Objects.equals(this.travelTime, other.travelTime)) {
            return false;
        }
        if (!Objects.equals(this.inputTime, other.inputTime)) {
            return false;
        }
        if (!Objects.equals(this.currentTime, other.currentTime)) {
            return false;
        }
        return true;
    }
    
    
                    
            
            
}
