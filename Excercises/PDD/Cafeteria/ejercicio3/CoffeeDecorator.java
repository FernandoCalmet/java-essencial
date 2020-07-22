package Cafeteria.ejercicio3;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public abstract class CoffeeDecorator implements ICoffee {
    protected ICoffee wrappedCoffee;
    protected String description;

    public CoffeeDecorator(ICoffee wrappedCoffee) {
        this.wrappedCoffee = wrappedCoffee;
    }

    public String getDescription() {
        return this.description;
    }

    public double getCost() {
        return this.wrappedCoffee.getCost();
    }
}