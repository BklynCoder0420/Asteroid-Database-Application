/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package COMPONENTS;

/**
 *
 * @author lincoln
 */
public class SpatialCoord {
    
    private String Designation;
    private double X;
    private double Y;
    private double Z;
    
    public SpatialCoord(String Designation, double X, double Y, double Z) {
        this.Designation = Designation;
        this.X = X;
        this.Y = Y;
        this.Z = Z;
    }
    
    public String toString() {
        return "Spatial Coord Designation: " + getDesignation() + "&emsp;X: " + getX() + "&emsp;Y: " + getY() + "&emsp;Z: " + getZ();
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
     * @return the X
     */
    public double getX() {
        return X;
    }

    /**
     * @param X the X to set
     */
    public void setX(double X) {
        this.X = X;
    }

    /**
     * @return the Y
     */
    public double getY() {
        return Y;
    }

    /**
     * @param Y the Y to set
     */
    public void setY(double Y) {
        this.Y = Y;
    }

    /**
     * @return the Z
     */
    public double getZ() {
        return Z;
    }

    /**
     * @param Z the Z to set
     */
    public void setZ(double Z) {
        this.Z = Z;
    } 
}