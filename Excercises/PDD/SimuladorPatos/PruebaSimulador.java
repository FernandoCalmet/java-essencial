package Excercises.PDD.SimuladorPatos;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PruebaSimulador {
    public static void main(String[] args) {
        //Crear objetos de patos
        IPato patoReal = new PatoReal();
        IPato patoDeGoma = new PatitoDeGoma();
        IPato patoSenuelo = new PatoSenuelo();
        IPato patoCabezaRoja = new PatoCabezaRoja();
        //Crear objeto de simulación
        Contexto simulador = new Contexto();
        //Simular patos
        mostrarSimulacion(simulador, patoReal);
        mostrarSimulacion(simulador, patoDeGoma);
        mostrarSimulacion(simulador, patoSenuelo);
        mostrarSimulacion(simulador, patoCabezaRoja);
    }

    public static void mostrarSimulacion(Contexto sim, IPato pato) {
        sim.setStrategy(pato);
        System.out.println(sim.descripcion());
        System.out.println(sim.cuaquear());
        System.out.println(sim.nadar());
        System.out.println(sim.mostrar());
        System.out.println();
    }
}
