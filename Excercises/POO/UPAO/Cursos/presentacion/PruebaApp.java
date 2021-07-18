package Excercises.POO.UPAO.Cursos.presentacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Excercises.POO.UPAO.Cursos.accesoDatos.BaseDatos;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PruebaApp {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BaseDatos baseDatos = new BaseDatos();
    static int n;

    public static void main(String[] args) throws IOException {
        int opc;
        do {
            opc = menu();
            switch (opc) {
                case 1:
                    // a) Crear un Curso.
                    crearCurso();
                    break;
                case 2:
                    // b) Se requiere crear N estudiantes para el curso y almacenarlos en una
                    // colección.
                    n = leerN();
                    crearEstudiantes();
                    break;
                case 3:
                    // c) Buscar a un estudiante por su id y mostrar todos sus datos.
                    buscarEstudiante();
                    break;
                case 4:
                    // d) Modificar la edad de un estudiante.
                    modificarEdadEstudiante();
                    break;
                case 5:
                    // e) Eliminar un estudiante de la colección.
                    eliminarEstudiante();
                    break;
                case 6:
                    // f) Mostrar la información de un Curso con todos sus estudiantes.
                    reporteEstudiantesPorCurso();
                    break;
                case 7:
                    finalizarPrograma();
                    break;
            }
        } while (opc != 7);
    }

    private static int menu() throws IOException {
        int opc;
        do {
            System.out.println("\n*****MENU OPCIONES*****");
            System.out.println("1. Ingresar curso");
            System.out.println("2. Ingresar estudiante");
            System.out.println("3. Buscar estudiante por Id");
            System.out.println("4. Modificar la edad de un estudiante");
            System.out.println("5. Eliminar estudiante");
            System.out.println("6. Reporte de estudiantes");
            System.out.println("7. Salir");
            System.out.print("Ingrese la opcion");
            opc = Integer.parseInt(br.readLine());
        } while (opc < 1 || opc > 7);

        return opc;
    }

    private static int leerN() throws IOException {
        int N;
        do {
            System.out.println("Ingrese N estudiantes a crear:");
            N = Integer.parseInt(br.readLine());
        } while (N <= 0 || N >= 50);

        return N;
    }

    private static void crearCurso() throws IOException {
        System.out.println("***CREAR CURSO***");
        System.out.println("Ingresar el codigo del curso: ");
        String codigoCurso = br.readLine();
        System.out.println("Ingresar el nombre del curso: ");
        String nombreCurso = br.readLine();
        baseDatos.agregarCurso(codigoCurso, nombreCurso);
    }

    private static void crearEstudiantes() throws IOException {
        System.out.println("***CREAR N ESTUDIANTES***");
        for (int i = 0; i < n; i++) {
            System.out.println("***AÑADIR ESTUDIANTE #" + i + "***");
            System.out.println("Ingresar el ID del estudiante");
            int id = Integer.parseInt(br.readLine());
            System.out.println("Ingresar el nombre del estudiante: ");
            String nombre = br.readLine();
            System.out.println("Ingresar la edad del estudiante");
            int edad = Integer.parseInt(br.readLine());
            System.out.println("Ingresar el ciclo del estudiante");
            int ciclo = Integer.parseInt(br.readLine());
            baseDatos.agregarEstudiante(id, nombre, edad, ciclo);
        }
    }

    private static void buscarEstudiante() throws IOException {
        System.out.println("***BUSCAR ESTUDIANTE***");
        System.out.println("Ingresar el Id del estudiante que desea buscar: ");
        int id = Integer.parseInt(br.readLine());
        String busqueda = "";
        System.out.println("\nId de Estudiante: ");
        busqueda = baseDatos.consultarEstudiante(id);
        if (!"".equals(busqueda)) {
            System.out.println(busqueda);
        } else {
            System.out.println("No se encontro ningun estudiante con ese Id.");
        }
    }

    private static void modificarEdadEstudiante() throws IOException {
        System.out.println("***MODIFICAR EDAD DE ESTUDIANTE***");
        System.out.println("Ingresar el ID del estudiante que desea buscar");
        int id = Integer.parseInt(br.readLine());
        System.out.println("Ingresar la edad del estudiante");
        int edad = Integer.parseInt(br.readLine());
        baseDatos.modificarEdadEstudiante(id, edad);
    }

    static void eliminarEstudiante() throws IOException {
        System.out.println("***ELIMINAR ESTUDIANTE***");
        System.out.println("Ingresar el Id del estudiante que desea eliminar: ");
        int id = Integer.parseInt(br.readLine());
        baseDatos.eliminarEstudiante(id);
    }

    static void reporteEstudiantesPorCurso() throws IOException {
        System.out.println("***REPORTE DE ESTUDIANTES***");
        System.out.println(baseDatos.reporteCurso());
    }

    private static void finalizarPrograma() {
        System.out.println("Fin de la aplicación de cursos.");
        System.exit(0);
    }
}
