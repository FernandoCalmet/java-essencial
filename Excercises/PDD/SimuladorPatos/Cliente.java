package SimuladorPatos;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Cliente {

    public static void main(String[] args) {

        PatoReal patoA = new PatoReal();
        PatitoDeGoma patoB = new PatitoDeGoma();
        PatoSenuelo patoC = new PatoSenuelo();
        PatoCabezaRoja patoD = new PatoCabezaRoja();

        Contexto strategyA = new Contexto();
        strategyA.setStrategy(patoA);
        System.out.println(strategyA.cuaquear());
        System.out.println(strategyA.nadar());
        System.out.println(strategyA.mostrar());

        Contexto strategyB = new Contexto();
        strategyB.setStrategy(patoB);
        System.out.println(strategyB.cuaquear());
        System.out.println(strategyB.nadar());
        System.out.println(strategyB.mostrar());

        Contexto strategyC = new Contexto();
        strategyC.setStrategy(patoC);
        System.out.println(strategyC.cuaquear());
        System.out.println(strategyC.nadar());
        System.out.println(strategyC.mostrar());

        Contexto strategyD = new Contexto();
        strategyD.setStrategy(patoD);
        System.out.println(strategyD.cuaquear());
        System.out.println(strategyD.nadar());
        System.out.println(strategyD.mostrar());
    }
}