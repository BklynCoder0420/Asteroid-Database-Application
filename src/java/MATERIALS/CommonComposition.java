/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MATERIALS;

/**
 *
 * @author lincoln
 */
public class CommonComposition {
    
    private String Designation;
    private double Nickel;
    private double Molybdenum;
    private double Iron;
    private double Zinc;
    
    public CommonComposition(String Designation, double Nickel, double Molybdenum, double Iron, double Zinc) {
        
        this.Designation = Designation;
        this.Nickel = Nickel;
        this.Molybdenum = Molybdenum;
        this.Iron = Iron;
        this.Zinc = Zinc;
    }
    
    public String toString() {
        return "Common Composition Designation: " + getDesignation() + "&emsp;Nickel: " + getNickel() + "&emsp;Molybdenum: " +
            getMolybdenum() + "&emsp;Iron: " + getIron() + "&emsp;Zinc: " + getZinc();
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
     * @return the Nickel
     */
    public double getNickel() {
        return Nickel;
    }

    /**
     * @param Nickel the Nickel to set
     */
    public void setNickel(double Nickel) {
        this.Nickel = Nickel;
    }

    /**
     * @return the Molybdenum
     */
    public double getMolybdenum() {
        return Molybdenum;
    }

    /**
     * @param Molybdenum the Molybdenum to set
     */
    public void setMolybdenum(double Molybdenum) {
        this.Molybdenum = Molybdenum;
    }

    /**
     * @return the Iron
     */
    public double getIron() {
        return Iron;
    }

    /**
     * @param Iron the Iron to set
     */
    public void setIron(double Iron) {
        this.Iron = Iron;
    }

    /**
     * @return the Zinc
     */
    public double getZinc() {
        return Zinc;
    }

    /**
     * @param Zinc the Zinc to set
     */
    public void setZinc(double Zinc) {
        this.Zinc = Zinc;
    } 
}