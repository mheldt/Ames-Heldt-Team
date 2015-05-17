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
public class Game implements Serializable{
    
    private Double totalTime;
    private Double noOfPlayers;

    public Game() {
    }
    

    public Double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Double totalTime) {
        this.totalTime = totalTime;
    }

    public Double getNoOfPlayers() {
        return noOfPlayers;
    }

    public void setNoOfPlayers(Double noOfPlayers) {
        this.noOfPlayers = noOfPlayers;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", noOfPlayers=" + noOfPlayers + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.totalTime);
        hash = 41 * hash + Objects.hashCode(this.noOfPlayers);
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.totalTime, other.totalTime)) {
            return false;
        }
        if (!Objects.equals(this.noOfPlayers, other.noOfPlayers)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
