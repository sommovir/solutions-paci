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
public abstract class Sensor {
    
    protected int id;
    protected String nome;
    protected boolean stato;
    protected Location luogo;

    public Sensor(int id, String nome, boolean stato, Location luogo) {
        this.id = id;
        this.nome = nome;
        this.stato = stato;
        this.luogo = luogo;
    }
    
    
    
    
}
