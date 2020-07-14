package Cafeteria.ejercicio1;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public class Mocha extends CoffeeDecorator {
    private Coffee wrappedCoffee;

    public Mocha(Coffee wrappedCoffee) {
        this.wrappedCoffee = wrappedCoffee;
        this.description = this.wrappedCoffee.getDescription() + " + Mocha";
    }

    @Override
    public float getCost() {
        return .15f + this.wrappedCoffee.getCost();
    }
}