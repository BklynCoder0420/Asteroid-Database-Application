/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASTEROID;

import COMPONENTS.*;
import MATERIALS.*;
/**
 *
 * @author lincoln
 */
public abstract class Asteroid {
    
    private String Designation;
    private Registry registry;
    private SpatialCoord location;
    private Specification specs;
    private Orbit orbit;
    private CommonComposition cComp;
    private PreciousComposition pComp;
    private SimpleComposition sComp;
    private StrategicComposition stComp;
    
    public Asteroid() {
        
    }
    
    public Asteroid(String Designation, Registry registry, SpatialCoord location, Specification specs, Orbit orbit, 
            CommonComposition cComp, PreciousComposition pComp, SimpleComposition sComp, StrategicComposition stComp) {
        
        this.Designation = Designation;
        this.registry = registry;
        this.location = location;
        this.specs = specs;
        this.orbit = orbit;
        this.cComp = cComp;
        this.pComp = pComp;
        this.sComp = sComp;
        this.stComp = stComp;
    }
    
    
    public String toString() {
        return getDesignation() + getRegistry() + "<br><br>" + getLocation() + "<br><br>" + getSpecs() + "<br><br>" + getOrbit() + 
                "<br><br>" + getsComp() + "<br><br>" + getpComp() + "<br><br>" + getcComp() + "<br><br>" + getStComp();
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
     * @return the registry
     */
    public Registry getRegistry() {
        return registry;
    }

    /**
     * @param registry the registry to set
     */
    public void setRegistry(Registry registry) {
        this.registry = registry;
    }

    /**
     * @return the location
     */
    public SpatialCoord getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(SpatialCoord location) {
        this.location = location;
    }

    /**
     * @return the specs
     */
    public Specification getSpecs() {
        return specs;
    }

    /**
     * @param specs the specs to set
     */
    public void setSpecs(Specification specs) {
        this.specs = specs;
    }

    /**
     * @return the orbit
     */
    public Orbit getOrbit() {
        return orbit;
    }

    /**
     * @param orbit the orbit to set
     */
    public void setOrbit(Orbit orbit) {
        this.orbit = orbit;
    }

    /**
     * @return the cComp
     */
    public CommonComposition getcComp() {
        return cComp;
    }

    /**
     * @param cComp the cComp to set
     */
    public void setcComp(CommonComposition cComp) {
        this.cComp = cComp;
    }

    /**
     * @return the pComp
     */
    public PreciousComposition getpComp() {
        return pComp;
    }

    /**
     * @param pComp the pComp to set
     */
    public void setpComp(PreciousComposition pComp) {
        this.pComp = pComp;
    }

    /**
     * @return the sComp
     */
    public SimpleComposition getsComp() {
        return sComp;
    }

    /**
     * @param sComp the sComp to set
     */
    public void setsComp(SimpleComposition sComp) {
        this.sComp = sComp;
    }

    /**
     * @return the stComp
     */
    public StrategicComposition getStComp() {
        return stComp;
    }

    /**
     * @param stComp the stComp to set
     */
    public void setStComp(StrategicComposition stComp) {
        this.stComp = stComp;
    } 
}