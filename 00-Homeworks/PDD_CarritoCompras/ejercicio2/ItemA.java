/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public class ItemA implements IProducto {
    private float precio;
    private int cantidad;

    public ItemA(float precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return this.precio;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    @Override
    public String toString() {
        return "ITEM A: Cantidad = " + getCantidad() + ", Precio = " + getPrecio();
    }
}