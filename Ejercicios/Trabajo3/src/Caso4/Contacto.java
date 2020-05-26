package Caso4;

/**
 *
 * @author fernandocalmet
 */
public class Contacto 
{
    private int dni;
    private String nombres;
    private int telefono;
    private String direccion;
   
    public Contacto(int dni, String nombres, int telefono, String direccion) {
        this.dni = dni;
        this.nombres = nombres;
        this.telefono = telefono;
        this.direccion = direccion;
    }      
    
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString()
    {
        return "\nDNI: "+getDni()+"\nNombres: "+getNombres()+"\nTelefono: "+getTelefono()+"\nDireccion: "+getDireccion()+"\n";
    }
}
