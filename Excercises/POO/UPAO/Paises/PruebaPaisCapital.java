package Excercises.POO.UPAO.Paises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PruebaPaisCapital {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /* A) CAPTURAR DATOS PARA 5 CAPITALES */
        // Capital 1
        System.out.println("\n**Datos de la Capital #1**");
        System.out.println("Ingresar el Codigo Postal:");
        String codigoPostal1 = br.readLine();
        System.out.println("Ingresar el Nombre:");
        String nombreCapital1 = br.readLine();
        System.out.println("Ingresar el Alcalde:");
        String alcalde1 = br.readLine();
        // Capital 2
        System.out.println("\n**Datos de la Capital #2**");
        System.out.println("Ingresar el Codigo Postal:");
        String codigoPostal2 = br.readLine();
        System.out.println("Ingresar el Nombre:");
        String nombreCapital2 = br.readLine();
        System.out.println("Ingresar el Alcalde:");
        String alcalde2 = br.readLine();
        // Capital 3
        System.out.println("\n**Datos de la Capital #3**");
        System.out.println("Ingresar el Codigo Postal:");
        String codigoPostal3 = br.readLine();
        System.out.println("Ingresar el Nombre:");
        String nombreCapital3 = br.readLine();
        System.out.println("Ingresar el Alcalde:");
        String alcalde3 = br.readLine();
        // Capital 4
        System.out.println("\n**Datos de la Capital #4**");
        System.out.println("Ingresar el Codigo Postal:");
        String codigoPostal4 = br.readLine();
        System.out.println("Ingresar el Nombre:");
        String nombreCapital4 = br.readLine();
        System.out.println("Ingresar el Alcalde:");
        String alcalde4 = br.readLine();
        // Capital 5
        System.out.println("\n**Datos de la Capital #5**");
        System.out.println("Ingresar el Codigo Postal:");
        String codigoPostal5 = br.readLine();
        System.out.println("Ingresar el Nombre:");
        String nombreCapital5 = br.readLine();
        System.out.println("Ingresar el Alcalde:");
        String alcalde5 = br.readLine();
        /* CREAR OBJETOS DE CAPITAL CON LOS DATOS CAPTURADOS */
        Capital capital1 = new Capital(codigoPostal1, nombreCapital1, alcalde1);
        Capital capital2 = new Capital(codigoPostal2, nombreCapital2, alcalde2);
        Capital capital3 = new Capital(codigoPostal3, nombreCapital3, alcalde3);
        Capital capital4 = new Capital(codigoPostal4, nombreCapital4, alcalde4);
        Capital capital5 = new Capital(codigoPostal5, nombreCapital5, alcalde5);

        /* B) CAPTURAR DATOS PARA 3 PAISES */
        // Pais 1
        System.out.println("*Datos del Pais #1*");
        System.out.println("Ingresar el nombre:");
        String nombre1 = br.readLine();
        System.out.println("Ingresar el tipo de moneda:");
        String moneda1 = br.readLine();
        System.out.println("Ingresar el Idioma:");
        String idioma1 = br.readLine();
        System.out.println("Ingresar el nombre del presidente:");
        String presidente1 = br.readLine();
        System.out.println("Ingresar la Cantidad de Población:");
        int cantPoblacion1 = Integer.parseInt(br.readLine());
        // Pais 2
        System.out.println("*Datos del Pais #2*");
        System.out.println("Ingresar el nombre:");
        String nombre2 = br.readLine();
        System.out.println("Ingresar el tipo de moneda:");
        String moneda2 = br.readLine();
        System.out.println("Ingresar el Idioma:");
        String idioma2 = br.readLine();
        System.out.println("Ingresar el nombre del presidente:");
        String presidente2 = br.readLine();
        System.out.println("Ingresar la Cantidad de Población:");
        int cantPoblacion2 = Integer.parseInt(br.readLine());
        // Pais 3
        System.out.println("*Datos del Pais #3*");
        System.out.println("Ingresar el nombre:");
        String nombre3 = br.readLine();
        System.out.println("Ingresar el tipo de moneda:");
        String moneda3 = br.readLine();
        System.out.println("Ingresar el Idioma:");
        String idioma3 = br.readLine();
        System.out.println("Ingresar el nombre del presidente:");
        String presidente3 = br.readLine();
        System.out.println("Ingresar la Cantidad de Población:");
        int cantPoblacion3 = Integer.parseInt(br.readLine());
        /* CREAR OBJETOS DE PAIS CON LOS DATOS CAPTURADOS */
        Pais pais1 = new Pais(nombre1, moneda1, idioma1, presidente1, cantPoblacion1, capital1);
        Pais pais2 = new Pais(nombre2, moneda2, idioma2, presidente2, cantPoblacion2, capital2);
        Pais pais3 = new Pais(nombre3, moneda3, idioma3, presidente3, cantPoblacion3, capital3);

        /* C) MOSTRAR LOS DATOS DE CADA PAIS Y SUS CAPITALES */
        System.out.println("\n*Información de paises con capital*");
        System.out.println("Pais #1:" + pais1.toString());
        System.out.println("Pais #2:" + pais2.toString());
        System.out.println("Pais #3:" + pais3.toString());
        System.out.println("\n*Información de capitales*");
        System.out.println("Capital #1:" + capital1.toString());
        System.out.println("Capital #2:" + capital2.toString());
        System.out.println("Capital #3:" + capital3.toString());
        System.out.println("Capital #4:" + capital4.toString());
        System.out.println("Capital #5:" + capital5.toString());

        /* D) MODIFICAR LA CAPITAL DEL PAIS #1 Y MOSTRAR EL RESULTADO */
        capital1.setCodigoPostal("0123");
        capital1.setNombre("Trujillo");
        capital1.setAlcalde("Bravo Flores");
        System.out.println("Capital #1 modificada: \n" + pais1.toString());
    }
}
