/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.istc.solutions.paci.team2;


public class PowerPlug extends Sensor{
    private float consumeElettricity;

    public PowerPlug() {
    }

    public PowerPlug(float consumeElettricity) {
        this.consumeElettricity = consumeElettricity;
    }
    
    public void switchOn() {
        on = true;
    }
    public void switchOff() {
        on = false;
    }
    
    
    public float getConsumeElettricity() {
        return consumeElettricity;
    }

    public void setConsumeElettricity(float consumeElettricity) {
        this.consumeElettricity = consumeElettricity;
    }
    
    public String getId(){
        return "C";
    }
}
