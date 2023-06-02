/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Control.*;
import Modelo.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Valentin
 */
public class GestionInscripcionView extends javax.swing.JInternalFrame {
    
    private DataInscripcion inscData=new DataInscripcion();
    private DataAlumno alumData=new DataAlumno();
    
    private DefaultTableModel modelo=new DefaultTableModel();

    public GestionInscripcionView() {
        initComponents();
        cargarAlumnos();
        armarCabecera();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jcboxAlumnos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jrbInscriptas = new javax.swing.JRadioButton();
        jrbNoInscriptas = new javax.swing.JRadioButton();
        jbInscribir = new javax.swing.JButton();
        jbAnular = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtMateria = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Formulario de Inscripcion");

        jLabel2.setText("Seleccione un alumno:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Listado de Materias");

        jrbInscriptas.setText("Materias inscriptas");
        jrbInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbInscriptasActionPerformed(evt);
            }
        });

        jrbNoInscriptas.setText("Materias no inscriptas");
        jrbNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbNoInscriptasActionPerformed(evt);
            }
        });

        jbInscribir.setText("Incribir");
        jbInscribir.setEnabled(false);
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jbAnular.setText("Anular");
        jbAnular.setEnabled(false);
        jbAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnularActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");

        jtMateria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jtMateria);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jrbInscriptas)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jrbNoInscriptas))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(92, 92, 92)
                                    .addComponent(jcboxAlumnos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jbInscribir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbAnular)
                                .addGap(106, 106, 106)
                                .addComponent(jbSalir)
                                .addGap(28, 28, 28)))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcboxAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbInscriptas)
                    .addComponent(jrbNoInscriptas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbInscribir)
                    .addComponent(jbAnular)
                    .addComponent(jbSalir))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbNoInscriptasActionPerformed
        // TODO add your handling code here:
        jrbNoInscriptas.setSelected(true);
        jrbInscriptas.setSelected(false);
        jbAnular.setEnabled(false);
        jbInscribir.setEnabled(true);
        borrarFilas();
        llenarTabla();
        
    }//GEN-LAST:event_jrbNoInscriptasActionPerformed

    private void jrbInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbInscriptasActionPerformed
        // TODO add your handling code here:
        jrbInscriptas.setSelected(true);
        jrbNoInscriptas.setSelected(false);
        jbAnular.setEnabled(true);
        jbInscribir.setEnabled(false);
        borrarFilas();
        llenarTabla();
    }//GEN-LAST:event_jrbInscriptasActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        // TODO add your handling code here:
        Alumno alumSel = (Alumno)jcboxAlumnos.getSelectedItem();
        int filaSel=jtMateria.getSelectedRow();
        if (filaSel !=-1) {
            int idM=(Integer)modelo.getValueAt(filaSel, 0);
            Materia mat = new Materia();
            mat.setIdMateria(idM);
            Incripcion insc = new Incripcion(alumSel,mat,0);
            inscData.guardarInscripcion(insc);
        }else{
            JOptionPane.showMessageDialog(this, "Usted debe seleccionar una materia");
        }
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jbAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnularActionPerformed
        // TODO add your handling code here:
        Alumno alumSel = (Alumno)jcboxAlumnos.getSelectedItem();
        int filaSel=jtMateria.getSelectedRow();
        if (filaSel !=-1) {
            int idM=(Integer)modelo.getValueAt(filaSel, 0);
            inscData.borrarInscripcionMateriaAlumno(alumSel.getIdAlumno(), idM);
        }else{
            JOptionPane.showMessageDialog(this, "Usted debe seleccionar una materia");
        }
    }//GEN-LAST:event_jbAnularActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbAnular;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcboxAlumnos;
    private javax.swing.JRadioButton jrbInscriptas;
    private javax.swing.JRadioButton jrbNoInscriptas;
    private javax.swing.JTable jtMateria;
    // End of variables declaration//GEN-END:variables

    private void cargarAlumnos() {
        List<Alumno> alumnos=alumData.listarAlumnos();
        for (Alumno alumno : alumnos) {
            jcboxAlumnos.addItem(alumno);
        }
        
    }

    private void armarCabecera() {
        ArrayList titulos=new ArrayList();
        titulos.add("ID");
        titulos.add("Nombre");
        titulos.add("Año");
        for (Object titulo : titulos) {
            modelo.addColumn(titulo);
        }
        jtMateria.setModel(modelo);
    }
    
    private void llenarTabla(){
        Alumno alumSel =(Alumno)jcboxAlumnos.getSelectedItem();
        if (jrbNoInscriptas.isSelected()) {
            List<Materia> materias=inscData.obtenerMateriasNOCursadas(alumSel.getIdAlumno());
            for (Materia m: materias) {
                modelo.addRow(new Object[]{m.getIdMateria(),m.getNombre(),m.getAño()});
            }
        }else{
            List<Materia> materias=inscData.obtenerMateriasCursadas(alumSel.getIdAlumno());
            for (Materia m: materias) {
                modelo.addRow(new Object[]{m.getIdMateria(),m.getNombre(),m.getAño()});
            }
        }
    }
    
    private void borrarFilas(){
        int filas=modelo.getRowCount()-1;
        for (int i = filas; i > 0; i--) {
            modelo.removeRow(i);
        }
    }
}
