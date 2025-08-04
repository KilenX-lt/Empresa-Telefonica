/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PETER
 */
public class Persona {
    private String Cedula, Email, ID;
    private double IngresosMensuales;

    public Persona(String Cedula, String Email, String ID, double IngresosMensuales) {
        this.Cedula = Cedula;
        this.Email = Email;
        this.ID = ID;
        this.IngresosMensuales = IngresosMensuales;
    }

    @Override
    public String toString() {
        return "Persona{" + "Cedula=" + Cedula + ", Email=" + Email + ", ID=" + ID + ", IngresosMensuales=" + IngresosMensuales + '}';
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getIngresosMensuales() {
        return IngresosMensuales;
    }

    public void setIngresosMensuales(double IngresosMensuales) {
        this.IngresosMensuales = IngresosMensuales;
    }
    
    public double MontoVenta (double Baseinponible){
        if (IngresosMensuales < 0 ){
            System.out.println("Los Ingresos tienen que ser mayores a 0");
        }
        return (2 * Baseinponible / IngresosMensuales);
    }
    
    public String ClasificacionPersona(){
        if(IngresosMensuales >= 400.00 & IngresosMensuales <= 800.00){
            return ("Cliente Basico");
        
        }else if(IngresosMensuales >= 800.01 & IngresosMensuales <= 1500.00){
            return ("Cliente Potencial");
        }else if(IngresosMensuales >= 1500.00 ){
            return ("Cliente Estrella");
        }
        return ("Cliente Descartable");
    } 
        
}
