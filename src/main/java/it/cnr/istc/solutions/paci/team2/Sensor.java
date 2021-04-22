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

    public Sensor() {
    }

    public Sensor(String name, String id) {
        this.name = name;
        this.id = id;
    }
    
    public abstract String getId();
    
    public String getIdentificationCode(){
        return getId() + "-" + this.id;
    }
}
