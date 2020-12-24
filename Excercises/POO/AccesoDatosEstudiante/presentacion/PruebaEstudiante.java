package Excercises.POO.AccesoDatosEstudiante.presentacion;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
import Excercises.POO.AccesoDatosEstudiante.accesoDatos.*;
import Excercises.POO.AccesoDatosEstudiante.entidades.*;
import java.io.*;

public class PruebaEstudiante {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Declaracion de variables primitivas
        String id = null, nom = null, car = null;
        int opcion;

        // Declaracion de variables de referencia
        Estudiante oE = null;
        Carrera oCa = null;

        // Se crean objetos para acceder a las clases de acceso a datos
        DAOEstudiante bdEst = new DAOEstudiante();
        DAOCarrera bdCar = new DAOCarrera();

        do {
            System.out.print("\n" + "\n0 = Salir del programa" + "\n1 = Buscar carrera por nombre"
                    + "\n2 = Listar carreras" + "\n3 = Guardar estudiante" + "\n4 = Eliminar estudiante"
                    + "\n5 = Listar estudiantes\n" + "Ingresar una opcion del menu:");
            opcion = Integer.parseInt(br.readLine());
            switch (opcion) {
                case 0: // Finalizar programa
                    System.out.println("Hasta luego!");
                    System.exit(0);
                    break;
                case 1: // Llamar a funcion para buscar carrera por nombre
                    // Se muestra lista de Carreras de la BD
                    System.out.println(bdCar.listar().toString());
                    // Captura de datos
                    System.out.println("Ingrese Carrera: ");
                    car = br.readLine();
                    // Busca el objeto Carrera por su nombre
                    System.out.println(bdCar.buscarCarxNom(car).toString());
                    break;
                case 2: // Llamar a funcion para listar carreras
                    System.out.println(bdCar.listar().toString());
                    break;
                case 3: // Llamar a funcion para guardar estudiante
                    // Captura de datos
                    System.out.println("Ingrese Id: ");
                    id = br.readLine();
                    System.out.println("Ingrese Nombre: ");
                    nom = br.readLine();
                    System.out.println("Ingrese Carrera: ");
                    car = br.readLine();
                    // Se crea busca al objeto carrera
                    oCa = bdCar.buscarCarxNom(car);
                    // Se crea el objeto estudiante
                    oE = new Estudiante(id, nom, oCa);
                    // Se guarda el objeto en la BD
                    bdEst.guardar(oE);
                    // Se muestra lista de estudiantes de la BD
                    System.out.println(bdEst.listar().toString());
                    break;
                case 4: // Llamar a funcion para eliminar estudiante
                    // Captura de datos
                    System.out.println("Ingrese Id: ");
                    id = br.readLine();
                    // Se busca al objeto estudiante
                    oE = bdEst.buscarEstxId(id);
                    bdEst.eliminar(oE);
                    // Se muestra lista de estudiantes de la BD
                    System.out.println(bdEst.listar().toString());
                    break;
                case 5: // Llamar a funcion para listar estudiantes
                    // Se muestra lista de estudiantes de la BD
                    System.out.println(bdEst.listar().toString());
                    break;
                default:
                    System.out.println("\nComando ilegal!");
            }
        } while (opcion < 6);
    }
}
