package CarritoCompras.ejercicio3;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public interface IItemElement {
    public int accept(ShoppingCartVisitor cart);
}