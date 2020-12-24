package Excercises.PDD.Productos;

import java.util.List;

public class ContextoCerveza {
    private IProductoCerveza cerveza;

    public void setCerveza(IProductoCerveza cerveza) {
        this.cerveza = cerveza;
    }

    public List<String> getNegra() {
        return this.cerveza.getNegra();
    }

    public List<String> getRubia() {
        return this.cerveza.getRubia();
    }

    public List<String> getRoja() {
        return this.cerveza.getRoja();
    }
}
