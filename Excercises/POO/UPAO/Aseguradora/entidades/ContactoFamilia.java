package Excercises.POO.UPAO.Aseguradora.entidades;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class ContactoFamilia extends Contacto{
    private String nombres;
    private String parentesco;
    private String telefono;

    public ContactoFamilia() {
    }

    public ContactoFamilia(String nombres, String parentesco, String telefono) {
        this.nombres = nombres;
        this.parentesco = parentesco;
        this.telefono = telefono;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;

    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Contactos de Familiares{" + "nombres='" + nombres + '\'' + ", parentesco='" + parentesco + '\''
                + ", telefono='" + telefono + '\'' + '}';
    }
}
