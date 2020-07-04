package Ejercicio9;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public class Capital {

    private String codigoPostal;
    private String nombre;
    private String alcalde;

    public Capital(String codigoPostal, String nombre, String alcalde) {
        this.codigoPostal = codigoPostal;
        this.nombre = nombre;
        this.alcalde = alcalde;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlcalde() {
        return alcalde;
    }

    public void setAlcalde(String alcalde) {
        this.alcalde = alcalde;
    }

    @Override
    public String toString() {
        return "Capital:" + "\nCodigo Postal: " + getCodigoPostal() + "\nNombre: " + getNombre() + "\nAlcalde: "
                + getAlcalde();
    }
}
