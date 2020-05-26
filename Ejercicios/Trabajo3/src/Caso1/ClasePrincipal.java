package Caso1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author fernandocalmet
 */
public class ClasePrincipal 
{
    public static void main(String[]args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //Capturar datos del objeto capital
        System.out.println("*Datos de la Capital**");
        System.out.println("Ingresar el Codigo Postal:");
        String codigoPostal = br.readLine();
        System.out.println("Ingresar el Nombre:");
        String nombreCapital = br.readLine();
        System.out.println("Ingresar el Alcalde:");
        String alcalde = br.readLine();
        
        //Crear 5 objetos capital
        Capital capital1 = new Capital(codigoPostal, nombreCapital, alcalde);   
        Capital capital2 = new Capital(codigoPostal, nombreCapital, alcalde);
        Capital capital3 = new Capital(codigoPostal, nombreCapital, alcalde);
        Capital capital4 = new Capital(codigoPostal, nombreCapital, alcalde);
        Capital capital5 = new Capital(codigoPostal, nombreCapital, alcalde);
        
        //Capturar datos del objeto pais
        System.out.println("*Datos del Pais*");
        System.out.println("Ingresar el nombre:");
        String nombre = br.readLine();
        System.out.println("Ingresar el tipo de moneda:");
        String moneda = br.readLine();
        System.out.println("Ingresar el Idioma:");
        String idioma = br.readLine();
        System.out.println("Ingresar el nombre del presidente:");
        String presidente = br.readLine();
        System.out.println("Ingresar la Cantidad de Población:");
        int cantPoblacion = Integer.parseInt(br.readLine());      

        //Crear objetos pais
        Pais pais1 = new Pais(nombre, moneda, idioma, presidente, cantPoblacion, capital1); 
        Pais pais2 = new Pais(nombre, moneda, idioma, presidente, cantPoblacion, capital2);
        Pais pais3 = new Pais(nombre, moneda, idioma, presidente, cantPoblacion, capital3);
                      
        //Mostrar datos de los objetos pais
        System.out.println("\n*Información del pais*");
        System.out.println("Pais 1:" + pais1.toString());
        System.out.println("Pais 2:" + pais2.toString());
        System.out.println("Pais 3:" + pais3.toString());
        
        //Modificar los datos de un objeto capital y mostrar cambios
        capital1.setCodigoPostal("0123");
        capital1.setNombre("Trujillo");
        capital1.setAlcalde("Fernando");
        System.out.println("Capital 1 modificada: \n"+pais1.toString());
    }
    
}
