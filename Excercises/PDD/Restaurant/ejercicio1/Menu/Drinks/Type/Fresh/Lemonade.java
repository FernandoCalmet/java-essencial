package Restaurant.ejercicio1.Menu.Drinks.Type.Fresh;

import Restaurant.ejercicio1.Menu.Drinks.*;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Lemonade implements IDrink {
    private String description;

    public Lemonade() {
        this.description = "Lemonade";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCost() {
        return 3.00;
    }
}