package ejercicio1;

public class Compras {
    public static void main(String[] args) {
        Item item1 = new Item(10, 5);
        Item item2 = new Item(20, 2);
        Item item3 = new Item(7, 13);
        Item item4 = new Item(12, 10);

        Item[] items = { item1, item2, item3, item4 };
        CarritoDeCompras carrito = new CarritoDeCompras(items);
        Orden orden = new Orden(carrito, 20.0f);
        System.out.println("El costo total de la orden es: " + orden.OrdenTotal());
    }
}