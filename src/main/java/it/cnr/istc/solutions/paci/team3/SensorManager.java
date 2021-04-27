/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.istc.solutions.paci.team3;

import java.util.LinkedList;
import java.util.List;

/**
 * /** * and open the template in the editor.
 *
 * @author Alessio
 */
public class SensorManager {

    static List<Sensor> listaSensori = new LinkedList<>();
    static List<Sensor> listaSensoriConnessi = new LinkedList<>();
    
    
    private static SensorManager _instance = null;
    
    
    public static SensorManager getInstance() {
        if (_instance == null) {
            _instance = new SensorManager();
            return _instance;
        } else {
            return _instance;
        }
    }
    
    private SensorManager() {
        super();
    }
    
    
    public static void nightMode(boolean stato) {
        for(Sensor x : listaSensoriConnessi){
            if(x.stato == true)//Se accesa
            {
               x.stato = false; 
            }
        }

    }

    public static void goodMorning() {
        for(Sensor x : listaSensoriConnessi){
            if((x instanceof Remote_Bulb || x instanceof Remote_Advanced_Bulb) && x.luogo.equals("CAMERA_DA_LETTO"))//Se accesa
            {
               x.stato = true; 
            }
        }
    }

    public static void red_alarm() {
        int y[] = new int[3];
        y[0] = 255;
        y[1] = 0;
        y[2] = 0;
        for(Sensor x : listaSensoriConnessi){
            if(x instanceof Remote_Advanced_Bulb)
            {
               ((Remote_Advanced_Bulb) x).Change_Color(y); 
            }
        }
        

    }

    public static void setPowerPlugById(int id,boolean s) {
        
        for(Sensor x : listaSensori){
            if(x.id == id)
            {
               x.stato = s; 
            }
        }

    }

    //Lista dati dei sensori
    /**
     *
     * Riporta il numero dei sensori correttamente installati
     *
     * @return n_sensori
     */
    public static int getActiveSensorNumber() {

        return listaSensori.size();
    }

    /**
     * Aggiungi un sensore alla corrente
     *
     * @param s
     * @param Sensori
     */
    public static void addSensor(Sensor s) {
        if(s==null || s.nome.isEmpty() || s.luogo==null || s.livello_batteria<0)
        {
            return;
        }
        for (Sensor sensor : listaSensori) {
            if(sensor.stato==true)
            {
                listaSensoriConnessi.add(sensor);
            }
        }

    }

    /**
     * Ritorna la lista dei sensori con batteria meno del 20%
     *
     * @return 
     */
    public static List<Sensor> listSensorBatteryLow() {
    List<Sensor> listaBatterylow = new LinkedList<>();

        for (Sensor sensor : listaSensori) {
            if (sensor.livello_batteria < 20) {
                listaBatterylow.add(sensor);
            }
        }
        return listaBatterylow;
    }

    /**
     * Ritorna false se c'è almeno un DOOR_LOCK connesso
     *
     * @return
     */
    public static boolean ischeckLock() {
        for(Sensor s : listaSensoriConnessi){
             if(s instanceof Door_Lock){
                    return false;
            }
        }
        return true;
    }
    
}
