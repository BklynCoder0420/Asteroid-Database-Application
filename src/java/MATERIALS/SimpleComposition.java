/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MATERIALS;

/**
 *
 * @author lincoln
 */
public class SimpleComposition {
    
    private String Designation;
    private double Rock;
    private double Metal;
    
    public SimpleComposition(String Designation, double Rock, double Metal) {
        
        this.Designation = Designation;
        this.Rock = Rock;
        this.Metal = Metal;
    }
    
    public String toString() {
        return "Simple Composition Designation: " + getDesignation() + "&emsp;Rock: " + getRock() + "&emsp;Metal: " + getMetal();
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
     * @return the Rock
     */
    public double getRock() {
        return Rock;
    }

    /**
     * @param Rock the Rock to set
     */
    public void setRock(double Rock) {
        this.Rock = Rock;
    }

    /**
     * @return the Metal
     */
    public double getMetal() {
        return Metal;
    }

    /**
     * @param Metal the Metal to set
     */
    public void setMetal(double Metal) {
        this.Metal = Metal;
    }  
}