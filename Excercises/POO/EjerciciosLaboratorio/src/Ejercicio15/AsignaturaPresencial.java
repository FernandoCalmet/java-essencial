package Ejercicio15;

import java.util.ArrayList;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class AsignaturaPresencial extends Asignatura {

    public AsignaturaPresencial(String nombre, Profesor profesor, ArrayList<Alumno> alumnos) {
        super(nombre, profesor, alumnos);
    }

    @Override
    public String toString() {
        return "ASIGNATURA PRESENCIAL: " + super.toString();
    }
}