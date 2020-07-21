package Restaurant.ejercicio1.Menu.Drinks.Types;

import Restaurant.ejercicio1.Menu.Drinks.Drink;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Lemonade extends Drink {
    public Lemonade(String size) {        
        this.description = "Lemonade";
        super.setSize(size);
    }

    @Override
    public String getSize(){
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