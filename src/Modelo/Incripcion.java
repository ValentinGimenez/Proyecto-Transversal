package Modelo;

public class Incripcion {

    private int idInscripto;
    private Alumno alumno;
    private Materia materia;
    private double nota;

    public Incripcion(int idInscripcion, Alumno alumno, Materia materia, double nota) {
        this.idInscripto = idInscripcion;
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public Incripcion(Alumno alumno, Materia materia, double nota) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Incripcion() {
    }

    public Incripcion(double nota) {
        this.nota = nota;
    }

    public int getIdInscripcion() {
        return idInscripto;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripto = idInscripcion;
    }

    public int getIdAlumno() {
        return alumno.getIdAlumno();
    }

    public void setIdAlumno(int idAlumno) {
        this.alumno.setIdAlumno(idAlumno);
    }

    public int getIdMateria() {
        return materia.getIdMateria();
    }

    public void setIdMateria(int idMateria) {
        this.materia.setIdMateria(idMateria);
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

}
