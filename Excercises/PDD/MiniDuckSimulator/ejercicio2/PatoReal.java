package Excercises.PDD.MiniDuckSimulator.ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PatoReal extends Pato {

    public PatoReal() {
        vuelo = new VueloConAlas();
        sonido = new Cuaqueo();
    }

    @Override
    public void mostrar() {
        System.out.println("Yo soy un verdadero PATO REAL");
    }
}