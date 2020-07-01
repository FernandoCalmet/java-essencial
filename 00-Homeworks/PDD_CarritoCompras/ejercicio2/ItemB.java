package ejercicio2;

public class ItemB extends Item {
    public ItemB(float price, int quantity) {
        this.price = price;
        this.quantity = quantity;
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
    public String toString(){
        return "ITEM B => \nCantidad: "+getQuantity()+"\nPrecio: "+getPrice();
    }
}