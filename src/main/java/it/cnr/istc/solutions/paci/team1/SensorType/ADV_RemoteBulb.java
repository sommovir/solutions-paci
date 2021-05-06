/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.istc.solutions.paci.team1.SensorType;

import it.cnr.istc.solutions.paci.team1.Location;

/**
 *
 * @author d1390
 */

public class ADV_RemoteBulb extends RemoteBulb{
    
    int R, G, B;
    
    public ADV_RemoteBulb (int  id, Location location, float batteryLevel, boolean powerStatus, int r, int g, int b){
    
        super(id, location, batteryLevel, powerStatus);
        this.R = r;
        this.G = g;
        this.B = b;
                
    }    
    
    public void setRGB(int r, int g, int b){
    
        this.R = r;
        this.G = g;
        this.B = b;
    
    }         
    
}
