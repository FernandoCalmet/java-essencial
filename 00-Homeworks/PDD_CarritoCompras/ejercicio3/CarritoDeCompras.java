package ejercicio3;

import java.util.ArrayList;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public class CarritoDeCompras {
    protected ArrayList<ItemObserver> items = new ArrayList<ItemObserver>();

    public CarritoDeCompras(ArrayList<ItemObserver> items) {
        this.items = items;
    }

    public void attachItem(ItemObserver item) {
        this.items.add(item);
    }

    public void removeItem(ItemObserver item) {
        this.items.remove(item);
    }

    public float calculateTotalItem() {
        float sum = 0;
        for (ItemObserver item : this.items) {
            sum += item.getPrice();
        }
        return sum;
    }
}