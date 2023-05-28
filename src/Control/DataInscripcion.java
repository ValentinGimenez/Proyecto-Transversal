package Control;

import Modelo.Alumno;
import Modelo.Incripcion;
import Modelo.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DataInscripcion {

    private Connection con = null;
    private DataMateria dataMateria = new DataMateria();
    private DataAlumno dataAlumno = new DataAlumno();

    public DataInscripcion() {

        this.con = Conexion.getConexion();

    }

    public void guardarInscripcion(Incripcion insc) {
        String sql = "INSERT INTO incripcion(idAlumno, idMateria, nota) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, insc.getIdAlumno());
            ps.setInt(2, insc.getIdMateria());
            ps.setDouble(3, insc.getNota());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                insc.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripcion agregada con exito.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la Tabla Inscripcion " + ex.getMessage());
        }
    }

    public List<Incripcion> obtenerInscripciones() {
        List<Incripcion> cursadas = new ArrayList<>();

        try {
            String sql = "SELECT * FROM incripcion;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Incripcion insc;

            while (rs.next()) {
                insc = new Incripcion();
                insc.setIdInscripcion(rs.getInt("idInscripto"));

                Alumno a = dataAlumno.buscarAlumno(rs.getInt("idAlumno"));
                insc.setIdAlumno(a.getIdAlumno());

                Materia m = dataMateria.buscarMateria(rs.getInt("idMateria"));
                insc.setIdMateria(m.getIdMateria());
                insc.setNota(rs.getDouble("nota"));

                cursadas.add(insc);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showInternalMessageDialog(null, "Error Inscripcion " + ex.getMessage());
        }
        return cursadas;
    }

    public List<Incripcion> obtenerInscripcionesPorAlumno(int id) {
        List<Incripcion> cursadas = new ArrayList<>();

        try {
            String sql = "SELECT * FROM incripcion WHERE idAlumno = ?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Incripcion inscripcion = new Incripcion();
                inscripcion.setIdInscripcion(rs.getInt("idInscripto"));

                Alumno a = dataAlumno.buscarAlumno(rs.getInt("idAlumno"));
                inscripcion.setAlumno(a);

                Materia m = dataMateria.buscarMateria(rs.getInt("idMateria"));
                inscripcion.setMateria(m);
                inscripcion.setNota(rs.getDouble("nota"));

                cursadas.add(inscripcion);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a incripcion " + ex.getMessage());
        }
        return cursadas;
    }

    public List<Materia> obtenerMateriasCursadas(int id) {
        List<Materia> materias = new ArrayList<Materia>();

        try {
            String sql = "SELECT incripcion.idMateria, nombre, año FROM incripcion,"
                    + " materia WHERE incripcion.idMateria = materia.idMateria\n"
                    + "AND incripcion.idAlumno = ?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("año"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener Inscripciones." + ex.getMessage());
        }
        return materias;
    }

    public List<Materia> obtenerMateriasNOCursadas(int id) {
        List<Materia> materias = new ArrayList<Materia>();

        try {
            String sql = "SELECT * FROM materia WHERE estado = 1 AND idMateria not in "
                    + "(SELECT idMateria FROM incripcion WHERE idAlumno =?);";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();
            Materia materia;

            while (resultSet.next()) {
                materia = new Materia();
                materia.setIdMateria(resultSet.getInt("idMateria"));
                materia.setNombre(resultSet.getString("nombre"));
                materia.setAño(resultSet.getInt("año"));
                materias.add(materia);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Acceder a la tabla Inscripcion " + ex.getMessage());
        }

        return materias;
    }

    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {

        try {

            String sql = "DELETE FROM incripcion WHERE idAlumno =? and idMateria =?;";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);

            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Inscripcion Eliminada");
            } else {
                JOptionPane.showMessageDialog(null, "No existe");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion " + ex.getMessage());
        }
    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {

        try {

            String sql = "UPDATE incripcion SET nota = ? WHERE idAlumno = ? and idMateria = ?;";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);

            int filas = ps.executeUpdate();
            if (filas > 0) {

                JOptionPane.showMessageDialog(null, "Nota actualizada");
            } else {
                JOptionPane.showMessageDialog(null, "El Alumno seleccionado o la materia no existen");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar nota. " + ex.getMessage());
        }
    }

    public List<Alumno> obtenerAlumnosXMateria(int idMateria) {
        List<Alumno> alumnosMateria = new ArrayList<>();

        try {
            String sql = "SELECT a.idAlumno, dni, nombre,apellido,fechaNacimiento ,estado "
                    + "FROM incripcion i,alumno a WHERE i.idAlumno = a.idAlumno AND idMateria = ? AND a.estado = 1;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Alumno alum = new Alumno();
                alum.setIdAlumno(rs.getInt("idAlumno"));
                alum.setDni(rs.getInt("dni"));
                alum.setNombre(rs.getString("nombre"));
                alum.setApellido(rs.getString("apellido"));
                alum.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alum.setEstado(true);

                alumnosMateria.add(alum);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener materias.");
        }
        return alumnosMateria;
    }
}
