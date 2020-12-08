/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncorredores.logica;

import gestioncorredores.dto.Corredor;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mad_d
 */
public class LogicaCorredor {
    
    private static List<Corredor> listaCorredores = new ArrayList<Corredor>();
    
    public LogicaCorredor() {
        
        
        /*Corredor corredor1 = new Corredor ("San","71656535N", "Uria","6854", new Date(1984,11,22));
        anadirCorredor(corredor1);*/
        
        
    }
   
    
    public static void anadirCorredor (Corredor corredor) {
        
        listaCorredores.add(corredor);
    }

    public static List<Corredor> getListaCorredores() {
        return listaCorredores;
    }
    
    
    
}
