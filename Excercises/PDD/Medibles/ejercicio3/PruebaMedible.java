package Excercises.PDD.Medibles.ejercicio3;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PruebaMedible {
    public static void main(String[] args) {
        MiMedible medibleCuentas = new MiMedible();
        medibleCuentas.agregarMedibles(new CuentaBancaria("Walter Ramirez", 1000.00));
        medibleCuentas.agregarMedibles(new CuentaBancaria("Julio Perez", 1500.50));
        medibleCuentas.agregarMedibles(new CuentaBancaria("Fernando Calmet", 2100.30));
        System.out.println("\nCUENTAS BANCARIAS:");
        System.out.println(medibleCuentas.toString());
        System.out.println("El promedio de los saldos es: " + medibleCuentas.calcularPromedio());
        System.out.println("El maximo valor entre los saldos es: " + medibleCuentas.calcularMaximo());

        MiMedible mediblePaises = new MiMedible();
        mediblePaises.agregarMedibles(new Pais("Peru", 5000.50));
        mediblePaises.agregarMedibles(new Pais("Chile", 3500.80));
        mediblePaises.agregarMedibles(new Pais("Bolivia", 4000.10));
        System.out.println("\nPAISES:");
        System.out.println(mediblePaises.toString());
        System.out.println("El promedio de las superficies es: " + mediblePaises.calcularPromedio());
        System.out.println("El maximo valor de las superficies es: " + mediblePaises.calcularMaximo());

        MiMedible medibleObreros = new MiMedible();
        medibleObreros.agregarMedibles(new Obrero("Edgar", 90.10));
        medibleObreros.agregarMedibles(new Obrero("Fiorela", 70.00));
        medibleObreros.agregarMedibles(new Obrero("Victor", 85.68));
        System.out.println("\nOBREROS:");
        System.out.println(medibleObreros.toString());
        System.out.println("El promedio de peso es: " + medibleObreros.calcularPromedio());
        System.out.println("El maximo valor de los pesos es: " + medibleObreros.calcularMaximo());
    }
}
