package ejercicio2;

import java.util.ArrayList;

public class Compras {
    public static void main(String[] args) {

        /* Crear productos */
        ItemA item1 = new ItemA(15, 3);
        ItemA item2 = new ItemA(10, 5);
        ItemB item3 = new ItemB(2, 4);
        ItemB item4 = new ItemB(6, 10);

        ArrayList<Item> orderList = new ArrayList<Item>();
        orderList.add(item1);
        orderList.add(item2);
        orderList.add(item3);
        orderList.add(item4);

        /* Crear un carrito de compras para agregar productos */
        CarritoDeCompras cart1 = new CarritoDeCompras(orderList);

        /* Agregar / Quitar productos del carrito */
        ItemA item5 = new ItemA(45, 2);
        ItemB item6 = new ItemB(68, 1);
        cart1.attachItem(item5);
        cart1.attachItem(item6);
        cart1.removeItem(item2);

        /* Crear una orden con el carrito de compras */
        Orden order1 = new Orden(cart1, 10.0F);

        /* Mostrar reporte de compra */
        System.out.println("Total de Items en carrito: " + cart1.calculateTotalItem());
        System.out.println("Total a pagar de la orden: " + order1.totalOrder());
    }
}