package Caso1;

public class Pais {

    private String nombre;
    private String moneda;
    private String idioma;
    private String presidente;
    private int cantPoblacion;
    private Capital capital;

    public Pais(String nombre, String moneda, String idioma, String presidente, int cantPoblacion, Capital capital) {
        this.nombre = nombre;
        this.moneda = moneda;
        this.idioma = idioma;
        this.presidente = presidente;
        this.cantPoblacion = cantPoblacion;
        this.capital = capital;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public int getCantPoblacion() {
        return cantPoblacion;
    }

    public void setCantPoblacion(int cantPoblacion) {
        this.cantPoblacion = cantPoblacion;
    }

    public Capital getCapital() {
        return capital;
    }

    public void setCapital(Capital capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "País:" + "\nNombre: " + getNombre() + "\nMoneda: " + getMoneda() + "\nIdioma: " + getIdioma() + "\nPresidente: " + getPresidente() + "\nCantidad de Población: " + getCantPoblacion() + "\nCapital:" + getCapital();
    }
}