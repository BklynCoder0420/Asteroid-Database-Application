/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASTEROID;

import FACTORY.*;
import java.sql.SQLException;
/**
 *
 * @author lincoln
 */
public class AsteroidCarbon extends Asteroid {
    
    public AsteroidCarbon(String Designation) throws SQLException, ClassNotFoundException {
        this.setDesignation(Designation);
        this.setRegistry(AsteroidAssembler.buildRegistry(Designation));
        this.setLocation(AsteroidAssembler.buildSpatialCoord(Designation));
        this.setSpecs(AsteroidAssembler.buildSpecification(Designation));
        this.setOrbit(AsteroidAssembler.buildOrbit(Designation));
        this.setsComp(AsteroidAssembler.buildSimpleComposition(Designation));
        this.setpComp(AsteroidAssembler.buildPreciousComposition(Designation));
        this.setcComp(AsteroidAssembler.buildCommonComposition(Designation));
        this.setStComp(AsteroidAssembler.buildStrategicComposition(Designation));
    }

    @Override
    public String toString() {
        return getRegistry() + "<br><br>" + getLocation() + "<br><br>" + getSpecs() + "<br><br>" + getOrbit() + 
                "<br><br>" + getsComp() + "<br><br>" + getpComp() + "<br><br>" + getcComp() + "<br><br>" + getStComp();
    }
}