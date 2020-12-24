package Excercises.PDD.Cafeteria.ejercicio3;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class TostadoNegro implements ICoffee {
    private String description;

    public TostadoNegro() {
        this.description = "Cafe TostadoNegro";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCost() {
        return 0.99;
    }
}