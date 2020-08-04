package Restaurant.ejercicio1.Menu.Drinks;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public abstract class SizeDecorator extends DrinkDecorator {
    public SizeDecorator(IDrink wrappedDrink) {
        super(wrappedDrink);
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCost() {
        return this.wrappedDrink.getCost();
    }
}