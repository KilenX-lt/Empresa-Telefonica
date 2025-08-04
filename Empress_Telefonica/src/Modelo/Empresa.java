/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PETER
 */
public class Empresa {
    
    private String Ruc, ID;
    private double MontoCapitalizacion;
    private boolean PYMES;

    public Empresa(String Ruc, String ID, double MontoCapitalizacion, boolean PYMES) {
        this.Ruc = Ruc;
        this.ID = ID;
        this.MontoCapitalizacion = MontoCapitalizacion;
        this.PYMES = PYMES;
    }

    public String getRuc() {
        return Ruc;
    }

    public void setRuc(String Ruc) {
        this.Ruc = Ruc;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getMondoCapitalizacion() {
        return MontoCapitalizacion;
    }

    public void setMondoCapitalizacion(double MondoCapitalizacion) {
        this.MontoCapitalizacion = MondoCapitalizacion;
    }

    public boolean isPYMES() {
        return PYMES;
    }

    public void setPYMES(boolean PYMES) {
        this.PYMES = PYMES;
    }
    
    public double MontoVentaEmpresa(double BaseInponible){
        if( MontoCapitalizacion < 0 ){
            System.out.println("Los Ingresos tienen que ser mayores a 0");
        }
        return (20 * BaseInponible / MontoCapitalizacion);
    }
}
