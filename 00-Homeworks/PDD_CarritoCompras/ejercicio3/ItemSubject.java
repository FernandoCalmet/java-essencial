package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class ItemSubject {
    private List<ItemObserver> observers = new ArrayList<ItemObserver>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attachItem(ItemObserver observer) {
        this.observers.add(observer);
    }

    public void removeItem(ItemA observer) {
        this.observers.remove(observer);
    }

    public void notifyAllObservers() {
        for (ItemObserver observer : this.observers) {
            observer.update();
        }
    }
}