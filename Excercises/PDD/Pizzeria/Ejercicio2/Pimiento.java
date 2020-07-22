package Pizzeria.Ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Pimiento extends ComplementoDecorator {
    public Pimiento(IPizza wrappedPizza) {
        super(wrappedPizza);
        this.description = this.wrappedPizza.getDescription() + " + Pimiento";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCost() {
        return 0.20 + this.wrappedPizza.getCost();
    }
}