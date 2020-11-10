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
    
    
    
    public void imprimirCorredor() {
        
        System.out.println("--== DATOS CORREDOR ==--");
        System.out.println("NOMBRE: " +nombre);
        System.out.println("DNI: " +dni);
        System.out.println("DIRECCION: " +direccion);
        System.out.println("TELEFONO: " +telefono);
        System.out.println("FECHA NACIMIENTO: " +fechaNacimiento);
        
    }   
    
}
