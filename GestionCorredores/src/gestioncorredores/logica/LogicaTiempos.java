/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncorredores.logica;

import gestioncorredores.dto.Tiempo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mad_d
 */
public class LogicaTiempos {
    
    private static List<Tiempo> listaTiempos = new ArrayList<Tiempo>();
     
     public static void anadirTiempos (Tiempo tiempo) {
        
        listaTiempos.add(tiempo);
    }

    public static List<Tiempo> getListaTiempos() {
        return listaTiempos;
    }
    
}
