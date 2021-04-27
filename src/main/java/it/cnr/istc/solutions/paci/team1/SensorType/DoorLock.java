/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.istc.solutions.paci.team1.SensorType;

import it.cnr.istc.solutions.paci.team1.Location;
import it.cnr.istc.solutions.paci.team1.Sensore;

/**
 *
 * @author Spirito
 */
public class DoorLock extends Sensore {
    
    /*
    private boolean contact;    //false non contatto true contatto.
    private String message;
    */
    
    public DoorLock (/*boolean c,String m,boolean contact,String message,*/int  id, Location location, float batteryLevel, boolean powerStatus){
    
        super(id, batteryLevel, location, powerStatus);
     
        //this.contact = c;
        //this.message = m;
    
    }
    
    //Spirito non sarebbe meglioe evitare di istanziare come attributi contact e messages? passi conctact come parametro e message fai return e basta?
    //ho cambiato... :)
    
    public String getStatus (boolean contact) {
    
    if(!contact) return "unlock";
        else return "lock";        
    
    }        
    
}
