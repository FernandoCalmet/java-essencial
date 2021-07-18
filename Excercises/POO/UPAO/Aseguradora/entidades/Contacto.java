package Excercises.POO.UPAO.Aseguradora.entidades;

import java.util.ArrayList;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public abstract class Contacto {
    private ArrayList<ContactoProfesional> contactosProfesionales;
    private ArrayList<ContactoFamilia> contactosFamiliares;
    private ArrayList<ContactoEstudio> contactosEstudios;

    public Contacto() {
    }

    public abstract String getNombres();

    public abstract void setTelefono(String telefono);

    public ArrayList<ContactoProfesional> getContactoProfesional() {
        return contactosProfesionales;
    }

    public void setContactoProfesional(ArrayList<ContactoProfesional> contactosProfesionales) {
        this.contactosProfesionales = contactosProfesionales;
    }

    public ArrayList<ContactoFamilia> getContactoFamilia() {
        return contactosFamiliares;
    }

    public void setContactoFamilia(ArrayList<ContactoFamilia> contactosFamiliares) {
        this.contactosFamiliares = contactosFamiliares;
    }

    public ArrayList<ContactoEstudio> getContactoEstudio() {
        return contactosEstudios;
    }

    public void setContactoEstudio(ArrayList<ContactoEstudio> contactosEstudios) {
        this.contactosEstudios = contactosEstudios;
    }

    @Override
    public String toString() {
        return "Contactos: " + contactosProfesionales + contactosFamiliares + contactosEstudios;
    }
}
