package Excercises.POO.UPAO.Inmobiliaria1;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Casa extends Inmueble {
    public Casa(String tipo, double precio) {
        this.tipoInmueble = tipo;
        this.precio = precio;
    }

    public Casa(String tipo) {
        this.tipoInmueble = tipo;
    }
}
