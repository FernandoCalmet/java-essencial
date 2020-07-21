package TiempoApp.Ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class MuestraPronostico implements Observer, ElementoDespliegue {
    private float presionActual;
    private float ultimaPresion;
    private DatoDelTiempo datoTiempo;

    public MuestraPronostico(DatoDelTiempo datoTiempo) {
        this.datoTiempo = datoTiempo;
        this.datoTiempo.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        if (this.datoTiempo.getPresion() > pressure) {
            this.presionActual = this.datoTiempo.getPresion();
            this.ultimaPresion = pressure;
        } else {
            this.presionActual = pressure;
            this.ultimaPresion = this.datoTiempo.getPresion();
        }
        mostrar();
    }

    @Override
    public void mostrar() {
        System.out.print("Pronostico del tiempo: ");
        // opcional: this.presionActual == 14
        if (this.presionActual > this.ultimaPresion) {
            System.out.print("Mejorando el tiempo a pasar el dia!");
        }
        // opcional: this.presionActual == 16
        else if (this.presionActual < this.ultimaPresion) {
            System.out.print("Tenga cuidado, dia frio y lluvioso.");
        } else if (this.presionActual == this.ultimaPresion) {
            System.out.print("Todo el dia se mantendra equilibrado.");
        }
    }
}