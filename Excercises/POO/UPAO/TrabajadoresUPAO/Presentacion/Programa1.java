package Excercises.POO.UPAO.TrabajadoresUPAO.Presentacion;

import Excercises.POO.UPAO.TrabajadoresUPAO.Logica.*;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Programa1 {
    public static void main(String[] args) {
        // Crear objetos de trabajador docente
        Docente docente1 = new DocenteTiempoCompleto("Docente Tiempo Completo", "Freddy", "12345", "Ingenieria", 2800);
        Docente docente2 = new DocenteTiempoCompleto("Docente Tiempo Completo", "Henrry", "67890", "Administracion",
                3000);
        Docente docente3 = new DocenteTiempoParcial("Docente Tiempo Parcial", "Pedro", "12534", "Ingenieria", 15, 20);
        // Mostrar datos de los objetos trabajador docente
        System.out.println(docente1.toString());
        System.out.println(docente2.toString());
        System.out.println(docente3.toString());

        // Crear objetos de trabajador administrativo
        Administrativo admin1 = new Administrativo("Administrativo", "Rolando", "45321", "Contabilidad", "Director",
                2500);
        Administrativo admin2 = new Administrativo("Administrativo", "Carlos", "76895", "Personal", "Asistente", 1500);
        Administrativo admin3 = new Administrativo("Administrativo", "Maria", "67567", "Logistica", "Director", 2200);
        // Mostrar datos de los objetos trabajador administrativo
        System.out.println(admin1.toString());
        System.out.println(admin2.toString());
        System.out.println(admin3.toString());

        // Crear objetos de trabajador servicio
        Servicio servicio1 = new Servicio("Servicio", "Wilson", "64321", "Mantenimiento", 800);
        Servicio servicio2 = new Servicio("Servicio", "Maria", "65190", "Limpieza", 700);
        // Mostrar datos de los objetos trabajador servicio
        System.out.println(servicio1.toString());
        System.out.println(servicio2.toString());
    }
}
