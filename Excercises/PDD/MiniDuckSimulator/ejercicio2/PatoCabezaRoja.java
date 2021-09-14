package Excercises.PDD.MiniDuckSimulator.ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PatoCabezaRoja extends Pato {

    public PatoCabezaRoja() {
        vuelo = new VueloConAlas();
        sonido = new Cuaqueo();
    }

    @Override
    public void mostrar() {
        System.out.println("Yo soy un real PATO CABEZA ROJA");
    }
}
