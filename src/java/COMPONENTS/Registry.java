/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package COMPONENTS;

import ENUMS.*;
/**
 *
 * @author lincoln
 */
public class Registry {
    
    private String Designation;
    private AType type;
    private Country nation;
    private String DDate;
    
    public Registry(String Designation, AType type, Country nation, String DDate) {
        this.Designation = Designation;
        this.type = type;
        this.nation = nation;
        this.DDate = DDate;
    }
    
    public String toString() {
        return "Registry Designation: " + getDesignation() + "&emsp;Type: " + getType() + "&emsp;Nation: " + getNation() + "&emsp;Date: " + getDDate();
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
     * @return the type
     */
    public AType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(AType type) {
        this.type = type;
    }

    /**
     * @return the nation
     */
    public Country getNation() {
        return nation;
    }

    /**
     * @param nation the nation to set
     */
    public void setNation(Country nation) {
        this.nation = nation;
    }

    /**
     * @return the DDate
     */
    public String getDDate() {
        return DDate;
    }

    /**
     * @param DDate the DDate to set
     */
    public void setDDate(String DDate) {
        this.DDate = DDate;
    }
}