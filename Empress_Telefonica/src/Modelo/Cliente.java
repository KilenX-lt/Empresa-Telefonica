/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PETER
 */
public class Cliente {
    
    private String ID,direccion, Tlf_Contacto;

    public Cliente(String ID, String direccion, String Tlf_Contacto) {
        this.ID = ID;
        this.direccion = direccion;
        this.Tlf_Contacto = Tlf_Contacto;
    }
    
    

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTlf_Contacto() {
        return Tlf_Contacto;
    }

    public void setTlf_Contacto(String Tlf_Contacto) {
        this.Tlf_Contacto = Tlf_Contacto;
    }

    
    
}
