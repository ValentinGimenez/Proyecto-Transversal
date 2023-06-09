/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.Color;

/**
 *
 * @author Valentin
 */
public class MenuView extends javax.swing.JFrame {

    /**
     * Creates new form MenuView
     */
    public MenuView() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(this.MAXIMIZED_BOTH);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMalumno = new javax.swing.JMenu();
        jmGuardarAlumno = new javax.swing.JMenuItem();
        jmModificarAlumno = new javax.swing.JMenuItem();
        jmBorrarAlumno = new javax.swing.JMenuItem();
        jMmateria = new javax.swing.JMenu();
        jMformularioMateria = new javax.swing.JMenuItem();
        jMadministracion = new javax.swing.JMenu();
        jMmanejoInscripciones = new javax.swing.JMenuItem();
        jMmanipulacionNotas = new javax.swing.JMenuItem();
        jMconsultas = new javax.swing.JMenu();
        jMalumnosPorMateria = new javax.swing.JMenuItem();
        jMsalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(240, 240, 240));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1122, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 643, Short.MAX_VALUE)
        );

        jMalumno.setText("Alumno");

        jmGuardarAlumno.setText("Guardar Alumno");
        jmGuardarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmGuardarAlumnoActionPerformed(evt);
            }
        });
        jMalumno.add(jmGuardarAlumno);

        jmModificarAlumno.setText("Modificar Alumno");
        jmModificarAlumno.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jmModificarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmModificarAlumnoActionPerformed(evt);
            }
        });
        jMalumno.add(jmModificarAlumno);

        jmBorrarAlumno.setText("Borrar Alumno");
        jmBorrarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmBorrarAlumnoActionPerformed(evt);
            }
        });
        jMalumno.add(jmBorrarAlumno);

        jMenuBar1.add(jMalumno);

        jMmateria.setText("Materia");

        jMformularioMateria.setText("Formulario de Materia");
        jMformularioMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMformularioMateriaActionPerformed(evt);
            }
        });
        jMmateria.add(jMformularioMateria);

        jMenuBar1.add(jMmateria);

        jMadministracion.setText("Administración");

        jMmanejoInscripciones.setText("Manejo de inscripciones");
        jMmanejoInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMmanejoInscripcionesActionPerformed(evt);
            }
        });
        jMadministracion.add(jMmanejoInscripciones);

        jMmanipulacionNotas.setText("Manipulación de notas");
        jMmanipulacionNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMmanipulacionNotasActionPerformed(evt);
            }
        });
        jMadministracion.add(jMmanipulacionNotas);

        jMenuBar1.add(jMadministracion);

        jMconsultas.setText("Consultas");

        jMalumnosPorMateria.setText("Alumnos por materia");
        jMalumnosPorMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMalumnosPorMateriaActionPerformed(evt);
            }
        });
        jMconsultas.add(jMalumnosPorMateria);

        jMenuBar1.add(jMconsultas);

        jMsalir.setText("Salir");
        jMsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMsalirMouseClicked(evt);
            }
        });
        jMsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMsalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMsalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMmanipulacionNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmanipulacionNotasActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        ActualizarNotasView anv = new ActualizarNotasView();
        anv.setVisible(true);
        escritorio.add(anv);
    }//GEN-LAST:event_jMmanipulacionNotasActionPerformed

    private void jMmanejoInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmanejoInscripcionesActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        GestionInscripcionView gestioninscripcion = new GestionInscripcionView();
        gestioninscripcion.setVisible(true);
        escritorio.add(gestioninscripcion);

    }//GEN-LAST:event_jMmanejoInscripcionesActionPerformed

    private void jmGuardarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmGuardarAlumnoActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        AgregarAlumnoView guardaralumno = new AgregarAlumnoView();
        guardaralumno.setVisible(true);
        escritorio.add(guardaralumno);
    }//GEN-LAST:event_jmGuardarAlumnoActionPerformed

    private void jmModificarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmModificarAlumnoActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        ModificarAlumnoView modificaralumno = new ModificarAlumnoView();
        modificaralumno.setVisible(true);
        escritorio.add(modificaralumno);
    }//GEN-LAST:event_jmModificarAlumnoActionPerformed

    private void jmBorrarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmBorrarAlumnoActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        BorrarAlumnoView borraralumno = new BorrarAlumnoView();
        borraralumno.setVisible(true);
        escritorio.add(borraralumno);
    }//GEN-LAST:event_jmBorrarAlumnoActionPerformed

    private void jMformularioMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMformularioMateriaActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        GestionMateriaView gestMatView = new GestionMateriaView();
        gestMatView.setVisible(true);
        escritorio.add(gestMatView);
    }//GEN-LAST:event_jMformularioMateriaActionPerformed

    private void jMsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMsalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMsalirActionPerformed

    private void jMsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMsalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMsalirMouseClicked

    private void jMalumnosPorMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMalumnosPorMateriaActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        AlumnosPorMateria alumPorMat = new AlumnosPorMateria();
        alumPorMat.setVisible(true);
        escritorio.add(alumPorMat);
    }//GEN-LAST:event_jMalumnosPorMateriaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMadministracion;
    private javax.swing.JMenu jMalumno;
    private javax.swing.JMenuItem jMalumnosPorMateria;
    private javax.swing.JMenu jMconsultas;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMformularioMateria;
    private javax.swing.JMenuItem jMmanejoInscripciones;
    private javax.swing.JMenuItem jMmanipulacionNotas;
    private javax.swing.JMenu jMmateria;
    private javax.swing.JMenu jMsalir;
    private javax.swing.JMenuItem jmBorrarAlumno;
    private javax.swing.JMenuItem jmGuardarAlumno;
    private javax.swing.JMenuItem jmModificarAlumno;
    // End of variables declaration//GEN-END:variables
}
