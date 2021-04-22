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
public class DoorLock extends Sensor{
    
    private boolean contact;

    public DoorLock() {
    }
    
    public DoorLock(boolean contact, String name, String id, float batteryLevel, boolean on) {
        super(name, id, batteryLevel, on);
        this.contact = contact;
    }
    
    public String isContact() {
        if(contact){
            return "lock";
        }
        else{
            return "unlock";
        }
    }
    
    @Override
    public String getId() {
        return "B";
    }
}
