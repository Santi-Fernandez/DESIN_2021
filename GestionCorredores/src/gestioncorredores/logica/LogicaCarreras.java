/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncorredores.logica;

import gestioncorredores.dto.Carrera;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mad_d
 */
public class LogicaCarreras {
    
     private static List<Carrera> listaCarreras = new ArrayList<Carrera>();
     
     public static void anadirCarrera (Carrera carrera) {
        
        listaCarreras.add(carrera);
    }

    public static List<Carrera> getListaCarreras() {
        return listaCarreras;
    }
     
     
     
    
}
