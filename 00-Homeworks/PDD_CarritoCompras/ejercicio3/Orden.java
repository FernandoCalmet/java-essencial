package ejercicio3;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public class Orden {
    private CarritoDeCompras cart;
    private float igv;

    public Orden(CarritoDeCompras cart, float salesTax) {
        this.cart = cart;
        this.igv = salesTax;
    }

    public float totalOrder() {
        float cartTotal = 0;
        for (ItemObserver item : this.cart.items) {
            cartTotal += item.getPrice() * item.getQuantity();
        }
        cartTotal += cartTotal * igv;
        return cartTotal;
    }
}