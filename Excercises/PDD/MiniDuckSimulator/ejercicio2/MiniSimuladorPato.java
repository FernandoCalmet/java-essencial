package Excercises.PDD.MiniDuckSimulator.ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class MiniSimuladorPato {

    public static void main(String[] args) {
        Pato patoReal = new PatoReal();
        patoReal.mostrar();
        patoReal.realizarSonido();
        patoReal.realizarVuelo();
        patoReal.nadar();

        Pato patoDeGoma = new PatoDeGoma();
        patoDeGoma.mostrar();
        patoDeGoma.realizarSonido();
        patoDeGoma.realizarVuelo();
        patoDeGoma.nadar();

        Pato patoSenuelo = new PatoSenuelo();
        patoSenuelo.mostrar();
        patoSenuelo.realizarSonido();
        patoSenuelo.realizarVuelo();
        patoSenuelo.nadar();

        Pato patoCabezaRoja = new PatoCabezaRoja();
        patoCabezaRoja.mostrar();
        patoCabezaRoja.realizarSonido();
        patoCabezaRoja.realizarVuelo();
        patoCabezaRoja.nadar();
    }
}