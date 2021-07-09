package Excercises.POO.UPAO.EjerciciosLaboratorio.src.Ejercicio12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PruebaBanco {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /* A) CAPTURAR DATOS DE CONTACTOS */
        // CONTACTO #1
        System.out.println("* DATOS DE CONTACTO #1 *");
        System.out.println("Ingresar DNI: ");
        String dni1 = br.readLine();
        System.out.println("Ingresar Nombres: ");
        String nombres1 = br.readLine();
        System.out.println("Ingresar Telefono: ");
        int telefono1 = Integer.parseInt(br.readLine());
        System.out.println("Ingresar Direccion: ");
        String direccion1 = br.readLine();
        // CONTACTO #2
        System.out.println("* DATOS DE CONTACTO #2 *");
        System.out.println("Ingresar DNI: ");
        String dni2 = br.readLine();
        System.out.println("Ingresar Nombres: ");
        String nombres2 = br.readLine();
        System.out.println("Ingresar Telefono: ");
        int telefono2 = Integer.parseInt(br.readLine());
        System.out.println("Ingresar Direccion: ");
        String direccion2 = br.readLine();
        // CONTACTO #3
        System.out.println("* DATOS DE CONTACTO #3 *");
        System.out.println("Ingresar DNI: ");
        String dni3 = br.readLine();
        System.out.println("Ingresar Nombres: ");
        String nombres3 = br.readLine();
        System.out.println("Ingresar Telefono: ");
        int telefono3 = Integer.parseInt(br.readLine());
        System.out.println("Ingresar Direccion: ");
        String direccion3 = br.readLine();
        /* CREAR LISTA DE CONTACTOS */
        Contacto contacto1 = new Contacto(dni1, nombres1, telefono1, direccion1);
        Contacto contacto2 = new Contacto(dni2, nombres2, telefono2, direccion2);
        Contacto contacto3 = new Contacto(dni3, nombres3, telefono3, direccion3);
        ArrayList<Contacto> listaContactos = new ArrayList<Contacto>();
        listaContactos.add(contacto1);
        listaContactos.add(contacto2);
        listaContactos.add(contacto3);
        /* CREAR AGENDA DE CONTACTOS */
        Agenda agenda = new Agenda(listaContactos, 1, "Bravo Flores");

        /* B) MOSTRAR DATOS DE AGENDA CON LISTA DE CONTACTOS */
        System.out.println(agenda.toString());

        /* C) BUSCAR CONTACTO POR DNI EN LA AGENDA CREADA */
        System.out.println("Ingresar el DNI que desea buscar: ");
        String buscarDni = br.readLine();
        System.out.println("\nResultado de busqueda: " + agenda.buscarPorDni(listaContactos, buscarDni));
    }
}