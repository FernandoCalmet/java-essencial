package TiempoApp.Ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public class MuestraPronostico implements Observer, ElementoDespliegue {
    private float presionActual = 29.92f;
    private float ultimaPresion;
    private DatoDelTiempo datoTiempo;

    public MuestraPronostico(DatoDelTiempo datoTiempo) {
        this.datoTiempo = datoTiempo;
        this.datoTiempo.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.ultimaPresion = this.presionActual;
        this.presionActual = pressure;
        mostrar();
    }

    @Override
    public void mostrar() {
        System.out.print("Pronostico del tiempo: ");
        if (this.presionActual > this.ultimaPresion) {
            System.out.print("Mejorando el tiempo a pasar el dia!");
        } else if (this.presionActual == this.ultimaPresion) {
            System.out.print("Todo el dia se mantendra equilibrado.");
        } else if (this.presionActual < this.ultimaPresion) {
            System.out.print("Tenga cuidado, dia frio y lluvioso.");
        }
    }
}