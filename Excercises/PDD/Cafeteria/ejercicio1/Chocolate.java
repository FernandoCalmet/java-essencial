package Excercises.PDD.Cafeteria.ejercicio1;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Chocolate extends CoffeeDecorator {
    private Coffee wrappedCoffee;

    public Chocolate(Coffee wrappedCoffee) {
        this.wrappedCoffee = wrappedCoffee;
        this.description = this.wrappedCoffee.getDescription() + " + Chocolate";
    }

    @Override
    public float getCost() {
        return .20f + this.wrappedCoffee.getCost();
    }
}