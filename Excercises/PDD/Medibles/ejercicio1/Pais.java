package Excercises.PDD.Medibles.ejercicio1;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Pais implements Medible {

    private String nombre;
    private double superficie;

    public Pais(String n, double s) {
        this.nombre = n;
        this.superficie = s;
    }

    @Override
    public double obtenerMedida() {
        return this.superficie;
    }
}