package Excercises.PDD.Pizzeria.Ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Personal extends PizzaSizeDecorator {
    public Personal(IPizza wrappedPizza) {
        super(wrappedPizza);
        super.description = this.wrappedPizza.getDescription() + " Tamaño Personal";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCost() {
        return 8.0 + super.wrappedPizza.getCost();
    }
}