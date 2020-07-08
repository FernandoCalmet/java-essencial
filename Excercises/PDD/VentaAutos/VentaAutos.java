/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public class VentaAutos {
    private static Registro registro = new Registro();
    public static void main(String[] args) {
        /* CLIENTE #1 : COMUN */
        Cliente cliente1 = new Cliente("Juan Luna", "Pizarro 345", "+5191547197");
        registro.nuevoCliente(cliente1);
        /* VENTA DE CLIENTE #1 : AUTO NUEVO */
        Venta venta1 = new VentaAutoNuevo("Mercedez Benz 300/400", 87000);
        cliente1.agregarVenta(venta1);
        /* VENTA DE CLIENTE #1 : AUTO USADO */
        Venta venta2 = new VentaAutoUsado("Alfa Romeo 156 1.8 TS", 259000, 2000, "34.500 km. servo control, cambio antibloqueo, ventana electrica, sp.chassis, 17'alu, aire acondicionado, pestillos electricos remotos, descanso para cabecera, CD, aros de aluminio, llave y accesorios plenos.");
        cliente1.agregarVenta(venta2);
        /* MOSTRAR REPORTE DE CLIENTE #1 */
        System.out.println(registro.getCliente(0).toString());
        System.out.println(registro.getCliente(0).getVentas());
        System.out.println("Cantidad Total: " + registro.getVentaTotal(0));
        System.out.println("Anio Promedio del Modelo: " + registro.getEdadPromedio(0));
        
        /* CLIENTE #2 : JURIDICO */
        Cliente cliente2 = new ClienteJuridico("Helisa S.A.C", "Grau 343", "+51 73 919 232", "Eric Tordoya", "+47 900 13 260");
        registro.nuevoCliente(cliente2);
        /* VENTA DE CLIENTE #2 : AUTO USADO */
        Venta venta3 = new VentaAutoUsado("Toyota Corolla", 439000, 1986, "44.830 km.aut., sistema de aire acondicionado, asientos de cuero, airbag, servo control, 4 ventans electricas deslizantes, asiento ajustable, aro 16'alu, seguros de puerta a control remoto, frenos anti bloqueantes, mantenimiento gratis por un anio.");
        cliente2.agregarVenta(venta3);
        /* VENTA DE CLIENTE #2 : AUTO NUEVO */
        Venta venta4 = new VentaAutoNuevo("Audi A6 1.9TDi Avant", 379000);
        cliente2.agregarVenta(venta4);
        /* MOSTRAR REPORTE DE CLIENTE #2 */
        System.out.println(registro.getCliente(1).toString());
        System.out.println(registro.getCliente(1).getVentas());
        System.out.println("Cantidad Total: " + registro.getVentaTotal(1));
        System.out.println("Anio Promedio del Modelo: " + registro.getEdadPromedio(1));

        /* CLIENTE #3 : COMUN */
        Cliente cliente3 = new Cliente("Jose Velez", "Independencia 950", "+ 51 44205028");
        registro.nuevoCliente(cliente3);
        /* VENTA DE CLIENTE #2 : AUTO NUEVO */
        Venta venta5 = new VentaAutoNuevo("Citroen Nouvelle Clasic 4", 21000);
        cliente3.agregarVenta(venta5);
        /* MOSTRAR REPORTE DE CLIENTE #2 */
        System.out.println(registro.getCliente(2).toString());
        System.out.println(registro.getCliente(2).getVentas());
        System.out.println("Cantidad Total: " + registro.getVentaTotal(2));
        System.out.println("Anio Promedio del Modelo: " + registro.getEdadPromedio(2));
    }
}