package CarritoCompras.ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
import java.util.ArrayList;

public class CarritoDeCompras {
    protected ArrayList<IProducto> items = new ArrayList<IProducto>();

    public CarritoDeCompras(ArrayList<IProducto> items) {
        this.items = items;
    }

    public void attachItem(IProducto item) {
        this.items.add(item);
    }

    public void removeItem(IProducto item) {
        this.items.remove(item);
    }

    public int calcularTotalProductos() {
        int sum = 0;
        for (IProducto item : this.items) {
            sum += item.getPrecio();
        }
        return sum;
    }

    public void mostrarDetalles() {
        for (IProducto item : this.items) {
            System.out.println(item.toString());
        }
    }
}