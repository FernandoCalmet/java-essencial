package TiempoApp.Ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public class MuestraEstadisticas implements Observer, ElementoDespliegue {
    private float maxTemp;
    private float minTemp;
    private float tempSum;
    /* private int numReadings; */
    private DatoDelTiempo datoTiempo;

    public MuestraEstadisticas(DatoDelTiempo datoTiempo) {
        this.datoTiempo = datoTiempo;
        this.datoTiempo.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.maxTemp = temp + 2;
        this.minTemp = temp - 2;
        this.tempSum = (this.maxTemp + this.minTemp) / 2;
        mostrar();
    }

    @Override
    public void mostrar() {
        System.out.println("Estadisticas del tiempo: \nTemperatura promedio: " + this.tempSum + "\nTemperatura maxima: "
                + this.maxTemp + "\nTemperatura minima: " + this.minTemp);
    }
}