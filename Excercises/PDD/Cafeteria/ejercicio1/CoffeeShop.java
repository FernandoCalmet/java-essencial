package Cafeteria.ejercicio1;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class CoffeeShop {
    public static void main(String[] args) {
        Coffee americano = new Americano();
        Coffee expreso = new Expresso();

        // cafe sin decorado
        System.out.println("Coffee: " + americano.getDescription() + " Cost: " + americano.getCost());
        System.out.println("Coffee: " + expreso.getDescription() + " Cost: " + expreso.getCost());

        // decorar el cafe americano
        Coffee americanoWithMocha = new Mocha(americano);
        Coffee americanoWith2Mocha = new Mocha(americanoWithMocha);
        Coffee americanoWith2MochaMilk = new Milk(americanoWith2Mocha);
        Coffee americanoWith2MochaMilkChocolate = new Chocolate(americanoWith2MochaMilk);
        System.out.println("Coffee: " + americanoWith2MochaMilkChocolate.getDescription() + " Cost: "
                + americanoWith2MochaMilkChocolate.getCost());

        // decorrar el cafe expreso
        Coffee expresoWithChocolate = new Chocolate(expreso);
        System.out.println("Coffee: " + expresoWithChocolate.getDescription() + " Cost: " + expresoWithChocolate.getCost());
    }
}