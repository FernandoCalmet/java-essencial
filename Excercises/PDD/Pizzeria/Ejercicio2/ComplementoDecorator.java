package Pizzeria.Ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class ComplementoDecorator extends PizzaDecorator {
    public ComplementoDecorator(IPizza wrappedPizza) {
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