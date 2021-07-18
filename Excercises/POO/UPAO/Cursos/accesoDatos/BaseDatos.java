package Excercises.POO.UPAO.Cursos.accesoDatos;

import java.util.ArrayList;
import Excercises.POO.UPAO.Cursos.entidades.Curso;
import Excercises.POO.UPAO.Cursos.entidades.Estudiante;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class BaseDatos {
    // Atributos
    static Curso entidadCurso;
    static ArrayList<Estudiante> estudiantes;

    // Constructor
    public BaseDatos() {
        entidadCurso = new Curso();
        estudiantes = new ArrayList<>();
    }

    // Metodos publicos
    public void agregarCurso(String codigo, String nombre) {
        entidadCurso.setCodigo(codigo);
        entidadCurso.setNombre(nombre);
    }

    public void modificarCurso(String codigo, String nombre) {
        entidadCurso.setCodigo(codigo);
        entidadCurso.setNombre(nombre);
    }

    public void eliminarCurso() {
        entidadCurso = null;
    }

    public String reporteCurso() {
        return entidadCurso.toString();
    }

    public void agregarEstudiante(int id, String nombre, int edad, int ciclo) {
        Estudiante estudiante = new Estudiante(id, nombre, edad, ciclo);
        estudiantes.add(estudiante);
        entidadCurso.setEstudiantes(estudiantes);
    }

    public String consultarEstudiante(int id) {
        Estudiante estudiante = null;
        for (Estudiante e : entidadCurso.getEstudiantes()) {
            if (e.getId() == id) {
                estudiante = e;
            }
        }

        return estudiante.toString();
    }

    public void modificarNombresEstudiante(int id, String nombres) {
        for (Estudiante e : entidadCurso.getEstudiantes()) {
            if (e.getId() == id) {
                e.setNombres(nombres);
            }
        }
    }

    public void modificarEdadEstudiante(int id, int edad) {
        for (Estudiante e : entidadCurso.getEstudiantes()) {
            if (e.getId() == id) {
                e.setEdad(edad);
            }
        }
    }

    public void modificarCicloEstudiante(int id, int ciclo) {
        for (Estudiante e : entidadCurso.getEstudiantes()) {
            if (e.getId() == id) {
                e.setCiclo(ciclo);
            }
        }
    }

    public void eliminarEstudiante(int id) {
        for (Estudiante e : entidadCurso.getEstudiantes()) {
            if (e.getId() == id) {
                entidadCurso.getEstudiantes().remove(e);
            }
        }
    }
}
