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
public class PIR extends Sensore{
    
    public PIR (int  id, Location location, float batteryLevel, boolean powerStatus){
    
        super(id, batteryLevel, location, powerStatus);           
    
    }
    
    public boolean getStatus(boolean ritorno){
    
        if(ritorno)
            return true;
        else  
            return false;
    }
    
    
}
