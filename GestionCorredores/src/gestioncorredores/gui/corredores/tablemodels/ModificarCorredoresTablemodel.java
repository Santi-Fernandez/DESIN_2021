/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncorredores.gui.corredores.tablemodels;

import gestioncorredores.dto.Corredor;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author mad_d
 */
public class ModificarCorredoresTablemodel extends AbstractTableModel{
    
    private List<Corredor> listaCorredores;
    private SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
    private String[] columnas = {"Nombre","DNI","Direccion","Telefono","Fecha Nacimiento"};
    
    public ModificarCorredoresTablemodel(List<Corredor> listaCorredores){
        this.listaCorredores=listaCorredores;
    }    
    

    @Override
    public int getRowCount() {
       
        return listaCorredores.size();
    }

    @Override
    public int getColumnCount() {
        
        return columnas.length;
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch(columnIndex){
            
            case 0: 
                return listaCorredores.get(rowIndex).getNombre();
            case 1:
                return listaCorredores.get(rowIndex).getDni();
            case 2:
                return listaCorredores.get(rowIndex).getDireccion();
            case 3:
                return listaCorredores.get(rowIndex).getTelefono();
            case 4:
                return formatoFecha.format(listaCorredores.get(rowIndex).getFechaNacimiento());
        } 
        return null;        
        
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }
    
    
    
}
