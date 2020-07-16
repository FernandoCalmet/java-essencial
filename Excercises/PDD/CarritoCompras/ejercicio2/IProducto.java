package CarritoCompras.ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public interface IProducto {
    public float getPrecio();

    public int getCantidad();

    @Override
    public String toString();
}