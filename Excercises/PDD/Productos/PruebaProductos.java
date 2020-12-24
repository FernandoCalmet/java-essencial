package Excercises.PDD.Productos;

import java.util.Scanner;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PruebaProductos {
    private static Scanner scanner = new Scanner(System.in);
    private static String opcion;

    public static void main(String[] args) {
        System.out.println("[Productos]: Ropa, Cerveza");
        opcion = scanner.next();
        switch (opcion.toLowerCase()) {
            case "ropa":
                System.out.println("[Tipos de Productos]: Pantalon, Camisa, Zapatos");
                menuRopa();
                break;
            case "cerveza":
                System.out.println("[Tipos de Productos]: Negra, Rubia, Roja");
                menuCerveza();
                break;
            default:
                System.out.println("\nEl producto solicitado no existe!");
                break;
        }
    }

    private static void menuRopa() {
        ConcretaRopa ropa = new ConcretaRopa();
        ContextoRopa recomendacionRopa = new ContextoRopa();
        recomendacionRopa.setRopa(ropa);

        System.out.println("RECOMENDACIONES DE ROPA:");
        opcion = scanner.next();
        switch (opcion.toLowerCase()) {
            case "pantalon":
                System.out.println(recomendacionRopa.getPantalon());
                break;
            case "camisa":
                System.out.println(recomendacionRopa.getCamisa());
                break;
            case "zapatos":
                System.out.println(recomendacionRopa.getZapatos());
                break;
            default:
                System.out.println("\nEl producto solicitado no existe!");
                break;
        }

    }

    private static void menuCerveza() {
        ConcretaCerveza cerveza = new ConcretaCerveza();
        ContextoCerveza recomendacionCerveza = new ContextoCerveza();
        recomendacionCerveza.setCerveza(cerveza);

        System.out.println("RECOMENDACIONES DE CERVEZA: ");
        opcion = scanner.next();
        switch (opcion.toLowerCase()) {
            case "negra":
                System.out.println(recomendacionCerveza.getNegra());
                break;
            case "rubia":
                System.out.println(recomendacionCerveza.getRubia());
                break;
            case "roja":
                System.out.println(recomendacionCerveza.getRoja());
                break;
            default:
                System.out.println("\nEl producto solicitado no existe!");
                break;
        }
    }
}
