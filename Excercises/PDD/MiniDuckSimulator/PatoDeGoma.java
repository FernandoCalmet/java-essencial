package Excercises.PDD.MiniDuckSimulator;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PatoDeGoma extends Pato {

    public PatoDeGoma() {
        volable = new NoVuela();
        cuaqueable = new Chirreo();
    }

    @Override
    public void mostrar() {
        System.out.println("Yo soy un patito de goma");
    }
}
