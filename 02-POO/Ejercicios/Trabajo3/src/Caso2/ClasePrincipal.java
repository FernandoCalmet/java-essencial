package Caso2;

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
        
        //Capturar datos de un chofer
        System.out.println("Ingresar dni del chofer: ");
        int dni = Integer.parseInt(br.readLine());
        System.out.println("Ingresar nombres del chofer: ");
        String nombres = br.readLine();
        System.out.println("Ingresar el numero de brevete del chofer: ");
        String nroBrevete = br.readLine();
        
        //Crear objeto chofer
        Chofer chofer1 = new Chofer(dni, nombres, nroBrevete);
        
        //Capturar datos de un taxi
        System.out.println("Ingresar la placa del taxi: ");
        String placa = br.readLine();
        System.out.println("Ingresar la marca del taxi: ");
        String marca = br.readLine();
        System.out.println("Ingresar el modelo del taxi: ");
        String modelo = br.readLine();
        
        //Crear y mostrar objeto taxi
        Taxi taxi1 = new Taxi(placa, marca, modelo, chofer1);
        System.out.println("Informacion de Taxi: "+taxi1.toString());
        
        //Modificar datos de un objeto chofer de un objeto taxi
        chofer1.setDni(12341234);
        chofer1.setNombres("Fernando");
        chofer1.setNroBrevete("XYZ123");  
        taxi1.setChofer(chofer1);
        System.out.println("Informacion actualizada de Taxi: "+taxi1.toString());
    }
    
}