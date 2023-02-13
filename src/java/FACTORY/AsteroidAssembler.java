/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FACTORY;

import java.util.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import COMPONENTS.*;
import DBSPT.*;
import ENUMS.*;
import MATERIALS.*;
/**
 *
 * @author lincoln
 */
public class AsteroidAssembler {
    
    public static Orbit buildOrbit(String D) throws SQLException, ClassNotFoundException{
        //Create DB Object
        DBConnect DB = new DBConnect("asteroids","3306","root","root");
        //Establish connection
        Connection C = DB.getConnection();
        //Use database
        DB.executeUseQuery(C);
        //Write a query
        String Query = "SELECT * FROM orbit WHERE Designation = '" + D + "';";
        //Process the inFormation from the query
        ResultSet R = DB.executeSelectQuery(Query, C); 
        String de = new String();
        double ap = 0.00;
        double pe = 0.00;
        double ec = 0.00;
        double peo = 0.00;
        double ro = 0.00;
        while(R.next()) {
            de = R.getString("Designation");
            ap = R.getDouble("Aphelion");
            pe = R.getDouble("Perihelion");
            ec = R.getDouble("Eccentricity");
            peo = R.getDouble("Period_Orbit");
            ro = R.getDouble("Radius_Orbit");
        }
        Orbit orb = new Orbit(de, ap, pe, ec, peo, ro);
        return orb;
    }
    
    public static Registry buildRegistry(String D) throws SQLException, ClassNotFoundException{
        DBConnect DB = new DBConnect("asteroids","3306","root","root");
        Connection C = DB.getConnection();
        DB.executeUseQuery(C);
        String Query = "SELECT * FROM registry WHERE Designation = '" + D + "';";
        ResultSet R = DB.executeSelectQuery(Query, C); 
        String de = new String();
        String at = new String();
        String co = new String();
        String dd = new String();
        while(R.next()) {
           de = R.getString("Designation");
           at = R.getString("AType");
           co = R.getString("Country");
           dd = R.getString("DDate");
        }
        Registry reg = new Registry(de,AType.valueOf(at),Country.valueOf(co),dd);
        return reg;
    }
    
    public static SpatialCoord buildSpatialCoord(String D) throws SQLException, ClassNotFoundException{
        DBConnect DB = new DBConnect("asteroids","3306","root","root");
        Connection C = DB.getConnection();
        DB.executeUseQuery(C);
        String Query = "SELECT * FROM spatialCoord WHERE Designation = '" + D + "';";
        ResultSet R = DB.executeSelectQuery(Query, C); 
        String de = new String();
        double x = 0.00;
        double y = 0.00;
        double z = 0.00;
        while (R.next()) {
            de = R.getString("Designation");
            x = R.getDouble("X");
            y = R.getDouble("Y");
            z = R.getDouble("Z");
        }
        SpatialCoord spat = new SpatialCoord(de, x, y, z);
        return spat;
    }
    
    public static Specification buildSpecification(String D) throws SQLException, ClassNotFoundException{
        DBConnect DB = new DBConnect("asteroids","3306","root","root");
        Connection C = DB.getConnection();
        DB.executeUseQuery(C);
        String Query = "SELECT * FROM specifications WHERE Designation = '" + D + "';";
        ResultSet R = DB.executeSelectQuery(Query, C); 
        String de = new String();
        double di = 0.00;
        double ma = 0.00;
        double den = 0.00;
        double in = 0.00;
        double ro = 0.00;
        while (R.next()) {
            de = R.getString("Designation");
            di = R.getDouble("Diameter");
            ma = R.getDouble("Mass");
            den = R.getDouble("Density");
            in = R.getDouble("Inclination");
            ro = R.getDouble("Rotation");
        }
        Specification spec = new Specification(de, di, ma, den, in, ro);
        return spec;
    }
    
    public static SimpleComposition buildSimpleComposition(String D) throws SQLException, ClassNotFoundException{
        DBConnect DB = new DBConnect("asteroids","3306","root","root");
        Connection C = DB.getConnection();
        DB.executeUseQuery(C);
        String Query = "SELECT * FROM composition_simple WHERE Designation = '" + D + "';";
        ResultSet R = DB.executeSelectQuery(Query, C); 
        String de = new String();
        double ro = 0.00;
        double me = 0.00;
        while (R.next()) {
            de = R.getString("Designation");
            ro = R.getDouble("Content_Rock");
            me = R.getDouble("Content_Metal");
        }
        SimpleComposition simp = new SimpleComposition(de, ro, me);
        return simp;
    }
    
    public static CommonComposition buildCommonComposition(String D) throws SQLException, ClassNotFoundException{
        DBConnect DB = new DBConnect("asteroids","3306","root","root");
        Connection C = DB.getConnection();
        DB.executeUseQuery(C);
        String Query = "SELECT * FROM composition_common WHERE Designation = '" + D + "';";
        ResultSet R = DB.executeSelectQuery(Query, C);
        String de = new String();
        double ni = 0.00;
        double mo = 0.00;
        double ir = 0.00;
        double zi = 0.00;
        while (R.next()) {
            de = R.getString("Designation");
            ni = R.getDouble("Nickel");
            ir = R.getDouble("Iron");
            zi = R.getDouble("Zinc");
        }
        CommonComposition com = new CommonComposition(de, ni, mo, ir, zi);
        return com;
    }
    
    public static PreciousComposition buildPreciousComposition(String D) throws SQLException, ClassNotFoundException{
        DBConnect DB = new DBConnect("asteroids","3306","root","root");
        Connection C = DB.getConnection();
        DB.executeUseQuery(C);
        String Query = "SELECT * FROM composition_precious WHERE Designation = '" + D + "';";
        ResultSet R = DB.executeSelectQuery(Query, C);
        String de = new String();
        double go = 0.00;
        double si = 0.00;
        double pl = 0.00;
        double pa = 0.00;
        double rh = 0.00;
        double ru = 0.00;
        double ir = 0.00;
        double os = 0.00;
        while (R.next()) {
            de = R.getString("Designation");
            go = R.getDouble("Gold");
            si = R.getDouble("Silver");
            pl = R.getDouble("Platinum");
            pa = R.getDouble("Palladium");
            rh = R.getDouble("Rhodium");
            ru = R.getDouble("Ruthenium");
            ir = R.getDouble("Iridium");
            os = R.getDouble("Osmium");
        }
        PreciousComposition pre = new PreciousComposition(de, go, si, pl, pa, rh, ru, ir, os);
        return pre;
    }
    
    public static StrategicComposition buildStrategicComposition(String D) throws SQLException, ClassNotFoundException{
        DBConnect DB = new DBConnect("asteroids","3306","root","root");
        Connection C = DB.getConnection();
        DB.executeUseQuery(C);
        String Query = "SELECT * FROM composition_strategic WHERE Designation = '" + D + "';";
        ResultSet R = DB.executeSelectQuery(Query, C);
        String de = new String();
        double ch = 0.00;
        double co = 0.00;
        double tu = 0.00;
        double ur = 0.00;
        while (R.next()) {
            de = R.getString("Designation");
            ch = R.getDouble("Chromium");
            co = R.getDouble("Cobalt");
            tu = R.getDouble("Tungsten");
            ur = R.getDouble("Uranium");
        }
        StrategicComposition str = new StrategicComposition(de, ch, co, tu, ur);
        return str;
    }
}