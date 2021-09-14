package Excercises.PDD.MiniDuckSimulator.ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class SinSonido implements ISonido {

    @Override
    public void obtenerSonido() {
        System.out.println("<<Silencio>>");
    }
}