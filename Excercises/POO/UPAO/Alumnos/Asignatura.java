package Excercises.POO.UPAO.Alumnos;

import java.util.ArrayList;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Asignatura {
    private String nombre;
    private Profesor profesor;
    private ArrayList<Alumno> alumnos;

    public Asignatura(String nombre, Profesor profesor, ArrayList<Alumno> alumnos) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.alumnos = alumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Alumno> getAlumnos() {
        return this.alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void mostrarExamenesAprobados(ArrayList<Examen> examenes) {
        for (Examen item : examenes) {
            if (item.getNota() > 10)
                System.out.println("\nAPROBADOS: " + item.toString());
        }
    }

    @Override
    public String toString() {
        return "\nNOMBRE ASIGNATURA: " + getNombre() + "\nPROFESOR: " + getProfesor() + "\nALUMNOS: " + getAlumnos();
    }
}
