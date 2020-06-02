public class FonoCamaraApp{
    public static void main(String[] args) {

        ConcretCamaraSimple camaraA = new ConcretCamaraSimple();
        ConcretCamaraPro camaraB = new ConcretCamaraPro();
              
        ContextFonoCamara strategyA = new ContextFonoCamara();
        strategyA.setStrategy(camaraA);
        System.out.println(strategyA.tomar());
        System.out.println(strategyA.compartir());
        System.out.println(strategyA.editar());
        System.out.println(strategyA.guardar());

        ContextFonoCamara strategyB = new ContextFonoCamara();
        strategyB.setStrategy(camaraB);
        System.out.println(strategyB.tomar());
        System.out.println(strategyB.compartir());
        System.out.println(strategyB.editar());
        System.out.println(strategyB.guardar());
    }
}