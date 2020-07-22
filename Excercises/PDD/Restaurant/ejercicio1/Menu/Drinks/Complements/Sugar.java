package Restaurant.ejercicio1.Menu.Drinks.Complements;

import Restaurant.ejercicio1.Menu.Drinks.Drink;
import Restaurant.ejercicio1.Menu.Drinks.DrinkDecorator;

public class Sugar extends DrinkDecorator {
    private Drink wrappedDrink;

    public Sugar(Drink wrappedDrink) {
        this.wrappedDrink = wrappedDrink;
        this.description = this.wrappedDrink.getDescription() + " + Sugar";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCost() {
        return 0.10 + this.wrappedDrink.getCost();
    }
}