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
 * @author d1390
 */
public class RemoteBulb extends Sensore{
    
    public RemoteBulb (int  id, Location location, float batteryLevel, boolean powerStatus){
    
        super(id, batteryLevel, location, powerStatus);
                
    }    
    
    /**
     * Viene impostato una variabile "interruttore" (pSwitch) che gestisce l'accensione e lo spegnimento del 
     * RemoteBulb
     * 
     * @param pSwitch 
     */
    public void SetPower(boolean pSwitch){
    
        this.powerStatus = pSwitch;
    
    }
    
}
