package CarritoCompras.ejercicio3;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class ShoppingClient {
    public static void main(String[] args) {
        IItemElement[] items = new IItemElement[] { new ItemA(20, "1234"), new ItemA(100, "5678"),
                new ItemB(10, 2, "Banana"), new ItemB(5, 5, "Apple") };

        int total = calculatePrice(items);
        System.out.println("Total Cost = " + total);
    }

    private static int calculatePrice(IItemElement[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitor();
        int sum = 0;
        for (IItemElement item : items) {
            sum = sum + item.accept(visitor);
        }
        return sum;
    }
}