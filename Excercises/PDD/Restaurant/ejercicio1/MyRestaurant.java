package Restaurant.ejercicio1;

import Restaurant.ejercicio1.Menu.Drinks.Drink;
import Restaurant.ejercicio1.Menu.Drinks.Complements.IceCubes;
import Restaurant.ejercicio1.Menu.Drinks.Types.*;

public class MyRestaurant {
    public static void main(String[] args) {
        //TODO: add more menu items and order process

        // Order a Drink
        Drink drink1 = new Lemonade("single");
        // Add complements to the order
        Drink drink1Icecube = new IceCubes(drink1);

        System.out.println(drink1.getSize() + drink1Icecube.getDescription() + ", Cost: " + drink1Icecube.getCost());
    }
}