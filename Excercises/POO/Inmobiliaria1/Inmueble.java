package Excercises.POO.Inmobiliaria1;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Inmueble {
    protected String tipoInmueble;
    protected String ubicacion;
    protected int area;
    protected String dormitorios;
    protected double precio;

    public Inmueble() {
    }

    public Inmueble(String tipo, double precio) {
        this.tipoInmueble = tipo;
        this.precio = precio;
    }

    public String getTipoInmueble() {
        return tipoInmueble;
    }

    public void setTipoInmueble(String tipoInmueble) {
        this.tipoInmueble = tipoInmueble;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getDormitorios() {
        return dormitorios;
    }

    public void setDormitorios(String dormitorios) {
        this.dormitorios = dormitorios;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    protected void Registrar() {
        System.out.println(this.tipoInmueble + " a sido registrado correctamente");
    }

    protected void Vender() {
        System.out.println(this.tipoInmueble + " a sido vendido por el precio de " + this.precio);
    }

    protected void Alquilar() {
        System.out.println(this.tipoInmueble + " a sido alquilada por el precio de " + this.precio);
    }

    protected void VerDatos() {
        System.out.println(this.tipoInmueble + "\n" + this.area + "\n" + this.ubicacion + "\n");
    }
}
