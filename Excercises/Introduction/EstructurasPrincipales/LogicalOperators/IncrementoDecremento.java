package LogicalOperators;

public class IncrementoDecremento {

    public static void main(String[] args) {

        /*
         * Incremento : ++
         */
        int incrementoSimple = 100;
        System.out.print("INCREASE: " + incrementoSimple++);
        System.out.print(" ++ " + incrementoSimple++);
        System.out.print(" ++ " + incrementoSimple++);
        System.out.print(" ++ " + incrementoSimple++ + "\n");

        /*
         * Decremento : --
         */
        int decrementoSimple = 100;
        System.out.print("DECREASE: " + decrementoSimple--);
        System.out.print(" -- " + decrementoSimple--);
        System.out.print(" -- " + decrementoSimple--);
        System.out.print(" -- " + decrementoSimple-- + "\n");

        /*
         * Incremento por rango numerico : +=
         */
        int incrementoRango = 100;
        System.out.print("INCREASE BY RANGE: " + incrementoRango);
        incrementoRango += incrementoRango;
        System.out.print(" += " + incrementoRango);
        incrementoRango += incrementoRango;
        System.out.print(" += " + incrementoRango);
        incrementoRango += incrementoRango;
        System.out.print(" += " + incrementoRango + "\n");

        /*
         * Decremento por rango numerico : -=
         */
        int decrementoRango = 100;
        System.out.print("DECREASE BY RANGE: ");
        System.out.print("\n" + decrementoRango + " -= 10");
        decrementoRango -= 10;
        System.out.print("\n" + decrementoRango + " -= 20");
        decrementoRango -= 20;
        System.out.print("\n" + decrementoRango + " -= 30");
        decrementoRango -= 30;
        System.out.println("\nResult: " + decrementoRango);
    }
}
