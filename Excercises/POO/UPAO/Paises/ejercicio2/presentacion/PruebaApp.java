package Excercises.POO.UPAO.Paises.ejercicio2.presentacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Excercises.POO.UPAO.Paises.ejercicio2.accesoDatos.BaseDatos;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PruebaApp {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BaseDatos baseDatos = new BaseDatos();
    static int nP;
    static int nD;

    public static void main(String[] args) throws IOException {
        int opc;
        do {
            opc = menu();
            switch (opc) {
                case 1:
                    crearPais();
                    break;
                case 2:
                    nP = leerNProvincias();
                    crearProvincias();
                    break;
                case 3:
                    nD = leerNDistritos();
                    crearDistritos();
                    break;
                case 4:
                    buscarProvincia();
                    break;
                case 5:
                    buscarAlcadePorDistrito();
                    break;
                case 6:
                    eliminarDistrito();
                    break;
                case 7:
                    consultarPais();
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
            System.out.println("1. Crear un Pais.");
            System.out.println("2. Crear Provincias");
            System.out.println("3. Crear Distritos");
            System.out.println("4. Buscar una Provincia por su nombre");
            System.out.println("5. Consultar un alcalde por el nombre del Distrito");
            System.out.println("6. Eliminar un Distrito");
            System.out.println("7. Mostrar el pais con todos sus datos");
            System.out.println("8. Salir");
            System.out.print("Ingrese la opcion");
            opc = Integer.parseInt(br.readLine());
        } while (opc < 1 || opc > 8);

        return opc;
    }

    private static int leerNProvincias() throws IOException {
        int N;
        do {
            System.out.println("Ingrese N provincias a crear:");
            N = Integer.parseInt(br.readLine());
        } while (N <= 0 || N >= 50);

        return N;
    }

    private static int leerNDistritos() throws IOException {
        int N;
        do {
            System.out.println("Ingrese N distritos a crear:");
            N = Integer.parseInt(br.readLine());
        } while (N <= 0 || N >= 50);

        return N;
    }

    private static void crearPais() throws IOException {
        System.out.println("***CREAR PAIS***");
        System.out.println("Nombre del pais: ");
        String nombre = br.readLine();
        System.out.println("poblacion del pais: ");
        int poblacion = Integer.parseInt(br.readLine());
        System.out.println("Moneda del pais: ");
        String moneda = br.readLine();
        System.out.println("Capital del pais: ");
        String capital = br.readLine();
        baseDatos.crearPais(nombre, poblacion, moneda, capital);
    }

    private static void crearProvincias() throws IOException {
        System.out.println("***CREAR PROVINCIAS***");
        for (int i = 0; i < nP; i++) {
            System.out.println("Nombre de la provincia: ");
            String nombre = br.readLine();
            System.out.println("Poblacion de la provincia: ");
            int poblacion = Integer.parseInt(br.readLine());
            baseDatos.crearProvincia(nombre, poblacion);
        }
    }

    private static void crearDistritos() throws IOException {
        System.out.println("***CREAR DISTRITOS***");
        for (int i = 0; i < nD; i++) {
            System.out.println("Nombre del distrito: ");
            String nombre = br.readLine();
            System.out.println("Alcalde del distrito: ");
            String alcalde = br.readLine();
            baseDatos.crearDistrito(nombre, alcalde);
        }
    }

    private static void finalizarPrograma() {
        System.out.println("Fin de la aplicación de almacen.");
        System.exit(0);
    }

    private static void buscarProvincia() throws IOException {
        System.out.println("***BUSCAR PROVINCIA***");
        System.out.println("Ingrese el nombre de la provincia a buscar: ");
        String nombre = br.readLine();
        System.out.println(baseDatos.buscarProvinciaPorNombre(nombre));
    }

    private static void buscarAlcadePorDistrito() throws IOException {
        System.out.println("***BUSCAR ALCADE POR DISTRITO***");
        System.out.println("Ingrese el nombre del distrito: ");
        String nombre = br.readLine();
        System.out.println(baseDatos.buscarAlcadePorNombreDistrito(nombre));
    }

    private static void eliminarDistrito() throws IOException {
        System.out.println("***ELIMINAR DISTRITO***");
        System.out.println("Ingrese el nombre del distrito a eliminar: ");
        String nombre = br.readLine();
        baseDatos.eliminarDistrito(nombre);
    }

    private static void consultarPais() throws IOException {
        System.out.println("***CONSULTAR PAIS***");
        System.out.println(baseDatos.mostrarPais());
    }
}
