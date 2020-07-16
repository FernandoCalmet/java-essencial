package CarritoCompras.ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class ItemB implements IProducto {
    private float precio;
    private int cantidad;
    private double peso;

    public ItemB(float precio, int cantidad, double peso) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.peso = peso;
    }

    public float getPrecio() {
        return this.precio;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public double getPeso() {
        return this.peso;
    }

    @Override
    public String toString() {
        return "ITEM B: Cantidad = " + getCantidad() + ", Precio = " + getPrecio() + " Peso = " + getPeso();
    }
}