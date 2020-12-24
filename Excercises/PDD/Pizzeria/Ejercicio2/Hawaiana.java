package Excercises.PDD.Pizzeria.Ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Hawaiana implements IPizza {
    private String description;

    public Hawaiana() {
        this.description = "Pizza Hawaiana";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCost() {
        return 5.25;
    }
}