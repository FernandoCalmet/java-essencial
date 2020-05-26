package Caso4;

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
        
        //Capturar datos de un contacto
        System.out.println("Ingresar DNI: ");
        int dni = Integer.parseInt(br.readLine());
        System.out.println("Ingresar Nombres: ");
        String nombres = br.readLine();
        System.out.println("Ingresar Telefono: ");
        int telefono = Integer.parseInt(br.readLine());
        System.out.println("Ingresar Direccion: ");
        String direccion = br.readLine();
        
        //Crear objeto contacto
        Contacto contacto = new Contacto(dni, nombres, telefono, direccion);
        
        //Crear arreglo para listar contactos
        ArrayList<Contacto> listaContactos = new ArrayList(); 
        listaContactos.add(contacto);
        listaContactos.add(contacto);
        listaContactos.add(contacto);
        listaContactos.add(contacto);
        listaContactos.add(contacto);
        
        //Crear objetos agenda
        Agenda agenda1 = new Agenda(listaContactos, 1, "Fernando");
        Agenda agenda2 = new Agenda(listaContactos, 2, "Andres");
        
        //Mostrar agendas
        System.out.println(agenda1.toString());
        System.out.println(agenda2.toString());
        
        //Buscar un contacto por dni
        System.out.println("\nResultado de busqueda: "+agenda1.buscarPorDni(contacto, 12341234));
    }
}
