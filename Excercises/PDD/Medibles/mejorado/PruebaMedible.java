package Excercises.PDD.Medibles.mejorado;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
import java.util.ArrayList;

public class PruebaMedible {

    public static void main(String[] args) {
        ArrayList<Medible> cuentaMedible = new ArrayList<>();

        cuentaMedible.add(new CuentaBancaria("juan", 100.00));
        cuentaMedible.add(new CuentaBancaria("julio", 150.50));
        cuentaMedible.add(new CuentaBancaria("rocio", 210.30));

        System.out.println("CUENTAS");
        System.out.println("Saldo promedio de las cuentas: " + promedio(cuentaMedible));
        System.out.println("El saldo maximo es: " + maximo(cuentaMedible));

        ArrayList<Medible> paisMedible = new ArrayList<>();

        paisMedible.add(new Pais("Peru", 5000.50));
        paisMedible.add(new Pais("Chile", 3500.80));
        paisMedible.add(new Pais("Bolivia", 4000.10));

        System.out.println("PAISES");
        System.out.println("Superficie promedio de los paises: " + promedio(paisMedible));
        System.out.println("La superficie maxima es: " + maximo(paisMedible));

        ArrayList<Medible> obreroMedible = new ArrayList<>();

        obreroMedible.add(new Obrero("Freddy", 90.10));
        obreroMedible.add(new Obrero("Victor", 70.00));
        obreroMedible.add(new Obrero("Cesar", 85.68));

        System.out.println("OBREROS");
        System.out.println("Peso promedio de los obreros: " + promedio(obreroMedible));
        System.out.println("El peso maxima es: " + maximo(obreroMedible));
    }

    public static double promedio(ArrayList<Medible> o) {
        double suma = 0;
        for (Medible item : o) {
            suma = suma + item.obtenerMedida();
        }

        return suma / o.size();
    }

    public static double maximo(ArrayList<Medible> o) {
        double max = 0;

        for (Medible item : o) {
            if (item.obtenerMedida() > max) {
                max = item.obtenerMedida();
            }
        }
        return max;
    }
}
