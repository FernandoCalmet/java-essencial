package Inmobiliaria;

/**
 *
 * @author fernandocalmet
 */
public class Programa {
    public static void main(String[]args){
        Casa casa1 = new Casa("Casa de playa", 50000);
        casa1.Vender();
        
        Departamento departamento1 = new Departamento("Departamento duplex", 35000);
        departamento1.Alquilar();
        
        Terreno terreno1 = new Terreno("Terreno para casa", 150000);
        terreno1.Registrar();
    }
}
