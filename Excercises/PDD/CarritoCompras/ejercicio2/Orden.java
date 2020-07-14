package CarritoCompras.ejercicio2;

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

    public float calcularTotalOrden() {
        float cartTotal = 0;
        for (IProducto item : this.cart.items) {
            cartTotal += item.getPrecio() * item.getCantidad();
        }
        cartTotal += cartTotal * igv;
        return cartTotal;
    }
}