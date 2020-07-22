package Pizzeria.Ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Grande extends PizzaSizeDecorator {
    public Grande(IPizza wrappedPizza) {
        super(wrappedPizza);
        super.description = this.wrappedPizza.getDescription() + " Tamaño Grande";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCost() {
        return 20.50 + super.wrappedPizza.getCost();
    }
}