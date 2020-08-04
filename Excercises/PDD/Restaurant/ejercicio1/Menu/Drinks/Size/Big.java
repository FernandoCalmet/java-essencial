package Restaurant.ejercicio1.Menu.Drinks.Size;

import Restaurant.ejercicio1.Menu.Drinks.IDrink;
import Restaurant.ejercicio1.Menu.Drinks.SizeDecorator;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Big extends SizeDecorator {
    public Big(IDrink wrappedDrink) {
        super(wrappedDrink);
        super.description = this.wrappedDrink.getDescription() + " Size Big ";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCost() {
        return 8.90 + super.wrappedDrink.getCost();
    }
}