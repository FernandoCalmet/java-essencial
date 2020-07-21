package Pizzeria.Ejercicio1;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PizzaAmericana extends Pizza {
    public PizzaAmericana(String pizzaSize) {
        this.size = pizzaSize;
        this.descripcion = "Pizza Americana";
    }

    @Override
    public double getCosto() {
        return 3.10 + this.getSize();
    }
}