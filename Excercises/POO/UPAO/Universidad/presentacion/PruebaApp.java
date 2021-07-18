package Excercises.POO.UPAO.Universidad.presentacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Excercises.POO.UPAO.Universidad.accesoDatos.BaseDatos;
import Excercises.POO.UPAO.Universidad.entidades.DocenteContratado;
import Excercises.POO.UPAO.Universidad.entidades.DocenteNombrado;
import Excercises.POO.UPAO.Universidad.entidades.Trabajador;
import Excercises.POO.UPAO.Universidad.entidades.TrabajadorAdministrativo;
import Excercises.POO.UPAO.Universidad.entidades.TrabajadorDirector;

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
                    crearUniversidad();
                    break;
                case 2:
                    n = leerN();
                    crearTrabajadores();
                    break;
                case 3:
                    mostrarEdadPromedioDocentes();
                    break;
                case 4:
                    mostrarMayorSueldoDocentesContratados();
                    break;
                case 5:
                    buscarTrabajador();
                    break;
                case 6:
                    eliminarTrabajador();
                    break;
                case 7:
                    reporte();
                    break;
                case 8:
                    finalizarPrograma();
                    break;
            }
        } while (opc != 8);
    }

    private static int menu() throws IOException {
        int opc;
        do {
            System.out.println("\n*****MENU OPCIONES*****");
            System.out.println("1. Crear una universidad");
            System.out.println("2. Crear N trabajadores");
            System.out.println("3. Mostrar la edad promedio de docentes");
            System.out.println("4. Mostrar el mayor sueldo de los docentes contratados");
            System.out.println("5. Buscar por id y mostrar un trabajador de la colección incluyendo su sueldo");
            System.out.println("6. Eliminar un trabajador de la colección");
            System.out.println("7. Mostrar la información completa de todos los trabajadores según su tipo");
            System.out.println("8. Salir");
            System.out.print("Ingrese la opcion");
            opc = Integer.parseInt(br.readLine());
        } while (opc < 1 || opc > 8);

        return opc;
    }

    private static int leerN() throws IOException {
        int N;
        do {
            System.out.println("Ingrese N productos a crear:");
            N = Integer.parseInt(br.readLine());
        } while (N <= 0 || N >= 50);

        return N;
    }

    private static void crearUniversidad() throws IOException {
        System.out.println("***CREAR UNIVERSIDAD***");
        System.out.println("Nombre de la universidad: ");
        String nombre = br.readLine();
        System.out.println("Ciudad de la universidad: ");
        String ciudad = br.readLine();
        baseDatos.crearUniversidad(nombre, ciudad);
    }

    private static void crearTrabajadores() throws IOException {
        System.out.println("***CREAR TRABAJADOR***");
        for (int i = 0; i < n; i++) {
            System.out.println("1. Administrativo");
            System.out.println("2. Director");
            System.out.println("3. Docente Contratado");
            System.out.println("4. Docente Nombrado");
            System.out.println("Seleccione un Tipo de trabajador: ");
            int opcion = Integer.parseInt(br.readLine());
            if (opcion == 1) {
                System.out.println("***CREAR TRABAJADOR ADMINISTRATIVO***");
                System.out.println("Id del trabajador: ");
                String id = br.readLine();
                System.out.println("Nombres del trabajador: ");
                String nombres = br.readLine();
                System.out.println("Escuela del trabajador: ");
                String escuela = br.readLine();
                System.out.println("Labor del trabajador: ");
                String labor = br.readLine();
                System.out.println("Tipo de trabajador: ");
                String tipo = br.readLine();
                System.out.println("Sueldo: ");
                double sueldo = Double.parseDouble(br.readLine());
                Trabajador trabajador = new TrabajadorAdministrativo(id, nombres, escuela, labor, tipo, sueldo);
                baseDatos.agregarTrabajador(trabajador);
            } else if (opcion == 2) {
                System.out.println("***CREAR TRABAJADOR DIRECTOR***");
                System.out.println("Id del trabajador: ");
                String id = br.readLine();
                System.out.println("Nombres del trabajador: ");
                String nombres = br.readLine();
                System.out.println("Edad del trabajador: ");
                int edad = Integer.parseInt(br.readLine());
                System.out.println("Especialidad del trabajador: ");
                String especilidad = br.readLine();
                System.out.println("Numero de horas semanales del trabajador: ");
                int nroHorasSemanal = Integer.parseInt(br.readLine());
                System.out.println("Pago por hora del trabajador: ");
                double pagoHora = Double.parseDouble(br.readLine());
                System.out.println("Pago extra del trabajador: ");
                double pagoExtra = Double.parseDouble(br.readLine());
                System.out.println("Sueldo: ");
                double sueldo = Double.parseDouble(br.readLine());
                Trabajador trabajador = new TrabajadorDirector(id, nombres, edad, especilidad, nroHorasSemanal,
                        pagoHora, pagoExtra, sueldo);
                baseDatos.agregarTrabajador(trabajador);
            } else if (opcion == 3) {
                System.out.println("***CREAR TRABAJADOR DOCENTE CONTRATADO***");
                System.out.println("Id del trabajador: ");
                String id = br.readLine();
                System.out.println("Nombres del trabajador: ");
                String nombres = br.readLine();
                System.out.println("Edad del trabajador: ");
                int edad = Integer.parseInt(br.readLine());
                System.out.println("Especialidad del trabajador: ");
                String especilidad = br.readLine();
                System.out.println("Numero de horas semanales del trabajador: ");
                int nroHorasSemanal = Integer.parseInt(br.readLine());
                System.out.println("Pago por hora del trabajador: ");
                double pagoHora = Double.parseDouble(br.readLine());
                System.out.println("Pago extra del trabajador: ");
                double pagoExtra = Double.parseDouble(br.readLine());
                System.out.println("Sueldo: ");
                double sueldo = Double.parseDouble(br.readLine());
                Trabajador trabajador = new DocenteContratado(id, nombres, edad, especilidad, nroHorasSemanal, pagoHora,
                        pagoExtra, sueldo);
                baseDatos.agregarTrabajador(trabajador);
            } else if (opcion == 4) {
                System.out.println("***CREAR TRABAJADOR DOCENTE NOMBRADO***");
                System.out.println("Id del trabajador: ");
                String id = br.readLine();
                System.out.println("Nombres del trabajador: ");
                String nombres = br.readLine();
                System.out.println("Edad del trabajador: ");
                int edad = Integer.parseInt(br.readLine());
                System.out.println("Especialidad del trabajador: ");
                String especilidad = br.readLine();
                System.out.println("Sueldo: ");
                double sueldo = Double.parseDouble(br.readLine());
                System.out.println("Comisión: ");
                double comision = Double.parseDouble(br.readLine());
                Trabajador trabajador = new DocenteNombrado(id, nombres, edad, especilidad, sueldo, comision);
                baseDatos.agregarTrabajador(trabajador);
            } else {
                System.out.println("Opción invalida.");
            }
        }
    }

    private static void mostrarEdadPromedioDocentes() throws IOException {
        System.out.println("***MOSTRAR EDAD PROMEDIO DE TRABAJADORES***");
        System.out.println("Edad promedio: ");
        int promedio = Integer.parseInt(br.readLine());
        System.out.println(baseDatos.getEdadPromedioDocentes(promedio));
    }

    private static void mostrarMayorSueldoDocentesContratados() throws IOException {
        System.out.println("***MOSTRAR TRABAJADORES CON MAYOR SUELDO***");
        System.out.println(baseDatos.getMayorSueldoDocentesContratados());
    }

    private static void buscarTrabajador() throws IOException {
        System.out.println("***BUSCAR TRABAJADOR***");
        System.out.println("Id del trabajador: ");
        String id = br.readLine();
        System.out.println(baseDatos.buscarTrabajador(id));
    }

    private static void eliminarTrabajador() throws IOException {
        System.out.println("***ELIMINAR TRABAJADOR***");
        System.out.println("Id del trabajador: ");
        String id = br.readLine();
        boolean resultado = baseDatos.eliminarTrabajador(id);
        if (resultado) {
            System.out.println("Trabajador eliminado.");
        } else {
            System.out.println("Algo salio mal al eliminar el trabajador.");
        }
    }

    private static void reporte() throws IOException {
        System.out.println("***REPORTE***");
        System.out.println(baseDatos.mostrarReporteTrabajadores());
    }

    private static void finalizarPrograma() {
        System.out.println("Fin de la aplicación de almacen.");
        System.exit(0);
    }
}
