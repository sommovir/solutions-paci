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
public class RemoteAdvancedBulb extends RemoteBulb{
    private String rgb;

    public RemoteAdvancedBulb(String rgb, String name, String id, float batteryLevel, boolean on) {
        super(name, id, batteryLevel, on);
        this.rgb = rgb;
    }

    public String getRgb() {
        return rgb;
    }

    public void setRgb(String rgb) {
        if(rgb.matches("\\b([A-F]|[0-9]){6}\\b")){
            this.rgb = rgb;
        }
        return;
    }

    @Override
    public String getId() {
       return "E";
    }
    


}
