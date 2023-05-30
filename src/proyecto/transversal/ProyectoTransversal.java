package proyecto.transversal;

import Control.Conexion;
import Control.DataAlumno;
import Control.DataInscripcion;
import Control.DataMateria;
import Modelo.Alumno;
import Modelo.Materia;
import Modelo.Incripcion;
import java.io.IOException;
import java.time.LocalDate;

/**
 *
 * @author Valentin
 */
public class ProyectoTransversal {

    public static void main(String[] args) {

        /*
        Conexion.getConexion();
        DataAlumno alumno = new DataAlumno();
        DataMateria materia = new DataMateria();
        DataInscripcion inscripcion = new DataInscripcion();
        alumno.guardarAlumno(new Alumno(43764888, "Gimenez", "Valentin", LocalDate.of(2001, 9, 19), false));
        System.out.println(alumno.buscarAlumno(4));
        System.out.println(alumno.buscarAlumnoPorDni(43764888));
        System.out.println(alumno.listarAlumnos());
        alumno.modificarAlumno(new Alumno(4, 43690464, "Vallejos", "Roberta", LocalDate.of(2001, 9, 14), false));
        alumno.eliminarAlumno(4);
        alumno.activarAlumno(4);
         */
 /*
        materia.guardarMateria(new Materia("Algebra", 1, true));
        System.out.println(materia.buscarMateria(1));
        materia.modificarMateria(new Materia(12, "Calculo", 1, true));
        materia.eliminarMateria(12);
        System.out.println(materia.listarMaterias());
         */
 /*
        inscripcion.guardarInscripcion(new Incripcion(new Alumno(2, 22222222, "Gil", "German", LocalDate.of(1985, 11, 11), true), new Materia(5, "Ingles", 2, true), 8.6));
        //System.out.println(inscripcion.obtenerInscripciones());
        System.out.println(inscripcion.obtenerInscripcionesPorAlumno(2));
        System.out.println(inscripcion.obtenerMateriasCursadas(2));
        System.out.println(inscripcion.obtenerMateriasNOCursadas(2));
        inscripcion.actualizarNota(2, 5, 5.5);
        System.out.println(inscripcion.obtenerAlumnosXMateria(5));
        inscripcion.borrarInscripcionMateriaAlumno(2, 5);
         */
    }

}
