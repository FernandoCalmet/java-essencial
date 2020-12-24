package Excercises.PDD.Cafeteria.ejercicio3;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Expreso implements ICoffee {
    private String description;

    public Expreso() {
        this.description = "Cafe Expreso";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCost() {
        return 1.99;
    }
}