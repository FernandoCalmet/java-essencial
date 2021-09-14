package Excercises.PDD.MiniDuckSimulator.ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PatoSenuelo extends Pato {

    public PatoSenuelo() {
        vuelo = new SinVuelo();
        sonido = new SinSonido();
    }

    @Override
    public void mostrar() {
        System.out.println("Yo soy un Pato señuelo");
    }
}