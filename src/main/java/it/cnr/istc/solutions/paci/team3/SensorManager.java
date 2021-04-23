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

    public static void nightMode(boolean stato) {

    }

    public static void goodMorning() {

    }

    public static void red_alarm() {

    }

    public static void setPowerPlugById(int id) {

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
