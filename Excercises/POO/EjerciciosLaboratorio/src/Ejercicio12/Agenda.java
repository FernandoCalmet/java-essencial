package EjerciciosLaboratorio.src.Ejercicio12;

import java.util.ArrayList;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Agenda {

    private ArrayList<Contacto> contacto;
    private int numero;
    private String propietario;

    public Agenda(ArrayList<Contacto> contacto, int numero, String propietario) {
        this.contacto = contacto;
        this.numero = numero;
        this.propietario = propietario;
    }

    public ArrayList<Contacto> getContacto() {
        return contacto;
    }

    public void setContacto(ArrayList<Contacto> contacto) {
        this.contacto = contacto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String buscarPorDni(ArrayList<Contacto> contacto, String dni) {
        String resultado = "";
        for (Contacto item : contacto) {
            if (item.getDni().equalsIgnoreCase(dni)) {
                resultado = "\nDNI: " + item.getDni() + "\nNombres: " + item.getNombres() + "\nTelefono: "
                        + item.getTelefono() + "\nDireccion: " + item.getDireccion() + "\n";
            }
        }

        if (resultado.isEmpty()) {
            resultado = "No existe un contacto con ese numero de DNI.";
        }

        return resultado;
    }

    @Override
    public String toString() {
        return "\nAgenda #" + this.numero + ": " + this.contacto;
    }
}
