package EstructurasPrincipales.DataTypes;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Enteros {

    public static void main(String[] args) {

        /*
         * BYTE: 1 byte de espacio para almacenamiento. Desde -128 hasta 127
         */
        byte byteNumber = 127;
        System.out.println("byte " + byteNumber);

        /*
         * SHORT: 2 bytes de espacio para almacenamiento. Desde -32,768 hasta 32,767
         */
        short shortNumber = 32767;
        System.out.println("short " + shortNumber);

        /*
         * INT: 4 bytes de espacio para almacenamiento. Desde -2,147,483,648 hasta
         * 2,147,483,647
         */
        int intNumber = 2147483647;
        System.out.println("int " + intNumber);

        /*
         * LONG: 8 bytes de espacio para almacenamiento. Muy extensa. Sufijo L
         */
        long longNumber = 2147483647;
        System.out.println("long " + longNumber);
    }

}
