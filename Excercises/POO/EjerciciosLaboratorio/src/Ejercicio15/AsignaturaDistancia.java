package Ejercicio15;

import java.util.ArrayList;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class AsignaturaDistancia extends Asignatura {

    public AsignaturaDistancia(String nombre, Profesor profesor, ArrayList<Alumno> alumnos) {
        super(nombre, profesor, alumnos);
    }

    @Override
    public String toString() {
        return "ASIGNATURA A DISTANCIA: " + super.toString();
    }
}