package Excercises.PDD.Pizzeria.Ejercicio1;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PizzaHawaiana extends Pizza {
    public PizzaHawaiana(String pizzaSize) {
        this.size = pizzaSize;
        this.descripcion = "Pizza Hawaiana";
    }

    @Override
    public double getCosto() {
        return 5.25 + this.getSize();
    }
}