package CarritoCompras.ejercicio3;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public class ShoppingCartVisitor implements IShoppingCartVisitor {

    @Override
    public int visit(ItemA itemA) {
        int cost = 0;
        // Apply 2$ discount if ItemA is greater than 20
        if (itemA.getPrice() > 20) {
            cost = itemA.getPrice() - 5;
        } else {
            cost = itemA.getPrice();
        }
        System.out.println("ISBN: " + itemA.getIsbnNumber() + ", Cost = " + cost);
        return cost;
    }

    @Override
    public int visit(ItemB itemB) {
        int cost = itemB.getPricePerKg() * itemB.getWeight();
        System.out.println(itemB.getName() + " : Cost = " + cost);
        return cost;
    }
}