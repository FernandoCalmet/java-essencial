package ejercicio3;

public abstract class ItemObserver {
    protected float price;
    protected int quantity;

    protected ItemSubject itemSubject;

    public abstract void update();

    public abstract float getPrice();

    public abstract void setPrice(float price);

    public abstract int getQuantity();

    public abstract void setQuantity(int quantity);
}