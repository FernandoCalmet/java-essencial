package Excercises.PDD.Pizzeria.Ejercicio1;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class ComplementoPimiento extends PizzaDecorator {
    private Pizza wrappedPizza;

    public ComplementoPimiento(Pizza wrappedPizza) {
        this.wrappedPizza = wrappedPizza;
        this.descripcion = this.wrappedPizza.getDescripcion() + " + Pimiento";
    }

    @Override
    public String getDescripcion() {
        return this.descripcion;
    }

    @Override
    public double getCosto() {
        return 0.20 + this.wrappedPizza.getCosto();
    }
}