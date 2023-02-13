/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MATERIALS;

/**
 *
 * @author lincoln
 */
public class PreciousComposition {
    
    private String Designation;
    private double Gold;
    private double Silver;
    private double Platinum;
    private double Palladium;
    private double Rhodium;
    private double Ruthenium;
    private double Iridium;
    private double Osmium;
    
    public PreciousComposition(String Designation, double Gold, double Silver, double Platinum, double Palladium,
            double Rhodium, double Ruthenium, double Iridium, double Osmium) {
        
        this.Designation = Designation;
        this.Gold = Gold;
        this.Silver = Silver;
        this.Platinum = Platinum;
        this.Palladium = Palladium;
        this.Ruthenium = Ruthenium;
        this.Rhodium = Rhodium;
        this.Ruthenium = Ruthenium;
        this.Iridium = Iridium;
        this.Osmium = Osmium;
    }
    
    public String toString() {
        return "Precious Composition Designation: " + getDesignation() + "&emsp;Gold: " + getGold() + "&emsp;Silver: " + getSilver()
                + "&emsp;Platinum: " + getPlatinum() + "&emsp;Palladium: " + getPalladium() + "&emsp;Ruthenium: " + getRuthenium() +
                "&emsp;Iridium: " + getIridium() + "&emsp;Osmium: " + getOsmium();
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
     * @return the Gold
     */
    public double getGold() {
        return Gold;
    }

    /**
     * @param Gold the Gold to set
     */
    public void setGold(double Gold) {
        this.Gold = Gold;
    }

    /**
     * @return the Silver
     */
    public double getSilver() {
        return Silver;
    }

    /**
     * @param Silver the Silver to set
     */
    public void setSilver(double Silver) {
        this.Silver = Silver;
    }

    /**
     * @return the Platinum
     */
    public double getPlatinum() {
        return Platinum;
    }

    /**
     * @param Platinum the Platinum to set
     */
    public void setPlatinum(double Platinum) {
        this.Platinum = Platinum;
    }

    /**
     * @return the Palladium
     */
    public double getPalladium() {
        return Palladium;
    }

    /**
     * @param Palladium the Palladium to set
     */
    public void setPalladium(double Palladium) {
        this.Palladium = Palladium;
    }

    /**
     * @return the Rhodium
     */
    public double getRhodium() {
        return Rhodium;
    }

    /**
     * @param Rhodium the Rhodium to set
     */
    public void setRhodium(double Rhodium) {
        this.Rhodium = Rhodium;
    }

    /**
     * @return the Ruthenium
     */
    public double getRuthenium() {
        return Ruthenium;
    }

    /**
     * @param Ruthenium the Ruthenium to set
     */
    public void setRuthenium(double Ruthenium) {
        this.Ruthenium = Ruthenium;
    }

    /**
     * @return the Iridium
     */
    public double getIridium() {
        return Iridium;
    }

    /**
     * @param Iridium the Iridium to set
     */
    public void setIridium(double Iridium) {
        this.Iridium = Iridium;
    }

    /**
     * @return the Osmium
     */
    public double getOsmium() {
        return Osmium;
    }

    /**
     * @param Osmium the Osmium to set
     */
    public void setOsmium(double Osmium) {
        this.Osmium = Osmium;
    }  
}