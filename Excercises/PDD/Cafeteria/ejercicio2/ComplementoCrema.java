package Excercises.PDD.Cafeteria.ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class ComplementoCrema extends CafeDecorator {
    private Cafe wrappedCoffee;

    public ComplementoCrema(Cafe wrappedCoffee) {
        this.wrappedCoffee = wrappedCoffee;
        this.descripcion = this.wrappedCoffee.getDescripcion() + " + Crema";
    }

    @Override
    public String getDescripcion() {
        return this.descripcion;
    }

    @Override
    public double getCosto() {
        return 0.10 + this.wrappedCoffee.getCosto();
    }
}