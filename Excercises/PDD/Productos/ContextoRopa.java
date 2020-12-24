package Excercises.PDD.Productos;

import java.util.List;

public class ContextoRopa {
    private IProductoRopa ropa;

    public void setRopa(IProductoRopa ropa) {
        this.ropa = ropa;
    }

    public List<String> getPantalon() {
        return this.ropa.getPantalon();
    }

    public List<String> getCamisa() {
        return this.ropa.getCamisa();
    }

    public List<String> getZapatos() {
        return this.ropa.getZapatos();
    }
}
