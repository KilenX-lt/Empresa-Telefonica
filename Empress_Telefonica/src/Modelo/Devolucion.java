/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PETER
 */
public class Devolucion {
    
    private int FechaDevolucion;
    private Agente agente;
    private Cliente cliente;

    public Devolucion(int FechaDevolucion, Agente agente, Cliente cliente) {
        this.FechaDevolucion = FechaDevolucion;
        this.agente = agente;
        this.cliente = cliente;
    }

    public int getFechaDevolucion() {
        return FechaDevolucion;
    }

    public void setFechaDevolucion(int FechaDevolucion) {
        this.FechaDevolucion = FechaDevolucion;
    }

    public Agente getAgente() {
        return agente;
    }

    public void setAgente(Agente agente) {
        this.agente = agente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
         
}
