package Ejercicio10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public class PruebaEmpresaTaxis {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /* A) CAPTURAR DATOS DEL CHOFER */
        System.out.println("Ingresar dni del chofer: ");
        int dni = Integer.parseInt(br.readLine());
        System.out.println("Ingresar nombres del chofer: ");
        String nombres = br.readLine();
        System.out.println("Ingresar el numero de brevete del chofer: ");
        String nroBrevete = br.readLine();
        /* CREAR OBJETO CHOFER Y ASIGNAR DATOS CAPTURADOS */
        Chofer chofer1 = new Chofer(dni, nombres, nroBrevete);
        /* CAPTURAR DATOS DE TAXI */
        System.out.println("Ingresar la placa del taxi: ");
        String placa = br.readLine();
        System.out.println("Ingresar la marca del taxi: ");
        String marca = br.readLine();
        System.out.println("Ingresar el modelo del taxi: ");
        String modelo = br.readLine();
        /* CREAR OBJETO TAXI Y ASIGNAR DATOS CAPTURADOS */
        Taxi taxi1 = new Taxi(placa, marca, modelo, chofer1);

        /* B) MOSTRAR LOS DATOS DEL TAXI Y SU CHOFER ASIGNADO */
        System.out.println("\nInformacion de Taxi: " + taxi1.toString());

        /* C) CAMBIAR DE CHOFER ASIGNADO A UN TAXI */
        chofer1.setDni(12341234);
        chofer1.setNombres("Bravo Flores");
        chofer1.setNroBrevete("A1B2C3");
        taxi1.setChofer(chofer1);
        System.out.println("\nInformacion actualizada del Taxi: " + taxi1.toString());
    }
}
