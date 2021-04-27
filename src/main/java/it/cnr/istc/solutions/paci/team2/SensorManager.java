/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.istc.solutions.paci.team2;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Matteo
 */
public class SensorManager {
    List<Sensor> sensorList = new LinkedList<Sensor>();
    
    /**
     * Metodo che conta il numero  di sensori correttamente installati
     * @return numero sensori correttamente installati
     */
    public int getListSensors(){
        return sensorList.size();
    }
    
    public void addSensor(Sensor sensor){
        if(sensor == null){
            return;
        }
        sensorList.add(sensor);
    }
    
    public List<Sensor> getLowerTo20(){
        List<Sensor> lowerTo20List = new LinkedList<Sensor>();
        
        for (Sensor sensor : sensorList) {
            if(sensor.getBatteryLevel() < 20){
                lowerTo20List.add(sensor);
            }
        }
        
        return lowerTo20List;
    }
    
    public boolean checkLock(){
        for (Sensor sensor : sensorList) {
            if(sensor instanceof DoorLock){
                if(((DoorLock)sensor).isContact().equals("unlock")){
                    return false;
                }
            }
        }
        return true;
    }
    
    public void nightMode(boolean status){
        for (Sensor sensor : sensorList) {
            if(sensor instanceof RemoteBulb){
                if(status == true){
                    ((RemoteBulb) sensor).switchOff();
                }
            }
        }
    }
    
    public void goodMorning(){
        for (Sensor sensor : sensorList) {
            if(sensor instanceof RemoteBulb){
                ((RemoteBulb) sensor).switchOn();
            }
        }
    }
    
    public void redAlarm(){
        for (Sensor sensor : sensorList) {
            if(sensor instanceof RemoteAdvancedBulb){
                ((RemoteAdvancedBulb)sensor).setRgb("FF0000");
            }            
        }
    }
    
    public void setPlugStatus(String id, boolean status){
        for (Sensor sensor : sensorList) {
            if(sensor.getIdentificationCode().equals(id)){
                if(status == true){
                    ((PowerPlug)sensor).switchOn();
                } else {
                    ((PowerPlug)sensor).switchOff();
                }
            }
        }
    }
    
    
}
