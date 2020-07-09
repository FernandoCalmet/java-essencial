package Ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
import java.util.ArrayList;

public class DatoDelTiempo implements Subject {
    private ArrayList observers;
    private float temperatura;
    private float humedad;
    private float presion;

    public DatoDelTiempo() {
        // Almacenar los observadores
        this.observers = new ArrayList();
    }

    // Cuando un observador se registra lo agregamos al final de la lista
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    // Cuando un observador se retira lo removemos de la lista
    public void removeObserver(Observer o) {
        int i = this.observers.indexOf(o);
        if (i >= 0) {
            this.observers.remove(i);
        }
    }

    // Notificar a los observadores sobre un cambio
    public void notifyObservers() {
        for (int i = 0; i < this.observers.size(); i++) {
            Observer observer = (Observer) this.observers.get(i);
            observer.update(getTemperatura(), getHumedad(), getPresion());
        }
    }

    public void medidasCambiadas() {
        notifyObservers();
    }

    public void setMedidas(float temp, float humidity, float pressure) {
        this.temperatura = temp;
        this.humedad = humidity;
        this.presion = pressure;
        medidasCambiadas();
    }

    public float getTemperatura() {
        return this.temperatura;
    }

    public float getHumedad() {
        return this.humedad;
    }

    public float getPresion() {
        return this.presion;
    }
}