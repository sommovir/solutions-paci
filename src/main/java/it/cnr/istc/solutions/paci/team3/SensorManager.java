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

    List<Sensor> listaSensori = new LinkedList<>();
    List<Sensor> listaSensoriConnessi = new LinkedList<>();
    

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
     * @param s
     * @param Sensori
     * @return n_sensori
     */
    public static int getActiveSensorNumber(Sensor s, List<Sensor> Sensori) {
        int n_sensori=0;
        if (s.stato == true) {
            Sensori.add(s);
            n_sensori += +1;
        }

        return n_sensori;
    }

    /**
     * Aggiungi un sensore alla corrente
     *
     * @param s
     * @param Sensori
     */
    public static void addSensor(Sensor s, List<Sensor> Sensori, List<Sensor> listaAccesi) {
        for (Sensor sensor : Sensori) {
            if(sensor.stato==true)
            {
                listaAccesi.add(sensor);
            }
        }

    }

    /**
     * Ritorna la lista dei sensori con batteria meno del 20%
     *
     * @return 
     */
    public static List<Sensor> listSensorBatteryLow(List<Sensor> Sensori) {
        List<Sensor> listaBatterylow = new LinkedList<>();

        for (Sensor sensor : Sensori) {
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
    public static boolean ischeckLock(Door_Lock d) {
        if(d.stato==true){
            return false;
        }
        return true;
    }
    
}
