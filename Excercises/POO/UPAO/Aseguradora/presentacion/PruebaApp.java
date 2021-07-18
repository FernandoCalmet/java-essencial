package Excercises.POO.UPAO.Aseguradora.presentacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Excercises.POO.UPAO.Aseguradora.accesoDatos.BaseDatos;
import Excercises.POO.UPAO.Aseguradora.entidades.Contacto;
import Excercises.POO.UPAO.Aseguradora.entidades.ContactoEstudio;
import Excercises.POO.UPAO.Aseguradora.entidades.ContactoFamilia;
import Excercises.POO.UPAO.Aseguradora.entidades.ContactoProfesional;

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
                    crearAgenda();
                    break;
                case 2:
                    n = leerN();
                    crearContactos();
                    break;
                case 3:
                    buscarContacto();
                    break;
                case 4:
                    actualizarContacto();
                    break;
                case 5:
                    borrarContacto();
                    break;
                case 6:
                    mostrarAgenda();
                    break;
                case 7:
                    salir();
                    break;
            }
        } while (opc != 8);
    }

    private static int menu() throws IOException {
        int opc;
        do {
            System.out.println("\n*****MENU OPCIONES*****");
            System.out.println("1. Crear una Agenda Electronica.");
            System.out.println("2. Crear Contactos");
            System.out.println("3. Buscar Contacto");
            System.out.println("4. Actualizar telefono o direccion de algun contacto");
            System.out.println("5. Eliminar un contacto");
            System.out.println("6. Mostrar información de agenda");
            System.out.println("7. Salir");
            System.out.print("Ingrese la opcion");
            opc = Integer.parseInt(br.readLine());
        } while (opc < 1 || opc > 7);

        return opc;
    }

    private static int leerN() throws IOException {
        int N;
        do {
            System.out.println("Ingrese N contactos a crear:");
            N = Integer.parseInt(br.readLine());
        } while (N <= 0 || N >= 50);

        return N;
    }

    private static void crearAgenda() throws IOException {
        System.out.println("***CREAR AGENDA***");
        System.out.println("Nombre del propietario: ");
        String propietario = br.readLine();
        System.out.println("Año de la agenda: ");
        int año = Integer.parseInt(br.readLine());
        baseDatos.crearAgenda(propietario, año);
    }

    private static void crearContactos() throws IOException {
        System.out.println("***CREAR CONTACTO***");
        for (int i = 0; i < n; i++) {
            System.out.println("1. Contacto de profesional");
            System.out.println("2. Contacto de familiar");
            System.out.println("3. Contacto de estudio");
            System.out.println("Seleccione un Tipo de Contacto: ");
            int tipo = Integer.parseInt(br.readLine());
            if (tipo == 1) {
                System.out.println("Nombres del contacto: ");
                String nombres = br.readLine();
                System.out.println("Profesion del contacto: ");
                String profesion = br.readLine();
                System.out.println("Telefono del contacto: ");
                String telefono = br.readLine();
                Contacto contacto = new ContactoProfesional(nombres, profesion, telefono);
                baseDatos.crearContacto(contacto);
            } else if (tipo == 2) {
                System.out.println("Nombres del contacto: ");
                String nombres = br.readLine();
                System.out.println("Parentesco del contacto: ");
                String parentesco = br.readLine();
                System.out.println("Telefono del contacto: ");
                String telefono = br.readLine();
                Contacto contacto = new ContactoFamilia(nombres, parentesco, telefono);
                baseDatos.crearContacto(contacto);
            } else if (tipo == 3) {
                System.out.println("Nombres del contacto: ");
                String nombres = br.readLine();
                System.out.println("Lugar de trabajo del contacto: ");
                String lugarTrabajo = br.readLine();
                System.out.println("Telefono del contacto: ");
                String telefono = br.readLine();
                System.out.println("Direccion del contacto: ");
                String direccion = br.readLine();
                Contacto contacto = new ContactoEstudio(nombres, lugarTrabajo, telefono, direccion);
                baseDatos.crearContacto(contacto);
            } else {
                System.out.println("Opción invalida.");
            }
        }
    }

    private static void buscarContacto() throws IOException {
        System.out.println("***BUSCAR CONTACTO***");
        System.out.println("Ingrese el nombre del contacto a buscar: ");
        String nombre = br.readLine();
        System.out.println(baseDatos.buscarContactoPorNombres(nombre));
    }

    private static void actualizarContacto() throws IOException {
        System.out.println("***ACTUALIZAR CONTACTO***");
        System.out.println("1. Actualizar telefono de un contacto.");
        System.out.println("2. Actualizar direccion de un contacto.");
        System.out.println("Seleccione una opción del Contacto que desea modificar: ");
        int opcion = Integer.parseInt(br.readLine());
        if (opcion == 1) {
            System.out.println("Ingrese el nombre del contacto a buscar: ");
            String nombre = br.readLine();
            System.out.println("Ingrese el telefono del contacto a modificar: ");
            String telefono = br.readLine();
            boolean resultado = baseDatos.actualizarTelefonoContacto(nombre, telefono);
            if (resultado == true) {
                System.out.println("El telefono del contacto se actualizo exitosamente.");
            } else {
                System.out.println("Algo salio mal al intentar actualizar el telefono del contacto.");
            }
        } else if (opcion == 2) {
            System.out.println("Ingrese el nombre del contacto a buscar: ");
            String nombre = br.readLine();
            System.out.println("Ingrese la direccion del contacto a modificar: ");
            String direccion = br.readLine();
            boolean resultado = baseDatos.actualizarDireccionContacto(nombre, direccion);
            if (resultado == true) {
                System.out.println("La direccion del contacto se actualizo exitosamente.");
            } else {
                System.out.println("Algo salio mal al intentar actualizar la direccion del contacto.");
            }
        } else {
            System.out.println("Opción invalida.");
        }
    }

    private static void borrarContacto() throws IOException {
        System.out.println("***ELIMINAR CONTACTO***");
        System.out.println("Ingrese el nombre del contacto a eliminar: ");
        String nombre = br.readLine();
        boolean resultado = baseDatos.eliminarContacto(nombre);
        if (resultado == true) {
            System.out.println("El contacto se elimino exitosamente.");
        } else {
            System.out.println("Algo salio mal al intentar eliminar el contacto.");
        }
    }

    private static void mostrarAgenda() throws IOException {
        System.out.println("***MOSTRAR AGENDA***");
        System.out.println(baseDatos.consultarAgenda());
    }

    private static void salir() {
        System.out.println("Fin de la aplicación de aseguradora.");
        System.exit(0);
    }
}
