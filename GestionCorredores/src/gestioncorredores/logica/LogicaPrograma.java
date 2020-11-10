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
public class LogicaPrograma {
    
    public List<Corredor> listaCorredores = new ArrayList<Corredor>();
    Scanner santi = new Scanner (System.in);
    
    public void anadirCorredor (Corredor corredor) {
        
        listaCorredores.add(corredor);
    }

    public List<Corredor> getListaCorredores() {
        return listaCorredores;
    }
    
    public void modificarCorredor () {        
        
        String nombre,dni,direccion,telefono;
        Date fechaNacimiento;
        Corredor corredor = null;
        int posicion=0;
        
        System.out.println("Introduce DNI corredor a modificar");
        dni = santi.nextLine();
        
        for (int i = 0; i <= listaCorredores.size();i++){
           if(listaCorredores.get(i).getDni().equals(dni))
               posicion = i;      
        }
        
        //corredor.crearCorredor();
        
        listaCorredores.set(posicion, corredor);
        
        
    }
    
    public void imprimirLista () {
        
        
        for (int i = 0; i <= listaCorredores.size();i++){
            listaCorredores.get(i).imprimirCorredor();
        }
        
    }
    
}
