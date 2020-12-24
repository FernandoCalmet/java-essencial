package Excercises.PDD.Cafeteria.ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class ComplementoSoya extends CafeDecorator {
    private Cafe wrappedCoffee;

    public ComplementoSoya(Cafe wrappedCoffee) {
        this.wrappedCoffee = wrappedCoffee;
        this.descripcion = this.wrappedCoffee.getDescripcion() + " + Soya";
    }

    @Override
    public String getDescripcion() {
        return this.descripcion;
    }

    @Override
    public double getCosto() {
        return 0.15 + this.wrappedCoffee.getCosto();
    }
}