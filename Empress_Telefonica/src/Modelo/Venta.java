/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PETER
 */
public class Venta {
    
    private String ID;
    private double BaseImponible, MOntoVenta;

    public Venta(String ID, double BaseImponible, double MOntoVenta) {
        this.ID = ID;
       
        this.BaseImponible = BaseImponible;
        this.MOntoVenta = MOntoVenta;
       
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }


    public double getBaseImponible() {
        return BaseImponible;
    }

    public void setBaseImponible(double BaseImponible) {
        this.BaseImponible = BaseImponible;
    }

    public double getMOntoVenta() {
        return MOntoVenta;
    }

    public void setMOntoVenta(double MOntoVenta) {
        this.MOntoVenta = MOntoVenta;
    }

    
    
    
    
}
