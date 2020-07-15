package Cafeteria.ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public abstract class Cafe {
    protected String descripcion;

    public String getDescripcion() {
        return this.descripcion;
    }

    public abstract double getCosto();
}