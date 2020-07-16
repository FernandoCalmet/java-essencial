package CarritoCompras.ejercicio3;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public interface IItemElement {
    public int accept(ShoppingCartVisitor cart);
}