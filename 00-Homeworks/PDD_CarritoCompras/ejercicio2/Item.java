package ejercicio2;

public abstract class Item {
    protected float price;
    protected int quantity;

    public abstract float getPrice();

    public abstract void setPrice(float price);

    public abstract int getQuantity();

    public abstract void setQuantity(int quantity);

    public abstract String toString();
}