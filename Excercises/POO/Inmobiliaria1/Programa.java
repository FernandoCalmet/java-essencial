package Inmobiliaria1;

import java.util.ArrayList;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Programa {
    public static void main(String[] args) {
        Casa casa1 = new Casa("Casa de playa");
        Casa casa2 = new Casa("Casa de campo");
        Casa casa3 = new Casa("Cabaña");
        Casa casa4 = new Casa("Mansion");
        Casa casa5 = new Casa("Casa unifamiliar");
        Casa casa6 = new Casa("Casa prefabricada");

        ArrayList<Inmueble> listaCasas = new ArrayList<Inmueble>();
        listaCasas.add(casa1);
        listaCasas.add(casa2);
        listaCasas.add(casa3);
        listaCasas.add(casa4);
        listaCasas.add(casa5);
        listaCasas.add(casa6);

        for (Inmueble lista : listaCasas) {
            System.out.println(lista.getTipoInmueble());
        }
    }
}
