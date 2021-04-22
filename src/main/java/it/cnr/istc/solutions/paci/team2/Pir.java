/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.istc.solutions.paci.team2;

/**
 *
 * @author Simone
 */
public class Pir extends Sensor{
    
    private boolean movmentCheck = false;

    public Pir() {
    }
    
    public void isMovmentCheck(){
        if(!movmentCheck){
            movmentCheck = true;
        }
                
    }
    
    
    @Override
    public String getId(){
        return "A";
    }
}
