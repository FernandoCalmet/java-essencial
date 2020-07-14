package TiempoApp.Ejercicio1;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public class TiempoApp {
    public static void main(String[] args) {

        PantallaLCD lcd = new PantallaLCD();
        Ventana ventana = new Ventana();
        PantallaRelojInteligente reloj = new PantallaRelojInteligente();

        MonitorTiempo monitor1 = new MonitorTiempo(lcd, 20);
        MonitorTiempo monitor2 = new MonitorTiempo(ventana, 20);
        MonitorTiempo monitor3 = new MonitorTiempo(reloj, 20);

        monitor1.mostrar();
        monitor2.mostrar();
        monitor3.mostrar();
    }
}