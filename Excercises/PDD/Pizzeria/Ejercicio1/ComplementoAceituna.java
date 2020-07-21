package Pizzeria.Ejercicio1;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class ComplementoAceituna extends PizzaDecorator {
    private Pizza wrappedPizza;

    public ComplementoAceituna(Pizza wrappedPizza) {
        this.wrappedPizza = wrappedPizza;
        this.descripcion = this.wrappedPizza.getDescripcion() + " + Aceituna";
    }

    @Override
    public String getDescripcion() {
        return this.descripcion;
    }

    @Override
    public double getCosto() {
        return 0.35 + this.wrappedPizza.getCosto();
    }
}