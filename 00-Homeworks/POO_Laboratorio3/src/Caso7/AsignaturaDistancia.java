package Caso7;

import java.util.ArrayList;

public class AsignaturaDistancia extends Asignatura {

    public AsignaturaDistancia(String nombre, Profesor profesor, ArrayList<Alumno> alumnos) {
        super(nombre, profesor, alumnos);
    }

    @Override
    public String toString() {
        return "ASIGNATURA A DISTANCIA: " + super.toString();
    }
}