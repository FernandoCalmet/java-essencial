package Ejercicio5;
/**
 *
 * @author fernandocalmet
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClasePrincipal 
{
    public static void main(String[]args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingresar una capacidad maxima del cafetera: ");
        int capacMax = Integer.parseInt(br.readLine());
        System.out.println("Ingresar una cantidad actual del cafe en la cafetera: ");
        int cantActual = Integer.parseInt(br.readLine());
        System.out.println("Ingresar una cantidad para agregar/servir cafe: ");
        int cantidad = Integer.parseInt(br.readLine());
        //Crear primer objeto vacio
        Cafetera cafetera1 = new Cafetera();
        System.out.println("\nCafetera 1:\n"+cafetera1.toString());
        //Crear segundo objeto con capacidad maxima
        Cafetera cafetera2 = new Cafetera(capacMax);
        System.out.println("\nCafetera 2:\n"+cafetera2.toString());
        //Crear tercer objeto con capacidad maxima
        Cafetera cafetera3 = new Cafetera(capacMax, cantActual);
        System.out.println("\nCafetera 3:\n"+cafetera3.toString());
        //Vaciar el segundo objeto
        cafetera2.vaciarCafetera();
        System.out.println("\nSe vacio la Cafetera 2\n"+cafetera2.toString());
        //Llenar el segundo objeto
        cafetera2.llenarCafetera();
        System.out.println("\nSe lleno la Cafetera 2\n"+cafetera2.toString());
        //Servir del segundo objeto
        cafetera2.servirTaza(cantidad);
        System.out.println("\nSe sirvio "+cantidad+" de cafe a una taza de la Cafetera 2\n"+cafetera2.toString());
        //Agregar al tercer objeto
        cafetera3.agregarCafe(cantidad);
        System.out.println("\nSe agrego "+cantidad+" de cafe a la Cafetera 3\n"+cafetera3.toString());
    }  
}