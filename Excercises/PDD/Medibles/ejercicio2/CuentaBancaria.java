package Excercises.PDD.Medibles.ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class CuentaBancaria implements Medible {

    private String nombre;
    private double saldo;

    public CuentaBancaria(String n, double s) {
        this.nombre = n;
        this.saldo = s;
    }

    @Override
    public double obtenerMedida() {
        return this.saldo;
    }
}
