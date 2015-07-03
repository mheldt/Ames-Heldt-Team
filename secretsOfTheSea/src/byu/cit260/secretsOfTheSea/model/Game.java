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
    
    private double totalTime;
    private Ships ship;
    private InventoryItem[] inventory;
    private Player player;
    private long noOfPlayers;
    private String [] actor;
    
   
    
    
    
            

    public Game() {
    }
    

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Long totalTime) {
        this.totalTime = totalTime;
    }
    
    
    public Ships getShip() {
        return ship;
    }
    
    public void setShip(Ships ships) {
        this.ship = ship;
    }
    
    
    public InventoryItem [] getInventory() {
        return inventory;
    }
    
    
    
    

    public Long getNoOfPlayers() {
        return noOfPlayers;
    }

    public void setNoOfPlayers(long noOfPlayers) {
        this.noOfPlayers = noOfPlayers;
        
    }
    
    
    public Player getPlayer() {
        return player;
    }
    
    public void setPlayer (Player player) {
        this.player = player;
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

    public void setShips(Ships ships) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Map getMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
