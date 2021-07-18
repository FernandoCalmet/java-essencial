package Excercises.POO.UPAO.Aseguradora.accesoDatos;

import java.util.ArrayList;

import Excercises.POO.UPAO.Aseguradora.entidades.Agenda;
import Excercises.POO.UPAO.Aseguradora.entidades.Contacto;
import Excercises.POO.UPAO.Aseguradora.entidades.ContactoEstudio;
import Excercises.POO.UPAO.Aseguradora.entidades.ContactoFamilia;
import Excercises.POO.UPAO.Aseguradora.entidades.ContactoProfesional;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class BaseDatos {
    private static Agenda agenda;
    private static ArrayList<Contacto> contactos;
    private static ArrayList<ContactoFamilia> contactosFamilia;
    private static ArrayList<ContactoProfesional> contactosProfesional;
    private static ArrayList<ContactoEstudio> contactosEstudio;

    public BaseDatos() {
        agenda = new Agenda();
        contactos = new ArrayList<Contacto>();
        contactosFamilia = new ArrayList<ContactoFamilia>();
        contactosProfesional = new ArrayList<ContactoProfesional>();
        contactosEstudio = new ArrayList<ContactoEstudio>();
    }

    public void crearAgenda(String propietario, int año) {
        agenda.setPropietario(propietario);
        agenda.setAño(año);
        agenda.setContactos(contactos);
    }

    public void crearContacto(Contacto contacto) {
        agenda.addContacto(contacto);
        if (contacto instanceof ContactoFamilia) {
            contactosFamilia.add((ContactoFamilia) contacto);
        } else if (contacto instanceof ContactoProfesional) {
            contactosProfesional.add((ContactoProfesional) contacto);
        } else if (contacto instanceof ContactoEstudio) {
            contactosEstudio.add((ContactoEstudio) contacto);
        }
    }

    public String buscarContactoPorNombres(String nombres) {
        String busqueda = "";
        for (Contacto contacto : agenda.getContactos()) {
            if (contacto.getNombres().equals(nombres)) {
                busqueda = contacto.toString();
            }
        }

        return busqueda;
    }

    public boolean actualizarTelefonoContacto(String nombre, String telefono) {
        boolean estado = false;
        for (Contacto contacto : agenda.getContactos()) {
            if (contacto.getNombres().equals(nombre)) {
                contacto.setTelefono(telefono);
                estado = true;
            }
        }
        return estado;
    }

    public boolean actualizarDireccionContacto(String nombre, String direccion) {
        boolean estado = false;
        for (Contacto contacto : agenda.getContactos()) {
            if (contacto.getNombres().equals(nombre)) {
                if (contacto instanceof ContactoEstudio) {
                    ((ContactoEstudio) contacto).setDireccion(direccion);
                    estado = true;
                }
            }
        }
        return estado;
    }

    public boolean eliminarContacto(String nombre) {
        boolean estado = false;
        for (Contacto contacto : agenda.getContactos()) {
            if (contacto.getNombres().equals(nombre)) {
                agenda.removeContacto(contacto);
                estado = true;
            }
        }
        return estado;
    }

    public String consultarAgenda() {
        return agenda.toString();
    }
}