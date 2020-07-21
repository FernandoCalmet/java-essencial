package Restaurant.ejercicio1.Menu.Drinks.Complements;

import Restaurant.ejercicio1.Menu.Drinks.Drink;
import Restaurant.ejercicio1.Menu.Drinks.DrinkDecorator;

public class IceCubes extends DrinkDecorator {
    private Drink wrappedDrink;

    public IceCubes(Drink wrappedDrink) {
        this.wrappedDrink = wrappedDrink;
        this.description = this.wrappedDrink.getDescription() + " + Ice Cube";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCost() {
        return 0.20 + this.wrappedDrink.getCost();
    }
}