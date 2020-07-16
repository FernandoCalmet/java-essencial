package TiempoApp.Ejercicio2;

/**
 *
 * @author Fernando Calmet
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
        tiempo.setMedidas(28, 65, 14);
        // Actualizar estados
        new MuestraCondicionesActuales(tiempo).update(32, 70, 16);
        new MuestraEstadisticas(tiempo).update(32, 70, 16);
        new MuestraPronostico(tiempo).update(32, 70, 16);
        // Actualizar estados
        new MuestraCondicionesActuales(tiempo).update(30, 90, 15);
        new MuestraEstadisticas(tiempo).update(32, 90, 16);
        new MuestraPronostico(tiempo).update(30, 90, 15);
    }
}