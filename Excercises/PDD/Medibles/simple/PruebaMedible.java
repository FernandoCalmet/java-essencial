package Medibles.simple;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PruebaMedible {

    public static void main(String[] args) {
        Medible[] cuentaMedible = new Medible[3];

        cuentaMedible[0] = new CuentaBancaria("juan", 100.00);
        cuentaMedible[1] = new CuentaBancaria("julio", 150.50);
        cuentaMedible[2] = new CuentaBancaria("rocio", 210.30);

        System.out.println("CUENTAS");
        System.out.println("Saldo promedio de las cuentas: " + promedio(cuentaMedible));
        System.out.println("El saldo maximo es: " + maximo(cuentaMedible));

        Medible[] paisMedible = new Medible[3];

        paisMedible[0] = new Pais("Peru", 5000.50);
        paisMedible[1] = new Pais("Chile", 3500.80);
        paisMedible[2] = new Pais("Bolivia", 4000.10);

        System.out.println("PAISES");
        System.out.println("Superficie promedio de los paises: " + promedio(paisMedible));
        System.out.println("La superficie maxima es: " + maximo(paisMedible));
    }

    public static double promedio(Medible[] o) {
        double suma = 0;
        for (Medible item : o) {
            suma = suma + item.obtenerMedida();
        }

        return suma / o.length;
    }

    public static double maximo(Medible[] o) {
        double max = 0;

        for (Medible item : o) {
            if (item.obtenerMedida() > max) {
                max = item.obtenerMedida();
            }
        }
        return max;
    }
}