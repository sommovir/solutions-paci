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
    
    private boolean contact;

    public Door_Lock(boolean contact, int id, int livello_batteria, String nome, boolean stato, Location luogo) {
        super(id, livello_batteria, nome, stato, luogo);
        this.contact = contact;
    }
    
    public String Rileva_Contatto(){
        if(contact){
            return "Unlock";
        }
        return "Lock";
    }
    
}
