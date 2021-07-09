package Excercises.POO.UPAO.EjerciciosLaboratorio.src.Ejercicio15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PruebaUniversidad {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /* CREAR PROFESORES */
        System.out.println("* DATOS DEL PROFESOR #1: *");
        System.out.println("Ingresar los nombres del profesor: ");
        String nombre_prof1 = br.readLine();
        System.out.println("Ingresar el DNI del profesor: ");
        String dni_prof1 = br.readLine();
        System.out.println("* DATOS DEL PROFESOR #2: *");
        System.out.println("Ingresar los nombres del profesor: ");
        String nombre_prof2 = br.readLine();
        System.out.println("Ingresar el DNI del profesor: ");
        String dni_prof2 = br.readLine();

        Profesor profesor1 = new Profesor(nombre_prof1, dni_prof1);
        Profesor profesor2 = new Profesor(nombre_prof2, dni_prof2);

        /* CREAR ALUMNOS */
        System.out.println("* DATOS DEL ALUMNO #1: *");
        System.out.println("Ingresar los nombres: ");
        String nombre1 = br.readLine();
        System.out.println("* DATOS DEL ALUMNO #2: *");
        System.out.println("Ingresar los nombres: ");
        String nombre2 = br.readLine();
        System.out.println("* DATOS DEL ALUMNO #3: *");
        System.out.println("Ingresar los nombres: ");
        String nombre3 = br.readLine();

        Alumno alumno1 = new Alumno(nombre1);
        Alumno alumno2 = new Alumno(nombre2);
        Alumno alumno3 = new Alumno(nombre3);
        ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);

        /* CREAR ASIGNATURAS */
        System.out.println("* DATOS DE LA ASIGNATURA #1: *");
        System.out.println("Ingresar el nombre de la asignatura: ");
        String nombre_curso1 = br.readLine();
        System.out.println("* DATOS DE LA ASIGNATURA #2: *");
        System.out.println("Ingresar el nombre de la asignatura: ");
        String nombre_curso2 = br.readLine();

        Asignatura asignatura1 = new AsignaturaDistancia(nombre_curso1, profesor1, listaAlumnos);
        Asignatura asignatura2 = new AsignaturaPresencial(nombre_curso2, profesor2, listaAlumnos);

        /* MOSTRAR DATOS DE LAS ASIGNATURAS */
        System.out.println("\n#1: " + asignatura1.toString());
        System.out.println("\n#2: " + asignatura2.toString());

        /* CREAR EXAMENES CON ASIGNATURAS Y ALUMNOS */
        Examen examen1 = new Examen(asignatura1, alumno1, 15);
        Examen examen2 = new Examen(asignatura1, alumno2, 11);
        Examen examen3 = new Examen(asignatura1, alumno3, 7);
        Examen examen4 = new Examen(asignatura2, alumno1, 18);
        Examen examen5 = new Examen(asignatura2, alumno2, 9);
        Examen examen6 = new Examen(asignatura2, alumno3, 10);

        ArrayList<Examen> listaExamenes1 = new ArrayList<Examen>();
        listaExamenes1.add(examen1);
        listaExamenes1.add(examen2);
        listaExamenes1.add(examen3);

        ArrayList<Examen> listaExamenes2 = new ArrayList<Examen>();
        listaExamenes2.add(examen4);
        listaExamenes2.add(examen5);
        listaExamenes2.add(examen6);

        /* MOSTRAR ALUMNOS EN EXAMENES APROBADOS */
        asignatura1.mostrarExamenesAprobados(listaExamenes1);
        asignatura2.mostrarExamenesAprobados(listaExamenes2);
    }
}