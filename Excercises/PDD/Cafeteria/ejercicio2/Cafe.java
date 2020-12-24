package Excercises.PDD.Cafeteria.ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public abstract class Cafe {
    protected String descripcion = "Bebida aromática.";

    public String getDescripcion() {
        return this.descripcion;
    }

    public abstract double getCosto();
}