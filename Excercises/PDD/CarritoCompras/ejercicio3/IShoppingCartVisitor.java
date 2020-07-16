package CarritoCompras.ejercicio3;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public interface IShoppingCartVisitor {
    int visit(ItemA itemA);

    int visit(ItemB itemB);
}