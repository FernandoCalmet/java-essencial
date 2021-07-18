package Excercises.POO.UPAO.Aseguradora.entidades;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class ContactoProfesional extends Contacto {
    private String nombres;
    private String profesion;
    private String telefono;

    public ContactoProfesional() {
    }

    public ContactoProfesional(String nombres, String profesion, String telefono) {
        this.nombres = nombres;
        this.profesion = profesion;
        this.telefono = telefono;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getProfesion(String profesion) {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getTelefono(String telefono) {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Contactos de Profesionales{" + "nombres='" + nombres + '\'' + ", profesion='" + profesion + '\''
                + ", telefono='" + telefono + '\'' + '}';
    }
}
