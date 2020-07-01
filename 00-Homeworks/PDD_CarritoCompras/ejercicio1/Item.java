package ejercicio1;

public class Item {
    public float precio;
    public int cantidad;

    public Item(float p, int c) {
        this.precio = p;
        this.cantidad = c;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return this.cantidad;
    }
}