package TiempoApp.Ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public class MuestraCondicionesActuales implements Observer, ElementoDespliegue {
    private float temperatura;
    private float humedad;
    private Subject datoTiempo;

    public MuestraCondicionesActuales(Subject datoTiempo) {
        this.datoTiempo = datoTiempo;
        this.datoTiempo.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperatura = temp;
        this.humedad = humidity;
        mostrar();
    }

    @Override
    public void mostrar() {
        System.out.println(
                "\n\nCondiciones del Tiempo Ahora: " + this.temperatura + " grados C " + this.humedad + "% humedad.");
    }
}