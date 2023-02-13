/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MATERIALS;

/**
 *
 * @author lincoln
 */
public class StrategicComposition {
    
    private String Designation;
    private double Chromium;
    private double Cobalt;
    private double Tungsten;
    private double Uranium;
    
    public StrategicComposition(String Designation, double Chromium, double Cobalt, double Tungsten, double Uranium) {
        
        this. Designation = Designation;
        this.Chromium = Chromium;
        this.Cobalt = Cobalt;
        this.Tungsten = Tungsten;
        this.Uranium = Uranium;
    }
    
    public String toString() {
        return "Strategic Composition Designation: " + getDesignation() + "&emsp;Chromium: " + getChromium() + "&emsp;Cobalt: "
                + getCobalt() + "&emsp;Tungsten: " + getTungsten() + "&emsp;Uranium: " + getUranium();
    }

    /**
     * @return the Designation
     */
    public String getDesignation() {
        return Designation;
    }

    /**
     * @param Designation the Designation to set
     */
    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    /**
     * @return the Chromium
     */
    public double getChromium() {
        return Chromium;
    }

    /**
     * @param Chromium the Chromium to set
     */
    public void setChromium(double Chromium) {
        this.Chromium = Chromium;
    }

    /**
     * @return the Cobalt
     */
    public double getCobalt() {
        return Cobalt;
    }

    /**
     * @param Cobalt the Cobalt to set
     */
    public void setCobalt(double Cobalt) {
        this.Cobalt = Cobalt;
    }

    /**
     * @return the Tungsten
     */
    public double getTungsten() {
        return Tungsten;
    }

    /**
     * @param Tungsten the Tungsten to set
     */
    public void setTungsten(double Tungsten) {
        this.Tungsten = Tungsten;
    }

    /**
     * @return the Uranium
     */
    public double getUranium() {
        return Uranium;
    }

    /**
     * @param Uranium the Uranium to set
     */
    public void setUranium(double Uranium) {
        this.Uranium = Uranium;
    } 
}