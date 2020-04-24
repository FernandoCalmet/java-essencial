package Caso4;

import java.util.ArrayList;

/**
 *
 * @author fernandocalmet
 */
public class Agenda 
{
    private static ArrayList<Contacto> contacto;
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
    
    public String buscarPorDni(Contacto contacto, int dni)
    {
        if(contacto.getDni() == dni)
        {
            return "\nDNI: "+contacto.getDni()+"\nNombres: "+contacto.getNombres()+"\nTelefono: "+contacto.getTelefono()+"\nDireccion: "+contacto.getDireccion()+"\n";
        }
        else
        {
            return "No existe un contacto con ese numero de DNI.";
        }
    }
    
    @Override
    public String toString()
    {
        return "\nAgenda #"+this.numero+": "+this.contacto;
    }
}
