package Restaurant.ejercicio1;

import Restaurant.ejercicio1.Menu.Drinks.Drink;
import Restaurant.ejercicio1.Menu.Drinks.Fresh.*;
import Restaurant.ejercicio1.Menu.Drinks.Complements.*;

public class MyRestaurant {
    public static void main(String[] args) {        
        // Order a Drink
        Drink lemonade = new DrinkLemonade("single");
        // Add complements to the order
        Drink lemonadeIceCube = new IceCubes(lemonade);

        System.out.println(lemonade.getSize() + lemonadeIceCube.getDescription() + ", Cost: " + lemonadeIceCube.getCost());
    }
}