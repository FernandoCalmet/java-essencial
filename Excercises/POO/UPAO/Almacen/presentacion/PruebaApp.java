package Excercises.POO.UPAO.Almacen.presentacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Excercises.POO.UPAO.Almacen.accesoDatos.BaseDatos;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PruebaApp {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BaseDatos baseDatos = new BaseDatos();
    static int n;

    public static void main(String[] args) throws IOException {
        int opc;
        do {
            opc = menu();
            switch (opc) {
                case 1:
                    crearAlmacen();
                    break;
                case 2:
                    n = leerN();
                    crearProductos();
                    break;
                case 3:
                    buscarProductos();
                    break;
                case 4:
                    modificarPrecioProducto();
                    break;
                case 5:
                    eliminarProducto();
                    break;
                case 6:
                    mostrarStockMinimoProductos();
                    break;
                case 7:
                    mostrarProductosPorCategoria();
                    break;
                case 8:
                    finalizarPrograma();
                    break;
            }
        } while (opc != 8);
    }

    private static int menu() throws IOException {
        int opc;
        do {
            System.out.println("\n*****MENU OPCIONES*****");
            System.out.println("1. Crear un almacen");
            System.out.println("2. Crear N productos para el almacen y almacenarlos en una colección");
            System.out.println("3. Buscar a un producto por su nombre ó codigo y mostrar todos sus datos");
            System.out.println("4. Modificar el precio de un producto");
            System.out.println("5. Eliminar un producto de la colección");
            System.out.println("6. Mostrar los productos que tienen un stock mínimo de 0 a 10 unidades");
            System.out.println(
                    "7. Mostrar la información del Almacen con todos sus productos clasificados por categoria.");
            System.out.println("8. Salir");
            System.out.print("Ingrese la opcion");
            opc = Integer.parseInt(br.readLine());
        } while (opc < 1 || opc > 8);

        return opc;
    }

    private static int leerN() throws IOException {
        int N;
        do {
            System.out.println("Ingrese N productos a crear:");
            N = Integer.parseInt(br.readLine());
        } while (N <= 0 || N >= 50);

        return N;
    }

    private static void crearAlmacen() throws IOException {
        System.out.println("***CREAR ALMACEN***");
        System.out.println("Nombre del almacen: ");
        String nombre = br.readLine();
        System.out.println("Ubicación del almacen: ");
        String ubicacion = br.readLine();
        baseDatos.agregarAlmacen(nombre, ubicacion);
    }

    private static void crearProductos() throws IOException {
        System.out.println("***CREAR PRODUCTOS***");
        for (int i = 0; i < n; i++) {
            System.out.println("Codigo del producto: ");
            String codigo = br.readLine();
            System.out.println("Nombre del producto: ");
            String nombre = br.readLine();
            System.out.println("Categoria del producto: ");
            String categoria = br.readLine();
            System.out.println("Precio del producto: ");
            double precio = Double.parseDouble(br.readLine());
            System.out.println("Stock del producto: ");
            int stock = Integer.parseInt(br.readLine());
            baseDatos.agregarProducto(codigo, nombre, categoria, precio, stock);
        }
    }

    private static void buscarProductos() throws IOException {
        System.out.println("***BUSCAR PRODUCTOS***");
        System.out.println("Ingrese el nombre o codigo del producto a buscar: ");
        String valor = br.readLine();
        System.out.println("Resultado de busqueda: " + baseDatos.buscarProducto(valor));
    }

    private static void modificarPrecioProducto() throws IOException {
        System.out.println("***MODIFICAR PRECIO PRODUCTO***");
        System.out.println("Ingrese el codigo del producto a modificar: ");
        String codigo = br.readLine();
        System.out.println("Ingrese el nuevo precio del producto: ");
        double nuevoPrecio = Double.parseDouble(br.readLine());
        baseDatos.modificarPrecioProducto(codigo, nuevoPrecio);
    }

    private static void eliminarProducto() throws IOException {
        System.out.println("***ELIMINAR PRODUCTO***");
        System.out.println("Ingrese el codigo del producto a eliminar: ");
        String codigo = br.readLine();
        baseDatos.eliminarProducto(codigo);
    }

    private static void mostrarStockMinimoProductos() throws IOException {
        System.out.println("***MOSTRAR STOCK MINIMO PRODUCTOS***");
        System.out.println(baseDatos.mostrarStockMinimoProductos());
    }

    private static void mostrarProductosPorCategoria() throws IOException {
        System.out.println("***MOSTRAR PRODUCTOS POR CATEGORIA***");
        System.out.println("Ingresar la categoria del producto que desea consultar: ");
        String categoria = br.readLine();
        System.out.println(baseDatos.mostrarProductosPorCategoria(categoria));
    }

    private static void finalizarPrograma() {
        System.out.println("Fin de la aplicación de almacen.");
        System.exit(0);
    }
}
