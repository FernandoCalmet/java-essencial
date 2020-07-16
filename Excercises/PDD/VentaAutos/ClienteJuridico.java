package VentaAutos;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class ClienteJuridico extends Cliente {
    private String nombreDelContacto;
    private String telefonoDelContacto;

    public ClienteJuridico(String n, String d, String t, String nc, String tc) {
        super(n, d, t);
        this.nombreDelContacto = nc;
        this.telefonoDelContacto = tc;
    }

    @Override
    public String toString() {
        return "\nCLIENTE JURIDICO:\n " + super.toString() + "\nNombre del Contacto: " + this.nombreDelContacto
                + "\nTelefono del Contacto: " + this.telefonoDelContacto;
    }
}