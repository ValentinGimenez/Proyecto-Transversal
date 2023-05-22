/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.transversal;

import Control.Conexion;
import Control.DataAlumno;
import Modelo.Alumno;
import java.time.LocalDate;

/**
 *
 * @author Valentin
 */
public class ProyectoTransversal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Prueba de conexión
        Conexion.getConexion();
        //Agregar alumno
        Alumno alumno1 = new Alumno (55555555, "Perez", "Juan", LocalDate.of(1999, 5, 15), true);
        DataAlumno dataAlumno1 = new DataAlumno();
        dataAlumno1.guardarAlumno(alumno1);
    }
    
}
