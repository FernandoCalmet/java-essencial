package Restaurant.ejercicio1.Menu.Drinks.Hot;

import Restaurant.ejercicio1.Menu.Drinks.Drink;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class DrinkCoffee extends Drink {
    public DrinkCoffee(String size) {
        this.description = "Coffee";
        super.setSize(size);
    }

    @Override
    public String getSize() {
        return super.getSize();
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCost() {
        return 5.00 + this.getSizeCost();
    }
}