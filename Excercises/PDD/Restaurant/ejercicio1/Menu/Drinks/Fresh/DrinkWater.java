package Restaurant.ejercicio1.Menu.Drinks.Fresh;

import Restaurant.ejercicio1.Menu.Drinks.Drink;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class DrinkWater extends Drink {
    public DrinkWater(String size) {
        this.description = "Water";
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
        return 3.00 + this.getSizeCost();
    }
}