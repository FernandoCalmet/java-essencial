package Productos;

import java.util.List;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public class ContextoProducto {
    public IProductoRopa productoA;
    public IProductoCerveza productoB;

    public void setStrategyA(IProductoRopa productoA) {
        this.productoA = productoA;
    }

    public void setStrategyB(IProductoCerveza productoB) {
        this.productoB = productoB;
    }

    public List<String> getPantalon() {
        return this.productoA.getPantalon();
    }

    public List<String> getCamisa() {
        return this.productoA.getCamisa();
    }

    public List<String> getZapatos() {
        return this.productoA.getZapatos();
    }

    public List<String> getNegra() {
        return this.productoB.getNegra();
    }

    public List<String> getRubia() {
        return this.productoB.getRubia();
    }

    public List<String> getRoja() {
        return this.productoB.getRoja();
    }
}