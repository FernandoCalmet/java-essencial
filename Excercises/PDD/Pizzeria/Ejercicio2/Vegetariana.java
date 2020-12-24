package Excercises.PDD.Pizzeria.Ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Vegetariana implements IPizza {
    private String description;

    public Vegetariana() {
        this.description = "Pizza Vegetariana";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCost() {
        return 8.05;
    }
}