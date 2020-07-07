/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public abstract class Item {
    protected float price;
    protected int quantity;

    public abstract float getPrice();

    public abstract void setPrice(float price);

    public abstract int getQuantity();

    public abstract void setQuantity(int quantity);

    public abstract String toString();
}