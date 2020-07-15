package TiempoApp.Ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public class SistemaMonitoreoDelTiempo {
    public static void main(String[] args) {
        // Crear un objeto Subject
        DatoDelTiempo tiempo = new DatoDelTiempo();
        // Usar el objeto Subject para crear Observers concretos
        new MuestraCondicionesActuales(tiempo);
        new MuestraEstadisticas(tiempo);
        new MuestraPronostico(tiempo);
        // Agregar valores para medidas de monitoreo en el objeto Subject
        System.out.println("SISTEMA DE MONITOREO DEL TIEMPO");
        tiempo.setMedidas(28, 65, 28);
        tiempo.setMedidas(32, 70, 30);
        tiempo.setMedidas(30, 90, 30);
    }
}