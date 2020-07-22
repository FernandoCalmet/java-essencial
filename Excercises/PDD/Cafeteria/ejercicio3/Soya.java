package Cafeteria.ejercicio3;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Soya extends ComplementoDecorator {
    public Soya(ICoffee wrappedCoffee) {
        super(wrappedCoffee);
        super.description = this.wrappedCoffee.getDescription() + " + Soya";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCost() {
        return 0.15 + this.wrappedCoffee.getCost();
    }
}