/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.*;
import java.io.*;
import java.util.*;
/**
 *
 * @author PETER
 */
public class Filehandler {
    
    File f2 = new File("Venta.txt");
    File f3 = new File("Empresa.txt");
    File f4 = new File("Persona.txt");
    
   
     
      public void GuardarVenta(Venta v) throws IOException {
       
       BufferedWriter br = new BufferedWriter(new FileWriter(f2, true));
       br.append(v.getID()+" "+v.getBaseImponible()+" "+v.getMOntoVenta()+ "\n");
       br.close();
      
   }
   
   public LinkedList<String> LeerVenta() throws FileNotFoundException, IOException{
       
       LinkedList<String> cl = new LinkedList<>();
       String linea;
       BufferedReader br = new BufferedReader(new FileReader(f2));    
       
       while ((linea = br.readLine()) != null){
           cl.add(linea);
       }
       
       br.close();
       
       return cl;
    } 
    public void GuardarEmpresa(Empresa e) throws IOException {
       
    BufferedWriter br = new BufferedWriter(new FileWriter(f3, true));
    br.append(e.getRuc()+ " " + e.MontoVentaEmpresa(0)+" "+e.getMondoCapitalizacion()+" "+ e.isPYMES()+"\n");
    br.close();
      
   }
   
   public LinkedList<String> LeerEmpresa() throws FileNotFoundException, IOException{
       
       LinkedList<String> cl = new LinkedList<>();
       String linea;
       BufferedReader br = new BufferedReader(new FileReader(f3));    
       
       while ((linea = br.readLine()) != null){
           cl.add(linea);
       }
       
       br.close();
       
       return cl;
    }
   public void GuardarPersona (Persona p) throws IOException {
       
       BufferedWriter br = new BufferedWriter(new FileWriter(f4, true));
       br.append(p.getCedula() + " " + p.getEmail()+" "+ p.getID()+" "+p.getIngresosMensuales()+"\n");
       br.close();
      
   }
   
   public LinkedList<String> LeerPersona() throws FileNotFoundException, IOException{
       
       LinkedList<String> cl = new LinkedList<>();
       String linea;
       BufferedReader br = new BufferedReader(new FileReader(f4));    
       
       while ((linea = br.readLine()) != null){
           cl.add(linea);
       }
       
       br.close();
       
       return cl;
    }   
}
