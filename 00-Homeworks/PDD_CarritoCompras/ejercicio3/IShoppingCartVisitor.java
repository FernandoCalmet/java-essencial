package ejercicio3;

public interface IShoppingCartVisitor {
    int visit(ItemA itemA);

    int visit(ItemB itemB);
}