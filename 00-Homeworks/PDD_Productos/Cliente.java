import java.util.Scanner;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public class Cliente {
    private static Scanner scanner;
    private static String opcion;

    public static void main(String[] args) {

        ConcretaRopa ropa = new ConcretaRopa();
        ContextoProducto strategyA = new ContextoProducto();
        strategyA.setStrategyA(ropa);

        ConcretaCerveza cerveza = new ConcretaCerveza();
        ContextoProducto strategyB = new ContextoProducto();
        strategyB.setStrategyB(cerveza);

        scanner = new Scanner(System.in);

        do {
            System.out.println(
                    "\n[CATALOGO DE PRODUCTOS]:\nCERVEZAS: Negra, Rubia, Roja\nROPA: Pantalon, Camisa, Zapatos\nSALIR: Terminar programa");
            System.out.println("\nIngresar el producto que desea consultar: ");
            opcion = scanner.next();
            switch (opcion.toLowerCase()) {
                case "negra":
                    System.out.println(strategyB.getNegra());
                    break;
                case "rubia":
                    System.out.println(strategyB.getRubia());
                    break;
                case "roja":
                    System.out.println(strategyB.getRoja());
                    break;
                case "pantalon":
                    System.out.println(strategyA.getPantalon());
                    break;
                case "camisa":
                    System.out.println(strategyA.getCamisa());
                    break;
                case "zapatos":
                    System.out.println(strategyA.getZapatos());
                    break;
                case "salir":
                    System.out.println("Gracias por utilizar este programa :)");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nEl producto solicitado no existe!");
                    break;
            }
        } while (opcion != null);
    }
}