package Excercises.PDD.Medibles.ejercicio3;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Obrero implements Medible {

    private String nombre;
    private double peso;

    public Obrero(String n, double p) {
        this.nombre = n;
        this.peso = p;
    }

    @Override
    public double obtenerMedida() {
        return this.peso;
    }

    @Override
    public String obtenerReporte() {
        return "Nombre: " + this.nombre + "\nPeso: " + this.peso;
    }
}