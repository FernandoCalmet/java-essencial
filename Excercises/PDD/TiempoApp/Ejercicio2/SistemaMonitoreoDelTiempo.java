package Ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public class SistemaMonitoreoDelTiempo {
    public static void main(String[] args) {
        DatoDelTiempo tiempo = new DatoDelTiempo();
        new MuestraCondicionesActuales(tiempo);
        new MuestraEstadisticas(tiempo);
        new MuestraPronostico(tiempo);

        System.out.println("SISTEMA DE MONITOREO DEL TIEMPO");
        tiempo.setMedidas(28, 65, 28);
        tiempo.setMedidas(32, 70, 30);
        tiempo.setMedidas(30, 90, 30);
    }
}