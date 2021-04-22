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
public class RemoteBulb extends Sensor{

    public RemoteBulb(String name, String id, float batteryLevel, boolean on) {
        super(name, id, batteryLevel, on);
    }
    
    public void switchOn() {
        on = true;
    }
    public void switchOff() {
        on = false;
    }
    
    @Override
    public String getId() {
        return "D";
    }
}
