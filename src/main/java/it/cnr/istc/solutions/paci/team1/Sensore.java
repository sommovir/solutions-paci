/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.istc.solutions.paci.team1;

/**
 *
 * @author d1390
 */
public abstract class Sensore {
    
    private int id;
    private float batteryLevel;
    private Location location;
    private boolean powerStatus; // On/OFF
    
    public Sensore(){}
    public Sensore(int id, float batteryLevel, Location location, boolean powerStatus){
        
        this.id = id;
        this.batteryLevel = batteryLevel;
        this.location = location;
        this.powerStatus = powerStatus;
        
    }
    
    
    /* -------------------------------------------- */
    
    public int getID(){
    
        return this.id;
        
    }
    public float getBatteryLevel(){
    
        return this.batteryLevel;
    
    } 
    public boolean getPowerStatus(){
    
        return this.powerStatus;
        
    }
    public Location getLocation(){
        
        return this.location;
        
    }
    
    public void setID(int id){
    
        this.id = id;
    
    }   
    public void setBatteryLevel(float batteryLevel){
    
        this.batteryLevel = batteryLevel;
    
    }
    public void setLocation(Location location){
    
        this.location = location;
    
    }
    public void setPowerStatus(boolean powerStatus){
    
        this.powerStatus = powerStatus;
    
    }
    
    
    
}
