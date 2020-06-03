public class FonoCamaraApp{
    public static void main(String[] args) {

        ConcretCamaraSimple camaraA = new ConcretCamaraSimple();
        ConcretCamaraPro camaraB = new ConcretCamaraPro();
              
        ContextFonoCamara strategyA = new ContextFonoCamara();
        strategyA.setStrategy(camaraA);
        System.out.println(strategyA.editar());
        System.out.println(strategyA.tomar());
        System.out.println(strategyA.compartir("sms"));
        System.out.println(strategyA.compartir("email"));
        System.out.println(strategyA.compartir("redsocial"));
        System.out.println(strategyA.guardar());

        ContextFonoCamara strategyB = new ContextFonoCamara();
        strategyB.setStrategy(camaraB);
        System.out.println(strategyB.editar());
        System.out.println(strategyB.tomar());
        System.out.println(strategyB.compartir("sms"));
        System.out.println(strategyB.compartir("email"));
        System.out.println(strategyB.compartir("redsocial"));       
        System.out.println(strategyB.guardar());
    }
}