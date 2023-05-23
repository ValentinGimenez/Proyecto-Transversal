/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.transversal;

import Control.Conexion;
import Control.DataAlumno;
import Control.DataInscripcion;
import Control.DataMateria;
import Modelo.Alumno;
import Modelo.Materia;
import java.io.IOException;
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
        DataMateria dataMateria = new DataMateria();
        DataAlumno dataAlumno1 = new DataAlumno();
        DataInscripcion dataInscripcion = new DataInscripcion();
        //Agregar alumno
        //Alumno alumno1 = new Alumno (55555555, "Perez", "Juan", LocalDate.of(1999, 5, 15), false);
        
        //dataAlumno1.guardarAlumno(alumno1);
        
        dataAlumno1.activarAlumno(1);
        System.out.println(dataAlumno1.buscarAlumno(1));
        System.out.println(dataAlumno1.buscarAlumnoPorDni(22222222));
        
        Materia materia = new Materia("Matematica", 2, true);
        Alumno alumno2 = new Alumno(123, "Rodriguez", "Carlos", LocalDate.of(2001, 8, 21), true);
        
        dataMateria.guardarMateria(materia);
        
        try {
            dataInscripcion.insertInscripcion(alumno2, materia);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
        
        
    }
    
}
