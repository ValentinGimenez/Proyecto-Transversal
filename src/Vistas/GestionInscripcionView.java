/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Control.DataAlumno;
import Control.DataInscripcion;
import Control.DataMateria;
import Modelo.Alumno;
import Modelo.Incripcion;
import Modelo.Materia;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Valentin
 */
public class GestionInscripcionView extends javax.swing.JInternalFrame {
    
    private ArrayList<Incripcion> listaInscrip;
    private ArrayList<Materia> listaMateria;
    private ArrayList<Alumno> listaAlumno;
    private DataInscripcion inscData;
    private DataMateria matData;
    private DataAlumno alumData;
    private DefaultTableModel modelo;
    
    
    public GestionInscripcionView() {
        initComponents();
        alumData = new DataAlumno();
        listaAlumno = (ArrayList<Alumno>)alumData.listarAlumnos();
        modelo= new DefaultTableModel();
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
        jCBoxAlumno = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jRinscriptas = new javax.swing.JRadioButton();
        jRnoInscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTmateria = new javax.swing.JTable();
        jBInscribir = new javax.swing.JButton();
        jBAnular = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();

        jLabel1.setText("Formulario de Inscripcion");

        jLabel2.setText("Seleccione un alumno:");

        jCBoxAlumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Listado de Materias");

        jRinscriptas.setText("Materias inscriptas");

        jRnoInscriptas.setText("Materias no inscriptas");

        jTmateria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Año"
            }
        ));
        jScrollPane1.setViewportView(jTmateria);

        jBInscribir.setText("Incribir");

        jBAnular.setText("Anular");

        jBsalir.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jRinscriptas)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRnoInscriptas))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(92, 92, 92)
                                    .addComponent(jCBoxAlumno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jBInscribir)
                        .addGap(63, 63, 63)
                        .addComponent(jBAnular)
                        .addGap(70, 70, 70)
                        .addComponent(jBsalir)))
                .addContainerGap(50, Short.MAX_VALUE))
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
                    .addComponent(jCBoxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRinscriptas)
                    .addComponent(jRnoInscriptas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBInscribir)
                    .addComponent(jBAnular)
                    .addComponent(jBsalir))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAnular;
    private javax.swing.JButton jBInscribir;
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<Alumno> jCBoxAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRinscriptas;
    private javax.swing.JRadioButton jRnoInscriptas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTmateria;
    // End of variables declaration//GEN-END:variables
}
