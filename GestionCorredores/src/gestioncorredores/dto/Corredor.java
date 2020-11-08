/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncorredores.dto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author mad_d
 */
public class Corredor {
    
    String nombre,dni,direccion,telefono;
    Date fechaNacimiento;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    Scanner santi = new Scanner (System.in);

    public Corredor(String nombre, String dni, String direccion, String telefono, Date fechaNacimiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        
    }
    
    public Corredor() {
        
        this(null,null,null,null,null);
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public void crearCorredor(){
        
        try {
            System.out.println("Introduce NOMBRE corredor: ");
            nombre = santi.nextLine();
            System.out.println("Introduce DNI corredor ");
            dni = santi.nextLine();
            System.out.println("Introduce DIRECCION corredor");
            direccion=santi.nextLine();
            System.out.println("Introduce TELEFONO corredor");
            telefono=santi.nextLine();
            System.out.println("Introduce FEHCA NACIMIENTO corredor");
            fechaNacimiento=sdf.parse(santi.nextLine());
        }
        
        catch (ParseException e) {
            
            System.out.println("Error con la fecha");
            
        }       
    }
    
    
    
    
}
