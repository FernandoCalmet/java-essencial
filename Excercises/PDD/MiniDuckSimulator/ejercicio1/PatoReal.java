package Excercises.PDD.MiniDuckSimulator.ejercicio1;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PatoReal extends Pato {

    public PatoReal() {
        volable = new VuelaConAlas();
        cuaqueable = new Cuaqueo();
    }

    @Override
    public void mostrar() {
        System.out.println("Yo soy un verdadero PATO REAL");
    }
}
