package Excercises.PDD.MiniDuckSimulator.ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PatoDeGoma extends Pato {

    public PatoDeGoma() {
        vuelo = new SinVuelo();
        sonido = new Chirreo();
    }

    @Override
    public void mostrar() {
        System.out.println("Yo soy un patito de goma");
    }
}