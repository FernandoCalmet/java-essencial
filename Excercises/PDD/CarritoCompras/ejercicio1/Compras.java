package CarritoCompras.ejercicio1;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Compras {
    public static void main(String[] args) {
        /* Crear items con sus valores */
        Item item1 = new Item(10, 5);
        Item item2 = new Item(20, 2);
        Item item3 = new Item(7, 13);
        Item item4 = new Item(12, 10);
        Item item5 = new Item(35, 2);

        /* Agregar items creados a un arreglo */
        Item[] items = { item1, item2, item3, item4, item5 };

        /* Crear el carrito de compras y agregar el arreglo de items */
        CarritoDeCompras carrito = new CarritoDeCompras(items);

        /* Crear la orden y agregar el carrito creado y el impuesto de compra */
        Orden orden = new Orden(carrito, 18);

        /* Mostrar el resultado total de la orden */
        System.out.println("El costo total de la orden es: " + orden.OrdenTotal());
    }
}