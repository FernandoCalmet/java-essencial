package CarritoCompras.ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public interface IProducto {
    public float getPrecio();

    public int getCantidad();

    @Override
    public String toString();
}