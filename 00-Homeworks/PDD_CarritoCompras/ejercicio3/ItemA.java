package ejercicio3;

public class ItemA extends ItemObserver {
    public ItemA(float price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public ItemA(ItemSubject item) {
        this.itemSubject = item;
        this.itemSubject.attachItem(this);
    }

    @Override
    public float getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int getQuantity() {
        return this.quantity;
    }

    @Override
    public void update() {
        System.out.println("ItemA: " + this.itemSubject.getState());
    }
}