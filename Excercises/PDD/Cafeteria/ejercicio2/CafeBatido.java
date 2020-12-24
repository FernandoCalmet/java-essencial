package Excercises.PDD.Cafeteria.ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class CafeBatido extends Cafe {
    public CafeBatido() {
        this.descripcion = "Cafe Batido";
    }

    @Override
    public double getCosto() {
        return 0.89;
    }
}