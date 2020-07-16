package Cafeteria.ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class CafeDescafeinado extends Cafe {
    public CafeDescafeinado() {
        this.descripcion = "Cafe Descafeinado";
    }

    @Override
    public double getCosto() {
        return 1.05;
    }
}