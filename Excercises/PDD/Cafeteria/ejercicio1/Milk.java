package Excercises.PDD.Cafeteria.ejercicio1;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Milk extends CoffeeDecorator {
    private Coffee wrappedCoffee;

    public Milk(Coffee wrappedCoffee) {
        this.wrappedCoffee = wrappedCoffee;
        this.description = this.wrappedCoffee.getDescription() + " + Milk";
    }

    @Override
    public float getCost() {
        return .10f + this.wrappedCoffee.getCost();
    }
}