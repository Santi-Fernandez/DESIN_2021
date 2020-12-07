/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.validation.api.builtin.stringvalidation;

import org.netbeans.validation.api.Problems;
import org.openide.util.NbBundle;

/**
 *
 * @author mad_d
 */

//Se valida si el DNI es de la forma 00000000A
public class DniValidar extends StringValidator{

    @Override
    public void validate(Problems problema, String nombreComponente, String textoValidar) {
        
        String mensaje = NbBundle.getMessage(this.getClass(), "MSG_DNIVALIDO", nombreComponente);
        
        if( !"".equals(textoValidar) && textoValidar.length()!=9){
            problema.add(mensaje);
        }
        
        
        
        
        if( !"".equals(textoValidar) && !Character.isUpperCase(textoValidar.charAt(textoValidar.length()-1))){
            problema.add(mensaje);
        }
        }
        
        
        
    }
    

