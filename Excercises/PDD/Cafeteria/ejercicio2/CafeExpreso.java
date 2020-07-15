package Cafeteria.ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public class CafeExpreso extends Cafe {
    public CafeExpreso() {
        this.descripcion = "Cafe Expreso";
    }

    @Override
    public double getCosto() {
        return 1.99;
    }
}