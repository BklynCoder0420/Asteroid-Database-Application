/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package COMPONENTS;

/**
 *
 * @author lincoln
 */
public class Orbit {
    
    private String Designation = "Gotcha";
    private double Aphelion;
    private double Perihelion;
    private double Eccentricity;
    private double PeriodOrbit;
    private double RadiusOrbit;
    
    public Orbit() {
        
    }
    public Orbit(String Designation, double Aphelion, double Perihelion, double Eccentricity, double PeriodOrbit, double RadiusOrbit) {
        this.Designation = Designation;
        this.Aphelion = Aphelion;
        this.Perihelion = Perihelion;
        this.Eccentricity = Eccentricity;
        this.PeriodOrbit = PeriodOrbit;
        this.RadiusOrbit = RadiusOrbit;
    }
    
    @Override
    public String toString() {
        return "Orbit Designation: " + getDesignation() + "&emsp;Aphelion: " + getAphelion() + "&emsp;Perihelion: " + getPerihelion() +
                "&emsp;Eccentricity: " + getEccentricity() + "&emsp;Period Orbit: " + getPeriodOrbit() + "&emsp;Radius Orbit: " + getRadiusOrbit();
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
     * @return the Aphelion
     */
    public double getAphelion() {
        return Aphelion;
    }

    /**
     * @param Aphelion the Aphelion to set
     */
    public void setAphelion(double Aphelion) {
        this.Aphelion = Aphelion;
    }

    /**
     * @return the Perihelion
     */
    public double getPerihelion() {
        return Perihelion;
    }

    /**
     * @param Perihelion the Perihelion to set
     */
    public void setPerihelion(double Perihelion) {
        this.Perihelion = Perihelion;
    }

    /**
     * @return the Eccentricity
     */
    public double getEccentricity() {
        return Eccentricity;
    }

    /**
     * @param Eccentricity the Eccentricity to set
     */
    public void setEccentricity(double Eccentricity) {
        this.Eccentricity = Eccentricity;
    }

    /**
     * @return the PeriodOrbit
     */
    public double getPeriodOrbit() {
        return PeriodOrbit;
    }

    /**
     * @param PeriodOrbit the PeriodOrbit to set
     */
    public void setPeriodOrbit(double PeriodOrbit) {
        this.PeriodOrbit = PeriodOrbit;
    }

    /**
     * @return the RadiusOrbit
     */
    public double getRadiusOrbit() {
        return RadiusOrbit;
    }

    /**
     * @param RadiusOrbit the RadiusOrbit to set
     */
    public void setRadiusOrbit(double RadiusOrbit) {
        this.RadiusOrbit = RadiusOrbit;
    }
}