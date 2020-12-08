/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncorredores.gui;

import gestioncorredores.dto.Corredor;
import gestioncorredores.gui.corredores.CrearCorredor;
import gestioncorredores.gui.corredores.ListaCorredores;
import gestioncorredores.gui.corredores.ModificarBorrarCorredores;
import static gestioncorredores.logica.LogicaCorredor.anadirCorredor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import java.util.Locale;

/**
 *
 * @author mad_d
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");

    /**
     * Creates new form PantallaPrinciipal
     */
    public PantallaPrincipal() {
        initComponents();
        crearCorredores();
    }
    
    // Datos para con los que parte el programa

    public void crearCorredores() {
        
        
        Date date1 = new GregorianCalendar(1987, Calendar.FEBRUARY, 11).getTime();
        Corredor corredor1 = new Corredor("Raul Losa", "71856335N", "C/ Uria 1", "685478954", date1 );
        anadirCorredor(corredor1);
        Date date2 = new GregorianCalendar(1990, Calendar.JULY, 24).getTime();
        Corredor corredor2 = new Corredor("Maria Gallego", "71956345Z", "C/ Santa Susana 43", "603465279", date2 );
        anadirCorredor(corredor2);
        Date date3 = new GregorianCalendar(1995, Calendar.JANUARY, 2).getTime();
        Corredor corredor3 = new Corredor("Javier Fernandez", "71648922Q", "C/ Tenderina 114", "664892466", date3 );
        anadirCorredor(corredor3);
        Date date4 = new GregorianCalendar(2000, Calendar.DECEMBER, 9).getTime();
        Corredor corredor4 = new Corredor("Laura Abadia", "71569924X", "C/ Independencia 7", "696881425", date4 );
        anadirCorredor(corredor4);
        Date date5 = new GregorianCalendar(1976, Calendar.NOVEMBER, 14).getTime();
        Corredor corredor5 = new Corredor("Maite Alonso", "71884123D", "C/ Rosal 12 ", "687441126", date5 );
        anadirCorredor(corredor5);
        
        

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemCrearCorredor = new javax.swing.JMenuItem();
        jMenuItemListaCorredores = new javax.swing.JMenuItem();
        jMenuItemModificarCorredor = new javax.swing.JMenuItem();

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Corredor");

        jMenuItemCrearCorredor.setText("Crear Corredor ...");
        jMenuItemCrearCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCrearCorredorActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemCrearCorredor);

        jMenuItemListaCorredores.setText("Lista Corredores ...");
        jMenuItemListaCorredores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListaCorredoresActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemListaCorredores);

        jMenuItemModificarCorredor.setText("Modificar Corredor ...");
        jMenuItemModificarCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemModificarCorredorActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemModificarCorredor);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 758, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCrearCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCrearCorredorActionPerformed
        CrearCorredor crearCorredor = new CrearCorredor(this, true);
        crearCorredor.setVisible(true);


    }//GEN-LAST:event_jMenuItemCrearCorredorActionPerformed

    private void jMenuItemListaCorredoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListaCorredoresActionPerformed
        ListaCorredores listaCorredores = new ListaCorredores(this, true);
        listaCorredores.setVisible(true);
        listaCorredores.refrescarTabla();

    }//GEN-LAST:event_jMenuItemListaCorredoresActionPerformed

    private void jMenuItemModificarCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemModificarCorredorActionPerformed
        ModificarBorrarCorredores modificarBorrarCorredores = new ModificarBorrarCorredores(this, true);
        modificarBorrarCorredores.setVisible(true);
    }//GEN-LAST:event_jMenuItemModificarCorredorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Locale.setDefault(new Locale("es", "ES"));
                new PantallaPrincipal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemCrearCorredor;
    private javax.swing.JMenuItem jMenuItemListaCorredores;
    private javax.swing.JMenuItem jMenuItemModificarCorredor;
    // End of variables declaration//GEN-END:variables
}
