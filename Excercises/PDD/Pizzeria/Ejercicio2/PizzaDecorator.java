package Pizzeria.Ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public abstract class PizzaDecorator implements IPizza {
    protected IPizza wrappedPizza;
    protected String description;

    public PizzaDecorator(IPizza wrappedPizza) {
        this.wrappedPizza = wrappedPizza;
    }

    public String getDescription() {
        return this.description;
    }

    public double getCost() {
        return this.wrappedPizza.getCost();
    }
}