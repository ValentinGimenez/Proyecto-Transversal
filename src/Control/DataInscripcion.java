package Control;

import Modelo.Alumno;
import Modelo.Incripcion;
import Modelo.Materia;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataInscripcion {
    DataAlumno dataAlumno = new DataAlumno();
    DataMateria dataMateria = new DataMateria();
    Connection connection;

    public DataInscripcion() {
        connection = Conexion.getConexion();
    }
    

    public int insertInscripcion(Alumno alumno, Materia materia) throws IOException {
        int result = 0;
        try {
            String consulta = "INSERT INTO `incripcion`(`idAlumno`, `idMateria`) VALUES (? , ?);";
            PreparedStatement stmt = connection.prepareStatement(consulta);
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
            PreparedStatement stmt = connection.prepareStatement(consulta);
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
            PreparedStatement stmt = connection.prepareStatement(consulta);
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
            PreparedStatement stmt = connection.prepareStatement(consulta);
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
    
    public List<Incripcion> obtenerInscripciones() {
        
        List<Incripcion> inscripciones = new ArrayList<>();
        try {
            String sql = "SELECT * FROM inscripcion";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Incripcion inscripcion = new Incripcion();
                inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
                inscripcion.setNota(rs.getInt("nota"));
                inscripcion.setAlumno(dataAlumno.buscarAlumno(rs.getInt("idAlumno")));
                inscripcion.setMateria(dataMateria.buscarMateria(rs.getInt("id")));
            }
            ps.close();
            
            
        } catch (SQLException ex) {
            // CARTEL DE ERROR
        }
        return inscripciones;
    }

    public List<Incripcion> obtenerInscripcionesPorAlumno(int dni) {
        
        List<Incripcion> inscripciones = new ArrayList<>();
        try {
            String sql = "SELECT * FROM inscripcion WHERE dni = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Incripcion inscripcion = new Incripcion();
                inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
                inscripcion.setNota(rs.getInt("nota"));
                inscripcion.setAlumno(dataAlumno.buscarAlumno(rs.getInt("idAlumno")));
                inscripcion.setMateria(dataMateria.buscarMateria(rs.getInt("id")));
                inscripciones.add(inscripcion);
            }
            ps.close();
            
            
        } catch (SQLException ex) {
            // CARTEL DE ERROR
        }
        return inscripciones;
    }
    
    public List<Alumno> obtenerAlumnosPorMateria(int idMateria) {
        List<Alumno> alumnos = new ArrayList<>();
        try {
            String sql = "SELECT DISTINCT idAlumno FROM inscripcion WHERE idMateria = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Alumno alumno = dataAlumno.buscarAlumno(rs.getInt("idAlumno"));
                alumnos.add(alumno);
            }
            ps.close();
            
        }catch (SQLException ex) {
            // CARTEL DE ERROR
        }
        return alumnos;
    }
   
    public List<Materia> obtenerMateriasCursadas(int id) {
        List<Materia> materias = new ArrayList<>();
        try {
            String sql = "SELECT idMateria FROM inscripcion WHERE idAlumno = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Materia materia = dataMateria.buscarMateria(rs.getInt("idMateria"));
                materias.add(materia);
            }
            ps.close();
            
        }catch (SQLException ex) {
            // CARTEL DE ERROR
        }
        return materias;
    }
    
    public List<Materia> obtenerMateriasNoCursadas(int id) {
        List<Materia> materias = new ArrayList<>();
        try {
            String sql;
            sql = 
                 "SELECT M.idMateria, M.Nombre\n" +
                 "FROM Materia M\n" +
                 "LEFT JOIN Inscripcion I ON M.idMateria = I.idMateria AND I.idAlumno = ?\n" +
                 "WHERE I.idAlumno IS NULL;";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            System.out.println();
            while(rs.next()) {
                Materia materia = dataMateria.buscarMateria(rs.getInt("idMateria"));
                System.out.println("materia" + materia);
                materias.add(materia);
            }
            ps.close();
            
        }catch (SQLException ex) {
            // CARTEL DE ERROR
        }
        return materias;
    }
    
}
