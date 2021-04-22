/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.istc.solutions.paci.team2;

/**
 *
 * @author Simone
 */
public abstract class Sensor {
    protected String name;
    protected String id;
    protected float batteryLevel;
    protected boolean on;

    /*
    A-123 == PIR
    B-333 == DOOR_LOCK
    C-366 == POWER_PLUG
    D-853 == REMOTE_BULB
    E-986 == REMOTE_ADVANCED_BULB
    */
    
    public Sensor() {
    }

    public Sensor(String name, String id, float batteryLevel, boolean on) {
        this.name = name;
        this.id = id;
        this.batteryLevel = batteryLevel;
        this.on = on;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(float batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public abstract String getId();
    
    public String getIdentificationCode(){
        return getId() + "-" + this.id;
    }
}
