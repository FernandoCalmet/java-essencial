package Excercises.PDD.Medibles.ejercicio3;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PruebaMedible {
    public static void main(String[] args) {
        MiMedible medibleCuentas = new MiMedible();
        medibleCuentas.agregarMedibles(new CuentaBancaria("Walter", 100.00));
        medibleCuentas.agregarMedibles(new CuentaBancaria("Julio", 150.50));
        medibleCuentas.agregarMedibles(new CuentaBancaria("Fernando", 210.30));
        System.out.println("CUENTAS");
        System.out.println("El promedio de los saldos: " + medibleCuentas.toString() + "es: " + medibleCuentas.calcularPromedio());
        System.out.println("El maximo valor entre los saldos: " + medibleCuentas.toString() + "es: " + medibleCuentas.calcularMaximo());

        System.out.println("");
        MiMedible mediblePaises = new MiMedible();
        mediblePaises.agregarMedibles(new Pais("Peru", 5000.50));
        mediblePaises.agregarMedibles(new Pais("Chile", 3500.80));
        mediblePaises.agregarMedibles(new Pais("Bolivia", 4000.10));
        System.out.println("PAISES");
        System.out.println("El promedio de las superficies: " + mediblePaises.toString() + "es: " + mediblePaises.calcularPromedio());
        System.out.println("El maximo valor de las superficies: " + mediblePaises.toString() + "es: " + mediblePaises.calcularMaximo());

        System.out.println("");
        MiMedible medibleObreros = new MiMedible();
        medibleObreros.agregarMedibles(new Obrero("Edgar", 90.10));
        medibleObreros.agregarMedibles(new Obrero("Fiorela", 70.00));
        medibleObreros.agregarMedibles(new Obrero("Victor", 85.68));
        System.out.println("OBREROS");
        System.out.println("El promedio de peso: " + medibleObreros.toString() + "es: " + medibleObreros.calcularPromedio());
        System.out.println("El maximo valor de los pesos: " + medibleObreros.toString() + "es: " + medibleObreros.calcularMaximo());
    }
}
