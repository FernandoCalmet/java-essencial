package Excercises.PDD.MiniDuckSimulator.ejercicio1;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        Pato patoReal = new PatoReal();
        patoReal.mostrar();
        patoReal.realizarCuaqueo();
        patoReal.realizarVuelo();
        patoReal.nadar();

        Pato patoDeGoma = new PatoDeGoma();
        patoDeGoma.mostrar();
        patoDeGoma.realizarCuaqueo();
        patoDeGoma.realizarVuelo();
        patoDeGoma.nadar();

        Pato patoSenuelo = new PatoSenuelo();
        patoSenuelo.mostrar();
        patoSenuelo.realizarCuaqueo();
        patoSenuelo.realizarVuelo();
        patoSenuelo.nadar();

        Pato patoCabezaRoja = new PatoCabezaRoja();
        patoCabezaRoja.mostrar();
        patoCabezaRoja.realizarCuaqueo();
        patoCabezaRoja.realizarVuelo();
        patoCabezaRoja.nadar();
    }
}
