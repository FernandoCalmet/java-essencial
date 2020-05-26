package Caso6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author fernandocalmet
 */
public class ClasePrincipal 
{
    public static void main(String[]args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //Crear objetos Producto
        Producto producto1 = new Producto("A", 5.50, 23);
        Producto producto2 = new Producto("B", 1.10, 60);
        Producto producto3 = new Producto("C", 2.35, 150);
        Producto producto4 = new Producto("D", 1, 100);
        Producto producto5 = new Producto("E", 4.10, 500);
        Producto producto6 = new Producto("F", 3.15, 80);      
        
        //Crear listas de objetos producto
        ArrayList<Producto> listaProductos1 = new ArrayList();
        ArrayList<Producto> listaProductos2 = new ArrayList();
        
        //Insertar objetos Producto a la listas
        listaProductos1.add(producto1);
        listaProductos1.add(producto2);
        listaProductos1.add(producto3);
        listaProductos2.add(producto4);
        listaProductos2.add(producto5);
        listaProductos2.add(producto6);
        
        //Crear objetos MaquinaExpendedora
        MaquinaExpendedora maquina1 = new MaquinaExpendedora(101, "Maquina 1", listaProductos1);
        MaquinaExpendedora maquina2 = new MaquinaExpendedora(102, "Maquina 2", listaProductos2);
        
        //Mostrar los atributos precio y stock de un objeto Producto
        System.out.println("Producto 1: Precio:"+producto1.getPrecio()+", Stock: "+producto1.getStock());
        
        //Capturar la cantidad y precio del producto a comprar
        System.out.println("Ingresar la cantidad de productos a comprar: ");
        int cantidad = Integer.parseInt(br.readLine());
        System.out.println("Ingresar el monto a pagar: ");
        int precio = Integer.parseInt(br.readLine());
                  
        //Compra de un objeto producto ingresando los atributos de cantidad y precio
        maquina1.comprarProducto(producto1, cantidad, precio);
        
        //Mostrar los datos de los objetos MaquinaExpendedora
        System.out.println("\n"+maquina1.toString());
        System.out.println("\n"+maquina2.toString());
    }
}