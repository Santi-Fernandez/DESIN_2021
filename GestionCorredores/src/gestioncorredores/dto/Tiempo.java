/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncorredores.dto;

/**
 *
 * @author mad_d
 */
public class Tiempo {
    
    String dni;
    String dorsal;
    String tiempo;

    public Tiempo(String Dni, String dorsal, String tiempo) {
        this.dni = Dni;
        this.dorsal = dorsal;
        this.tiempo = tiempo;
    }

    public Tiempo() {
        this("","","");
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String Dni) {
        this.dni = Dni;
    }

    public String getDorsal() {
        return dorsal;
    }

    public void setDorsal(String dorsal) {
        this.dorsal = dorsal;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }
    
    public String [] arrayCorredores () {
        
        String [] corredor = new String[2];
        corredor[0]=dni;
        corredor[1]=dorsal;
        
        return corredor;
        
    }
    
    
    
}
