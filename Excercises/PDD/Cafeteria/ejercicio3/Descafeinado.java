package Excercises.PDD.Cafeteria.ejercicio3;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Descafeinado implements ICoffee {
    private String description;

    public Descafeinado() {
        this.description = "Cafe Descafeinado";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCost() {
        return 1.05;
    }
}