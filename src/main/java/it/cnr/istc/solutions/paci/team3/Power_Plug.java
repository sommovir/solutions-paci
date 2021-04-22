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
public class Power_Plug extends Sensor{
    
    private float consumo;

    public Power_Plug(int batteria, int id, String nome, boolean stato, Location luogo) {
        super(id, nome, stato, luogo);
        this.consumo = batteria;
    }

    public void setStato(boolean stato) {
        this.stato = stato;
    }

    public float getConsumo() {
        return consumo;
    }
    
}
