package Ejemplo1;

/**
 *
 * @author fernandocalmet
 */
public class Usuarios 
{
    public static void main(String[]args)
    {
        //Las clases abstractas no se pueden instanciar
        //Crear objeto de la clase Gerente
        Gerente empleado1 = new Gerente("Fernando","12341234");
        //Crear objeto de la clase Supervisor
        Supervisor empleado2 = new Supervisor("Andres","99998888");
        //Ver datos del objetos instanciados
        System.out.println(empleado1.verPerfil());
        System.out.println(empleado2.verPerfil());
        
    }
}

abstract class Usuario
{
    public abstract String verPerfil();
}

abstract class Empleado extends Usuario
{
    public abstract String verPerfil();
}

class Gerente extends Empleado
{
    private String nombre;
    private String dni;

    public Gerente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    } 
    
    public String verPerfil()
    {
        return "\nGerente:\nNombre: "+this.nombre+"\nDNI: "+this.dni;
    }
}

class Supervisor extends Empleado
{
    private String nombre;
    private String dni;

    public Supervisor(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    } 
    
    public String verPerfil()
    {
        return "\nSupervisor:\nNombre: "+this.nombre+"\nDNI: "+this.dni;
    }
}