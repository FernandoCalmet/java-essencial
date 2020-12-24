package Excercises.PDD.Pizzeria.Ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Aceituna extends ComplementoDecorator {
    public Aceituna(IPizza wrappedPizza) {
        super(wrappedPizza);
        super.description = this.wrappedPizza.getDescription() + " + Aceituna";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCost() {
        return 0.35 + this.wrappedPizza.getCost();
    }
}