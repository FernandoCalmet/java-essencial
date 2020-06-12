package Caso7;

import java.util.ArrayList;

public class AsignaturaPresencial extends Asignatura {

    public AsignaturaPresencial(String nombre, Profesor profesor, ArrayList<Alumno> alumnos) {
        super(nombre, profesor, alumnos);
    }

    @Override
    public String toString() {
        return "ASIGNATURA PRESENCIAL: " + super.toString();
    }
}