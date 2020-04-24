package Inmobiliaria;

/**
 *
 * @author fernandocalmet
 */
public class Casa extends Inmueble
{
    public Casa(String tipo, double precio){
        this.tipoInmueble = tipo;
        this.precio = precio;
    }
    
    public Casa(String tipo){
        this.tipoInmueble = tipo;
    }
}
