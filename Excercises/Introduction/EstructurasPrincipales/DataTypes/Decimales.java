package EstructurasPrincipales.DataTypes;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Decimales {

    public static void main(String[] args) {

        /*
         * FLOAT: 4 bytes de espacio para almacenamiento. Aproximadamente 6 a 7 cifras
         * decimales significativas. Sufijo F
         */
        float floatNumber = 3.1234567F;
        System.out.println("float " + floatNumber);

        /*
         * DOUBLE: 8 bytes de espacio para almacenamiento. Aproximadamente 15 cifras
         * decimales significativas
         */
        double doubleNumber = 3.1234512345123453;
        System.out.println("double " + doubleNumber);
    }

}
