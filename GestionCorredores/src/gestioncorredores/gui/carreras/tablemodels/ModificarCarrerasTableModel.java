/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncorredores.gui.carreras.tablemodels;

import gestioncorredores.dto.Carrera;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author mad_d
 */
public class ModificarCarrerasTableModel extends AbstractTableModel {

    private List<Carrera> listaCarreras;
    private SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
    private String[] columnas = {"Nombre", "Lugar", "Fecha", "Numero Participantes", "Acabada"};

    public ModificarCarrerasTableModel(List<Carrera> listaCarreras) {
        this.listaCarreras = listaCarreras;
    }

    @Override
    public int getRowCount() {
        return listaCarreras.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        switch (columnIndex) {

            case 0:
                return listaCarreras.get(rowIndex).getNombre();
            case 1:
                return listaCarreras.get(rowIndex).getLugar();
            case 2:
                return formatoFecha.format(listaCarreras.get(rowIndex).getFechaCarrera());
            case 3:
                return listaCarreras.get(rowIndex).getNumeroParticipantes();
            case 4:
                return listaCarreras.get(rowIndex).isCarreraAcabada();

        }

        return null;

    }

    @Override
    public String getColumnName(int column) {

        return columnas[column];
    }

}
