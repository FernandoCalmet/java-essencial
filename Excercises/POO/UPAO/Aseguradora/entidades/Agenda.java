package Excercises.POO.UPAO.Aseguradora.entidades;

import java.util.ArrayList;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Agenda {
    private String propietario;
    private int año;
    private ArrayList<Contacto> contactos;

    public Agenda(){  
    }

    public String getPropietario(){
        return propietario;
    }

    public void setPropietario(String propietario){
        this.propietario = propietario;
    }

    public int getAño(){
        return año;
    }

    public void setAño(int año){
        this.año = año;
    }

    public ArrayList<Contacto> getContactos(){
        return contactos;
    }

    public void setContactos(ArrayList<Contacto> contactos){
        this.contactos = contactos;
    }

    public void addContacto(Contacto contacto){
        contactos.add(contacto);
    }

    public void removeContacto(Contacto contacto){
        contactos.remove(contacto);
    }

    @Override
    public String toString(){
        return "Agenda{" + "propietario=" + propietario + ", año=" + año + ", contactos=" + contactos + '}';
    }
}
