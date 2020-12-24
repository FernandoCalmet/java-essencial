package Excercises.PDD.Cafeteria.ejercicio3;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Moca extends ComplementoDecorator {
    public Moca(ICoffee wrappedCoffee) {
        super(wrappedCoffee);
        super.description = this.wrappedCoffee.getDescription() + " + Moca";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCost() {
        return 0.20 + this.wrappedCoffee.getCost();
    }
}