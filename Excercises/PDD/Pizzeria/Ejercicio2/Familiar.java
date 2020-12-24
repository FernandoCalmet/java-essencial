package Excercises.PDD.Pizzeria.Ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Familiar extends PizzaSizeDecorator {

    public Familiar(IPizza wrappedPizza) {
        super(wrappedPizza);
        super.description = this.wrappedPizza.getDescription() + " Tamaño Familiar";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCost() {
        return 32.50 + super.wrappedPizza.getCost();
    }
}