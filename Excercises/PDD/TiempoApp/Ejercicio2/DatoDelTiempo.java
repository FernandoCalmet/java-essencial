package Excercises.PDD.TiempoApp.Ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
import java.util.ArrayList;

public class DatoDelTiempo implements Subject {
    private ArrayList<Observer> observers;
    private float temperatura;
    private float humedad;
    private float presion;

    // Constructor del objeto Subject
    public DatoDelTiempo() {
        // Almacenar los observadores
        this.observers = new ArrayList<Observer>();
    }

    // Cuando un observador se registra lo agregamos al final de la lista
    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    // Cuando un observador se retira lo removemos de la lista
    @Override
    public void removeObserver(Observer o) {
        int i = this.observers.indexOf(o);
        if (i >= 0) {
            this.observers.remove(i);
        }
    }

    // Notificar a los observadores sobre un cambio
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(getTemperatura(), getHumedad(), getPresion());
        }
    }

    // Encapsular la funcion para notificar a los observadores
    public void medidasCambiadas() {
        notifyObservers();
    }

    // Agregar las medidas/estados al observable
    public void setMedidas(float temp, float humidity, float pressure) {
        this.temperatura = temp;
        this.humedad = humidity;
        this.presion = pressure;
        medidasCambiadas();
    }

    // Obtener el estado de temperatura
    public float getTemperatura() {
        return this.temperatura;
    }

    // Obtener el estado de humedad
    public float getHumedad() {
        return this.humedad;
    }

    // Obtener el estado de presion
    public float getPresion() {
        return this.presion;
    }
}