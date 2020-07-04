package ejercicio1;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public class Orden {
    private CarritoDeCompras carrito;
    private float igv;

    public Orden(CarritoDeCompras cart, float salesTax) {
        this.carrito = cart;
        this.igv = salesTax;
    }

    public float OrdenTotal() {
        float cartTotal = 0;
        for (int i = 0; i < this.carrito.items.length; i++) {
            cartTotal += carrito.items[i].getPrecio() * carrito.items[i].getCantidad();
        }
        cartTotal += cartTotal * igv;
        return cartTotal;
    }
}