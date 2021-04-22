/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.istc.solutions.paci.team3;

import java.util.List;

/**
/** * and open the template in the editor.
 *
 * @author Alessio
 */
public class SensorManager {

    
    public static void nightMode(boolean stato){
        
    }
    
    public static void goodMorning(){
        
    }
    
    public static void red_alarm(){
        
    }
    
    public static void setPowerPlugById(int id){
        
    }
            
    

    //Lista dati dei sensori
    /**
     * 
     * Riporta il numero dei sensori correttamente installati
     * @return n_sensori 
     */
    public static int getActiveSensorNumber(){
        return -1;
    }
    /**
     * Aggiungi un sensore alla corrente
     * @param s 
     */
    public static void addSensor(Sensor s){
        
    }
    
    /**
     * Ritorna la lista dei sensori con batteria meno del 20%
     * @return 
     */
    public static List<Sensor> listSensorBatteryLow(){
        return null;
    }
    
    /**
     * Ritorna false se c'è almeno un DOOR_LOCK connesso
     * @return 
     */
    public static boolean ischeckLock(){
        return false;
    }
}
