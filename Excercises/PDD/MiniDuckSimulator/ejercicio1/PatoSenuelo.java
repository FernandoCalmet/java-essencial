package Excercises.PDD.MiniDuckSimulator.ejercicio1;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PatoSenuelo extends Pato {

    public PatoSenuelo() {
        volable = new NoVuela();
        cuaqueable = new CuaqueoMudo();
    }

    @Override
    public void mostrar() {
        System.out.println("Yo soy un Pato señuelo");
    }
}
