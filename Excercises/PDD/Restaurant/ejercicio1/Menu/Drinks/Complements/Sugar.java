package Restaurant.ejercicio1.Menu.Drinks.Complements;

import Restaurant.ejercicio1.Menu.Drinks.ComplementDecorator;
import Restaurant.ejercicio1.Menu.Drinks.IDrink;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Sugar extends ComplementDecorator {
    public Sugar(IDrink wrappedDrink) {
        super(wrappedDrink);
        super.description = this.wrappedDrink.getDescription() + " + Sugar";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCost() {
        return 0.80 + this.wrappedDrink.getCost();
    }
}