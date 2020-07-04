package ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
import java.util.ArrayList;

public class CarritoDeCompras {
    protected ArrayList<Item> items = new ArrayList<Item>();

    public CarritoDeCompras(ArrayList<Item> items) {
        this.items = items;
    }

    public void attachItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public int calculateTotalItem() {
        int sum = 0;
        for (Item item : this.items) {
            sum += item.getPrice();
        }
        return sum;
    }
}