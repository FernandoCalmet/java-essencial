package Pizzeria.Ejercicio1;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PizzaVegetariana extends Pizza {
    public PizzaVegetariana(String pizzaSize) {
        this.size = pizzaSize;
        this.descripcion = "Pizza Vegetariana";
    }

    @Override
    public double getCosto() {
        return 8.05 + this.getSize();
    }
}