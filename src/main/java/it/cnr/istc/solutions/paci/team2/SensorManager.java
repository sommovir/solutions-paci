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
    
    public int getListSensors(){
        int amount=0;
        for (Sensor sensor : sensorList) {
            amount++;
        }
        return amount;
    }
    
    public void addSensor(Sensor sensor){
        if(sensor == null){
            return;
        }
        sensorList.add(sensor);
    }
    
    public List<Sensor> getLowerTo20(){
        for (Sensor sensor : sensorList) {
            
        }
    }
    
}
