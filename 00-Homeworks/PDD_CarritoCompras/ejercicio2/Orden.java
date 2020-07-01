package ejercicio2;

public class Orden {
    private CarritoDeCompras cart;
    private float igv;

    public Orden(CarritoDeCompras cart, float salesTax) {
        this.cart = cart;
        this.igv = salesTax;
    }

    public float totalOrder() {
        float cartTotal = 0;
        for (Item item : this.cart.items) {
            cartTotal += item.getPrice() * item.getQuantity();
        }
        cartTotal += cartTotal * igv;
        return cartTotal;
    }
}