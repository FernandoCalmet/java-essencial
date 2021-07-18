package Excercises.POO.UPAO.Aseguradora.entidades;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class ContactoEstudio extends Contacto {
    private String nombres;
    private String lugarTrabajo;
    private String telefono;
    private String direccion;

    public ContactoEstudio() {
    }

    public ContactoEstudio(String nombres, String lugarTrabajo, String telefono, String direccion) {
        this.nombres = nombres;
        this.lugarTrabajo = lugarTrabajo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    @Override
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getLugarTrabajo(String lugarTrabajo) {
        return lugarTrabajo;
    }

    public void setLugarTrabajo(String lugarTrabajo) {
        this.lugarTrabajo = lugarTrabajo;
    }

    public String getTelefono(String telefono) {
        return telefono;
    }

    @Override
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion(String direccion) {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Contactos de Estudios{" + "nombres=" + nombres + ", lugarTrabajo=" + lugarTrabajo + ", telefono="
                + telefono + ", direccion=" + direccion + '}';
    }
}
