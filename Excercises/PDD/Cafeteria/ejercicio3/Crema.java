package Cafeteria.ejercicio3;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Crema extends ComplementoDecorator {
    public Crema(ICoffee wrappedCoffee) {
        super(wrappedCoffee);
        super.description = this.wrappedCoffee.getDescription() + " + Crema";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCost() {
        return 0.10 + this.wrappedCoffee.getCost();
    }
}