/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secretsofthesea;

import byu.cit260.secretsOfTheSea.model.Actor;
import byu.cit260.secretsOfTheSea.model.Player;
import byu.cit260.secretsOfTheSea.model.Artifacts;
import byu.cit260.secretsOfTheSea.model.Clipper;
import byu.cit260.secretsOfTheSea.model.Coins;
import byu.cit260.secretsOfTheSea.model.Dirigible;
import byu.cit260.secretsOfTheSea.model.Dock;
import byu.cit260.secretsOfTheSea.model.Food;
import byu.cit260.secretsOfTheSea.model.Fuel;
import byu.cit260.secretsOfTheSea.model.Galley;
import byu.cit260.secretsOfTheSea.model.Gems;
import byu.cit260.secretsOfTheSea.model.InventoryItem;
import byu.cit260.secretsOfTheSea.model.IronClad;
import byu.cit260.secretsOfTheSea.model.Munitions;
import byu.cit260.secretsOfTheSea.model.ObstacleMessage;
import byu.cit260.secretsOfTheSea.model.Ports;
import byu.cit260.secretsOfTheSea.model.Ships;
import byu.cit260.secretsOfTheSea.model.Submersible;
import byu.cit260.secretsOfTheSea.model.TimeClock;
import byu.cit260.secretsOfTheSea.model.TreasureItems;
import byu.cit260.secretsOfTheSea.model.Water;
import byu.cit260.secretsOfTheSea.model.Actor;

/**
 *
 * @author jacieames & markheldt
 */
public class SecretsOfTheSea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Player playerOne = new Player();
        Artifacts artifactsOne = new Artifacts();
        Clipper clipperOne = new Clipper();
        Coins coinsOne = new Coins();
        Dirigible dirigibleOne = new Dirigible();
        Dock dockOne = new Dock();
        Food foodOne = new Food();
        Fuel fuelOne = new Fuel();
        Galley galleyOne = new Galley();
        Gems gemsOne = new Gems();
        InventoryItem inventoryItemOne = new InventoryItem();
        IronClad ironCladOne = new IronClad();
        Munitions munitionsOne = new Munitions();
        ObstacleMessage obstacleMessageOne = new ObstacleMessage();
        Ports portsOne = new Ports();
        Ships shipsOne = new Ships();
        Submersible submersibleOne = new Submersible();
        TimeClock timeClockOne = new TimeClock();
        TreasureItems treasureItemsOne = new TreasureItems();
        Water waterOne = new Water();
        Actor actorOne = new Actor();
        
        playerOne.setName("Abby");
        playerOne.setBestTime(7.00);
        
        treasureItemsOne.setTreasureType("Treasure Type");
        treasureItemsOne.setMinQty("1");
        treasureItemsOne.setMaxQty("9");
        
        artifactsOne.setArtifactType("Artifact");
        artifactsOne.setArtifactValue(1.00);
        artifactsOne.setArtifactSize(2.00);
        artifactsOne.setArtifactWeight(3.00);
        
        coinsOne.setCoinType("Coins");
        coinsOne.setCoinValue(1.00);
        coinsOne.setCoinWeight(2.00);
     
        gemsOne.setGemType("Gems");
        gemsOne.setGemValue(1.00);
        gemsOne.setGemWeight(2.00);

        shipsOne.setShipType("Ship Type");
        shipsOne.setInventoryComplete("Y/N");
 
        clipperOne.setFuelType("Clipper");
        clipperOne.setShipLength(1.00);
        clipperOne.setShipHeight(2.00);
        clipperOne.setShipWeight(3.00);
        clipperOne.setShipWidth(4.00);
        
        dirigibleOne.setFuelType("Dirigible");
        dirigibleOne.setShipLength(1.00);
        dirigibleOne.setShipHeight(2.00);
        dirigibleOne.setShipWeight(3.00);
        dirigibleOne.setShipWidth(4.00);

        galleyOne.setFuelType("Galley");
        galleyOne.setShipLength(1.00);
        galleyOne.setShipHeight(2.00);
        galleyOne.setShipWeight(3.00);
        galleyOne.setShipWidth(4.00);

        ironCladOne.setFuelType("IronClad");
        ironCladOne.setShipLength(1.00);
        ironCladOne.setShipHeight(2.00);
        ironCladOne.setShipWeight(3.00);
        ironCladOne.setShipWidth(4.00);

        submersibleOne.setFuelType("Submersible");
        submersibleOne.setShipLength(1.00);
        submersibleOne.setShipHeight(2.00);
        submersibleOne.setShipWeight(3.00);
        submersibleOne.setShipWidth(4.00);

        dockOne.setDockLocation("Docks");
        dockOne.setDockLength(1.00);
        dockOne.setDockHeight(2.00);
        dockOne.setDockWidth(3.00);
        dockOne.setDockSize(8.00);

        portsOne.setPortName("Ports");
        portsOne.setPortAmenities("Services");
        portsOne.setPortcoordinates("Somewhere");
        portsOne.setPortMaster("John Doe");
        portsOne.setPortCountry("Unknown");
        portsOne.setPortStore("Small Country Store");
  
        obstacleMessageOne.setObstacleType("Obstacle");
        obstacleMessageOne.setObstacleLocation("Somewhere");
        obstacleMessageOne.setObstacleDistance(9.00);
 
        timeClockOne.setInputTime("Time Clock");
        timeClockOne.setTravelTime("Travel");
        timeClockOne.setCurrentTime("Current");

        inventoryItemOne.setInventoryType("Inventory");
        inventoryItemOne.setQuantityInStock(1.00);
        inventoryItemOne.setRequiredAmt(2.00);

        foodOne.setFoodType("Food");
        foodOne.setRequiredAmt(7.00);
 
        waterOne.setSize(5.00);
        waterOne.setVolume(2.00);
        waterOne.setWeightPerContainer(20.00);

        fuelOne.setFuelType("Fuel");
        fuelOne.setFuelSize(40.00);
        fuelOne.setFuelPrice(5.25);
        fuelOne.setFuelWeight(40.00);

        munitionsOne.setAmmoType("Ammo");
        munitionsOne.setContainerSize(1.00);
        munitionsOne.setAmmoQtyPerContainer(25.00);
        munitionsOne.setContainerWeight(40.00);
        
        actorOne.setName("Bill Nye");
        actorOne.setDescription("male");
        actorOne.setCoordinates(14.00);
        
        
            
        

        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);

        String treasureItemsInfo = treasureItemsOne.toString();
        System.out.println(treasureItemsInfo);

        String artifactsInfo = artifactsOne.toString();
        System.out.println(artifactsInfo);

        String coinsInfo = coinsOne.toString();
        System.out.println(coinsInfo);

        String gemsInfo = gemsOne.toString();
        System.out.println(gemsInfo);

        String shipsInfo = shipsOne.toString();
        System.out.println(shipsInfo);
 
        String clipperInfo = clipperOne.toString();
        System.out.println(clipperInfo);
 
        String dirigibleInfo = dirigibleOne.toString();
        System.out.println(dirigibleInfo);
 
        String galleyInfo = galleyOne.toString();
        System.out.println(galleyInfo);
 
        String ironCladInfo = ironCladOne.toString();
        System.out.println(ironCladInfo);
 
        String submersibleInfo = submersibleOne.toString();
        System.out.println(submersibleInfo);
 
        String dockInfo = dockOne.toString();
        System.out.println(dockInfo);
 
        String portsInfo = portsOne.toString();
        System.out.println(portsInfo);
 
        String obstacleMessageInfo = obstacleMessageOne.toString();
        System.out.println(obstacleMessageInfo);
 
        String timeClockInfo = timeClockOne.toString();
        System.out.println(timeClockInfo);
 
        String inventoryItemInfo = inventoryItemOne.toString();
        System.out.println(inventoryItemInfo);
 
        String foodInfo = foodOne.toString();
        System.out.println(foodInfo);
 
        String waterInfo = waterOne.toString();
        System.out.println(waterInfo);
 
        String fuelInfo = fuelOne.toString();
        System.out.println(fuelInfo);
 
        String munitionsInfo = munitionsOne.toString();
        System.out.println(munitionsInfo);
        
        String actorInfo = actorOne.toString();
        System.out.println(actorInfo);
        
    }
    
}
