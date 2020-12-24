package Excercises.PDD.TiempoApp.Ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class MuestraEstadisticas implements Observer, ElementoDespliegue {
    private float maxTemp;
    private float minTemp;
    private float tempSum;
    private static int numReadings;
    private DatoDelTiempo datoTiempo;

    public MuestraEstadisticas(DatoDelTiempo datoTiempo) {
        this.datoTiempo = datoTiempo;
        this.datoTiempo.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        if (this.datoTiempo.getTemperatura() > temp) {
            this.maxTemp = this.datoTiempo.getTemperatura();
            this.minTemp = temp;
        } else {
            this.maxTemp = temp;
            this.minTemp = this.datoTiempo.getTemperatura();
        }
        this.tempSum = (this.maxTemp + this.minTemp) / 2;
        numReadings++;
        mostrar();
    }

    @Override
    public void mostrar() {
        System.out.println("Estadisticas del tiempo: \nTemperatura promedio: " + this.tempSum + "\nTemperatura maxima: "
                + this.maxTemp + "\nTemperatura minima: " + this.minTemp + "\nCambio de estado Nro. " + numReadings);
    }
}