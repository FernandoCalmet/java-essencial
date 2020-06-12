package Caso7;

public class Examen {

    private Asignatura asignatura;
    private Alumno alumno;
    private int nota;

    public Examen(Asignatura asignatura, Alumno alumno, int nota) {
        this.asignatura = asignatura;
        this.alumno = alumno;
        this.nota = nota;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "\n" + getAsignatura() + "\nAlumno: " + getAlumno() + "\nNota: " + getNota();
    }
}
