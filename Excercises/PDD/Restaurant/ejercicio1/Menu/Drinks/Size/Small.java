package Restaurant.ejercicio1.Menu.Drinks.Size;

import Restaurant.ejercicio1.Menu.Drinks.IDrink;
import Restaurant.ejercicio1.Menu.Drinks.SizeDecorator;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Small extends SizeDecorator {
    public Small(IDrink wrappedDrink) {
        super(wrappedDrink);
        super.description = this.wrappedDrink.getDescription() + " Size Small ";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCost() {
        return 5 + super.wrappedDrink.getCost();
    }
}