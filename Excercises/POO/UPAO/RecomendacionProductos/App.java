package Excercises.POO.UPAO.RecomendacionProductos;

import java.util.Scanner;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class App {

    private static Scanner scanner;
    private static String opcion;
    private static Producto producto;

    public static void main(String[] args) {

        Recomendaciones recomendacion = new Recomendaciones();
        Experto experto = new Experto();
        scanner = new Scanner(System.in);

        do {
            System.out.println(
                    "\n[CATALOGO DE PRODUCTOS]:\nCERVEZAS: Negra, Rubia, Roja\nROPA: Pantalon, Camisa, Zapatos\nSALIR: Terminar programa");
            System.out.println("\nIngresar el producto que desea consultar: ");
            opcion = scanner.next();

            switch (opcion.toLowerCase()) {
                case "negra":
                    producto = recomendacion.crearCervezaNegra();
                    System.out.println(experto.getRecomendacion(producto));
                    break;
                case "rubia":
                    producto = recomendacion.crearCervezaRubia();
                    System.out.println(experto.getRecomendacion(producto));
                    break;
                case "roja":
                    producto = recomendacion.crearCervezaRoja();
                    System.out.println(experto.getRecomendacion(producto));
                    break;
                case "pantalon":
                    producto = recomendacion.crearRopaPantalon();
                    System.out.println(experto.getRecomendacion(producto));
                    break;
                case "camisa":
                    producto = recomendacion.crearRopaCamisa();
                    System.out.println(experto.getRecomendacion(producto));
                    break;
                case "zapatos":
                    producto = recomendacion.crearRopaZapatos();
                    System.out.println(experto.getRecomendacion(producto));
                    break;
                case "salir":
                    System.out.println("Gracias por utilizar este programa :)");
                    System.exit(0);
                default:
                    System.out.println("\nEl producto solicitado no existe!");
            }
        } while (opcion != null);

    }
}