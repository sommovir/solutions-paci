/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.istc.solutions.paci.team3;

/**
 *
 * @author Alessio
 */
public class Pir extends Sensor {

    public Pir(int id, int livello_batteria, String nome, boolean stato, Location luogo) {
        super(id, livello_batteria, nome, stato, luogo);
    }

   

    public boolean isRileva(boolean m){
        if(m == true){
            return true;
        }
        return false;
    }
  
}
