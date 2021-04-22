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
public class Door_Lock extends Sensor {

    public Door_Lock(int id, String nome, boolean stato, Location luogo) {
        super(id, nome, stato, luogo);
    }
    
    public boolean Rileva_contatto(boolean c){
        if(c){
            return true;
        }
        return false;
    }
    
}
