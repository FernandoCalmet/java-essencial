package TiempoApp.Ejercicio1;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public class MonitorTiempo {
    private float temperatura;
    private IPantalla pantalla;

    public MonitorTiempo(IPantalla p, float t) {
        this.pantalla = p;
        this.temperatura = t;
    }

    public float getTemperatura() {
        return this.temperatura;
    }

    public void mostrar() {
        this.pantalla.mostrarEnPantalla(getTemperatura());
    }
}