package CarritoCompras.ejercicio3;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class ItemA implements IItemElement {
    private String isbnNumber;
    private int price;

    public ItemA(int price, String isbnNumber) {
        this.price = price;
        this.isbnNumber = isbnNumber;
    }

    public String getIsbnNumber() {
        return this.isbnNumber;
    }

    public int getPrice() {
        return this.price;
    }

    @Override
    public int accept(ShoppingCartVisitor cart) {
        return cart.visit(this);
    }
}