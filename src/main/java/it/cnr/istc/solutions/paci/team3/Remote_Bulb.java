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
public class Remote_Bulb extends Sensor{
    
    private int colori[] = new int[3];

    public Remote_Bulb(int id, String nome, boolean stato, Location luogo,int[] c) {
        super(id, nome, stato, luogo);
        this.colori = c;
    }

    public void setStato(boolean stato) {
        this.stato = stato;
    }
    
    public boolean isValidColor(int[] c){
        for (int i = 0; i < 3; i++) {
            if(c[i]>=0 && c[i]<=255){
                return true;
            }
        }
        return false;
    }
    
}
