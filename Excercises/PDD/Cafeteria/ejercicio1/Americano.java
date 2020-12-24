package Excercises.PDD.Cafeteria.ejercicio1;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Americano extends Coffee {
    public Americano() {
        description = "Americano";
    }

    @Override
    public float getCost() {
        return 1.5f;
    }
}