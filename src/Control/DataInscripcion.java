package Control;

import Modelo.Alumno;
import Modelo.Materia;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataInscripcion {

    public DataInscripcion() {
    }

    public int insertInscripcion(Alumno alumno, Materia materia) throws IOException {
        int result = 0;
        try {
            String consulta = "INSERT INTO `incripcion`(`idAlumno`, `idMateria`) VALUES (? , ?);";
            PreparedStatement stmt = Conexion.getConexion().prepareStatement(consulta);
            stmt.setInt(1, alumno.getIdAlumno());
            stmt.setInt(2, materia.getIdMateria());
            result = stmt.executeUpdate();
            System.out.println("Resultado sentencia " + result);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (result == 1) {
            System.out.println("Se realizo la inscripcion solictada");
        } else {
            System.out.println("No se realizo la inscripcion solicitada");
        }
        return result;
    }

    public int deleteInscripcion(Alumno alumno, Materia materia) throws IOException {
        int result = 0;
        try {
            String consulta = "DELETE FROM incripcion WHERE `incripcion`.`idAlumno` = ? AND `idMateria`= ? AND `nota` IS NULL";
            PreparedStatement stmt = Conexion.getConexion().prepareStatement(consulta);
            stmt.setInt(1, alumno.getIdAlumno());
            stmt.setInt(2, materia.getIdMateria());
            result = stmt.executeUpdate();
            System.out.println("Resultado sentencia " + result);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (result == 1) {
            System.out.println("Se borro la inscripcion solictada");
        } else {
            System.out.println("No borro la inscripcion solicitada");
        }
        return result;
    }

    public int updateNota(Alumno alumno, Materia materia, double nota) throws IOException {
        int result = 0;
        try {
            String consulta = "UPDATE  `incripcion` SET `nota`= ? WHERE `incripcion`.`idAlumno` = ? AND `idMateria`= ? ;";
            PreparedStatement stmt = Conexion.getConexion().prepareStatement(consulta);
            stmt.setDouble(1, nota);
            stmt.setInt(2, alumno.getIdAlumno());
            stmt.setInt(3, materia.getIdMateria());
            result = stmt.executeUpdate();
            System.out.println("Resultado sentencia " + result);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (result == 1) {
            System.out.println("Se borro la inscripcion solicitada");
        } else {
            System.out.println("No borro la inscripcion solicitada");
        }
        return result;
    }

    public int updateNotaMasAlta(Alumno alumno, Materia materia, double nota) throws IOException {
        int result = 0;
        try {
            String consulta = "UPDATE  `incripcion` SET `nota`= ? WHERE `incripcion`.`idAlumno` = ? AND `idMateria`= ? AND `nota` < ? ;";
            PreparedStatement stmt = Conexion.getConexion().prepareStatement(consulta);
            stmt.setDouble(1, nota);
            stmt.setInt(2, alumno.getIdAlumno());
            stmt.setInt(3, materia.getIdMateria());
            stmt.setDouble(4, nota);
            result = stmt.executeUpdate();
            System.out.println("Resultado sentencia " + result);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (result == 1) {
            System.out.println("Se borro la inscripcion solictada");
        } else {
            System.out.println("No borro la inscripcion solicitada");
        }
        return result;
    }
}
