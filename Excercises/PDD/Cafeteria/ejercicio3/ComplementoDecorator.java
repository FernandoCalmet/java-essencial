package Cafeteria.ejercicio3;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class ComplementoDecorator extends CoffeeDecorator {
    public ComplementoDecorator(ICoffee wrappedCoffee) {
        super(wrappedCoffee);
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCost() {
        return this.wrappedCoffee.getCost();
    }
}