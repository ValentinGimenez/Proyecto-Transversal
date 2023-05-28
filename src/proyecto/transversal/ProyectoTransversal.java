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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Prueba de conexión
//        Conexion.getConexion();
//        DataMateria dataMateria = new DataMateria();
//        DataAlumno dataAlumno1 = new DataAlumno();
//        DataInscripcion dataInscripcion = new DataInscripcion();
//        //Agregar alumno
//        //Alumno alumno1 = new Alumno (55555555, "Perez", "Juan", LocalDate.of(1999, 5, 15), false);
//
//        //dataAlumno1.guardarAlumno(alumno1);
//        dataAlumno1.activarAlumno(1);
//        System.out.println(dataAlumno1.buscarAlumno(1));
//        System.out.println(dataAlumno1.buscarAlumnoPorDni(22222222));
//
//        Materia materia = new Materia("Matematica", 2, true);
//        Alumno alumno2 = new Alumno(123, "Rodriguez", "Carlos", LocalDate.of(2001, 8, 21), true);
//
//        dataMateria.guardarMateria(materia);

        Conexion.getConexion();
        DataAlumno alumno = new DataAlumno();
        DataMateria materia = new DataMateria();
        DataInscripcion inscripcion = new DataInscripcion();
//        alumno.guardarAlumno(new Alumno(43764888, "Gimenez", "Valentin", LocalDate.of(2001, 9, 19), false));
//        System.out.println(alumno.buscarAlumno(4));
//        System.out.println(alumno.buscarAlumnoPorDni(43764888));
//        System.out.println(alumno.listarAlumnos());
//
//        alumno.modificarAlumno(new Alumno(4, 43690464, "Vallejos", "Roberta", LocalDate.of(2001, 9, 14), false));
//        alumno.eliminarAlumno(4);
//        alumno.activarAlumno(4);
//
//        materia.guardarMateria(new Materia("Algebra", 1, true));
//        System.out.println(materia.buscarMateria(1));
//        materia.modificarMateria(new Materia(12, "Calculo", 1, true));
//        materia.eliminarMateria(12);
//        System.out.println(materia.listarMaterias());

        //inscripcion.guardarInscripcion(new Incripcion(new Alumno(2, 22222222, "Gil", "German", LocalDate.of(1985, 11, 11), true), new Materia(5, "Ingles", 2, true), 8.6));
        //System.out.println(inscripcion.obtenerInscripciones());
        System.out.println(inscripcion.obtenerInscripcionesPorAlumno(2));
        System.out.println(inscripcion.obtenerMateriasCursadas(2));
        System.out.println(inscripcion.obtenerMateriasNOCursadas(2));
        inscripcion.actualizarNota(2, 5, 5.5);

        System.out.println(inscripcion.obtenerAlumnosXMateria(5));
        inscripcion.borrarInscripcionMateriaAlumno(2, 5);
    }

}
