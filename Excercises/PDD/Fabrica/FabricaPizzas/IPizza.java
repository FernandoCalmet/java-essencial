package Fabrica.FabricaPizzas;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public interface IPizza {
    public void preparar();

    public void hornear();

    public void cortar();

    public void envasar();

    public String getNombre();
}