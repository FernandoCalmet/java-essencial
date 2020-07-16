package Cafeteria.ejercicio1;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Expresso extends Coffee {
    public Expresso() {
        description = "Expresso";
    }

    @Override
    public float getCost() {
        return 1.0f;
    }
}