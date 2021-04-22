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
public class Remote_Advanced_Bulb extends Remote_Bulb{
    
private int colori[] = new int[3];

    public Remote_Advanced_Bulb(int id, int livello_batteria, String nome, boolean stato, Location luogo) {
        super(id, livello_batteria, nome, stato, luogo);
    }
    
    public void Change_Color(int[] c) {
        for (int i = 0; i < 3; i++) {
            this.colori[i] = c[i];
        }
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
