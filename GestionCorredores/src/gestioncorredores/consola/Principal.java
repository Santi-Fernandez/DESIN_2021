/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncorredores.consola;

import gestioncorredores.logica.LogicaPrograma;
import gestioncorredores.dto.Corredor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;





/**
 *
 * @author mad_d
 */
public class Principal {
    
    Corredor corredor;
    LogicaPrograma logicaPrograma;
    String nombre,dni,direccion,telefono;
    Date fechaNacimiento;
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    Scanner santi = new Scanner (System.in);
    
    
    public Principal() {
        
        
      corredor=crearCorredor();
      
        
        
    }
    
    public Corredor crearCorredor(){
        
        Corredor corredor=null;
         
        try {
            System.out.println("Introduce NOMBRE corredor: ");
            nombre = santi.nextLine();
            System.out.println("Introduce DNI corredor ");
            dni = santi.nextLine();
            System.out.println("Introduce DIRECCION corredor");
            direccion=santi.nextLine();
            System.out.println("Introduce TELEFONO corredor");
            telefono=santi.nextLine();
            System.out.println("Introduce FECHA NACIMIENTO corredor");
            fechaNacimiento=sdf.parse(santi.nextLine());
        }
        
        catch (ParseException e) {
            
            System.out.println("Error con la fecha");
            
        } 
        
        return corredor;
    }
    
 public static void main(String[] args){
     new Principal();
 }
    
}
