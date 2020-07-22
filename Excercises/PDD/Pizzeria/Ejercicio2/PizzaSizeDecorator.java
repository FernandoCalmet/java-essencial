package Pizzeria.Ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PizzaSizeDecorator extends PizzaDecorator {
    public PizzaSizeDecorator(IPizza wrappedPizza) {
        super(wrappedPizza);
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCost() {
        return this.wrappedPizza.getCost();
    }
}