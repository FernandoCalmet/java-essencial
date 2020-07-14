package CarritoCompras.ejercicio3;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public class ItemB implements IItemElement {
    private int pricePerKg;
    private int weight;
    private String name;

    public ItemB(int pricePerKg, int weight, String name) {
        this.pricePerKg = pricePerKg;
        this.weight = weight;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getPricePerKg() {
        return this.pricePerKg;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public int accept(ShoppingCartVisitor cart) {
        return cart.visit(this);
    }
}