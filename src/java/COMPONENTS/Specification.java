/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package COMPONENTS;

/**
 *
 * @author lincoln
 */
public class Specification {
    
    private String Designation;
    private double Diameter;
    private double Mass;
    private double Density;
    private double Inclination;
    private double Rotation;
    
    public Specification(String Designation, double Diameter, double Mass, double Density, double Inclination, double Rotation) {
        this.Designation = Designation;
        this.Diameter = Diameter;
        this.Mass = Mass;
        this.Density = Density;
        this.Inclination = Inclination;
        this.Rotation = Rotation;
    }
    
    public String toString() {
        return "Specification Designation: " + getDesignation() + "&emsp;Diameter: " + getDiameter() +  "&emsp;Mass: " + getMass()
                +"&emsp;Density: " + getDensity() + "&emsp;Inclination: " + getInclination() + "&emsp;Rotation: " + getRotation();
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
     * @return the Diameter
     */
    public double getDiameter() {
        return Diameter;
    }

    /**
     * @param Diameter the Diameter to set
     */
    public void setDiameter(double Diameter) {
        this.Diameter = Diameter;
    }

    /**
     * @return the Mass
     */
    public double getMass() {
        return Mass;
    }

    /**
     * @param Mass the Mass to set
     */
    public void setMass(double Mass) {
        this.Mass = Mass;
    }

    /**
     * @return the Density
     */
    public double getDensity() {
        return Density;
    }

    /**
     * @param Density the Density to set
     */
    public void setDensity(double Density) {
        this.Density = Density;
    }

    /**
     * @return the Inclination
     */
    public double getInclination() {
        return Inclination;
    }

    /**
     * @param Inclination the Inclination to set
     */
    public void setInclination(double Inclination) {
        this.Inclination = Inclination;
    }

    /**
     * @return the Rotation
     */
    public double getRotation() {
        return Rotation;
    }

    /**
     * @param Rotation the Rotation to set
     */
    public void setRotation(double Rotation) {
        this.Rotation = Rotation;
    }
}