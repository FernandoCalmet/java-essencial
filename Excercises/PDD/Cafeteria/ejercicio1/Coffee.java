package Cafeteria.ejercicio1;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public abstract class Coffee {
    protected String description;

    public String getDescription() {
        return this.description;
    }

    public abstract float getCost();
}