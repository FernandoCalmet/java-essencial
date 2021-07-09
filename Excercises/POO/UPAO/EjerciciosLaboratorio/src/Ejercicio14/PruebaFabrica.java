package Excercises.POO.UPAO.EjerciciosLaboratorio.src.Ejercicio14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PruebaFabrica {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /* A) CREAR OBJETOS DE PRODUCTOS */
        Producto producto1 = new Producto("A", 1, 23);
        Producto producto2 = new Producto("B", 1.10, 60);
        Producto producto3 = new Producto("C", 2.35, 150);
        Producto producto4 = new Producto("D", 1, 100);
        Producto producto5 = new Producto("E", 4.10, 500);
        Producto producto6 = new Producto("F", 3.15, 80);
        /* ASIGNAR OBJETOS PRODUCTOS A LISTAS DE PRODUCTOS */
        ArrayList<Producto> listaProductos1 = new ArrayList<Producto>();
        ArrayList<Producto> listaProductos2 = new ArrayList<Producto>();
        listaProductos1.add(producto1);
        listaProductos1.add(producto2);
        listaProductos1.add(producto3);
        listaProductos2.add(producto4);
        listaProductos2.add(producto5);
        listaProductos2.add(producto6);
        /* CREAR MAQUINAS EXPENDEDORAS Y ASGINAR LISTAS DE PRODUCTOS */
        MaquinaExpendedora maquina1 = new MaquinaExpendedora(101, "Maquina 1", listaProductos1);
        MaquinaExpendedora maquina2 = new MaquinaExpendedora(102, "Maquina 2", listaProductos2);

        /* B) CONSULTAR PRECIO Y STOCK DE UN PRODUCTO */
        System.out.println("Producto 1: Precio:" + producto1.getPrecio() + ", Stock: " + producto1.getStock());
        /* MOSTRAR LOS PRODUCTOS DE LAS MAQUINAS CREADAS */
        System.out.println("\n* PRODUCTOS DE MAQUINAS: *");
        System.out.println("\n" + maquina1.toString());
        System.out.println("\n" + maquina2.toString());

        /* C) COMPRAR UN PRODUCTO */
        System.out.println("\n* COMPRA DE PRODUCTO: *");
        System.out.println("Ingresar la cantidad de productos a comprar: ");
        int cantidad = Integer.parseInt(br.readLine());
        System.out.println("Ingresar el monto a pagar: ");
        int precio = Integer.parseInt(br.readLine());
        System.out.println("Seleccionar la maquina en que desea comprar: 1 o 2 ");
        int maquina = Integer.parseInt(br.readLine());
        /* D) MOSTRAR LOS DATOS DE LAS MAQUINAS CON SUS PRODUCTOS */
        switch (maquina) {
            case 1:
                System.out.println("Seleccionar el producto a comprar: A, B, C");
                String productoA = br.readLine();
                switch (productoA.toUpperCase()) {
                    case "A":
                        maquina1.comprarProducto(producto1, cantidad, precio);
                        break;
                    case "B":
                        maquina1.comprarProducto(producto2, cantidad, precio);
                        break;
                    case "C":
                        maquina1.comprarProducto(producto3, cantidad, precio);
                        break;
                    default:
                        System.out.println("Solo se permite comprar productos: A, B, C");
                        break;
                }
                break;
            case 2:
                System.out.println("Seleccionar el producto a comprar: D, E, F");
                String productoB = br.readLine();
                switch (productoB.toUpperCase()) {
                    case "D":
                        maquina2.comprarProducto(producto1, cantidad, precio);
                        break;
                    case "E":
                        maquina2.comprarProducto(producto2, cantidad, precio);
                        break;
                    case "F":
                        maquina2.comprarProducto(producto3, cantidad, precio);
                        break;
                    default:
                        System.out.println("Solo se permite comprar productos: C, D, F");
                        break;
                }
                break;
            default:
                System.out.println("Solo se permite comprar en la maquina: 1 o 2");
        }
    }
}