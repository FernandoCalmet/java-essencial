package Restaurant.ejercicio1.Menu.Drinks.Type.Hot;

import Restaurant.ejercicio1.Menu.Drinks.*;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Tea implements IDrink {

    private String description;

    public Tea() {
        this.description = "Tea";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCost() {
        return 5.00;
    }
}