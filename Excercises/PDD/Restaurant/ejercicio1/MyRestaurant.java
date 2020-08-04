package Restaurant.ejercicio1;

import Restaurant.ejercicio1.Menu.Drinks.IDrink;
import Restaurant.ejercicio1.Menu.Drinks.Complements.IceCubes;
import Restaurant.ejercicio1.Menu.Drinks.Size.Small;
import Restaurant.ejercicio1.Menu.Drinks.Type.Fresh.Lemonade;

public class MyRestaurant {
    public static void main(String[] args) {
        // Order a Drink
        IDrink lemonade = new Lemonade();
        // Choose size to the order
        IDrink lemonadeSmall = new Small(lemonade);
        // Add complements to the order
        IDrink lemonadeSmallIceCube = new IceCubes(lemonadeSmall);

        System.out.println(lemonadeSmallIceCube.getDescription() + ", Cost: " + lemonadeSmallIceCube.getCost());
    }
}