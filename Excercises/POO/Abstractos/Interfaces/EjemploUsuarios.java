package Excercises.POO.Abstractos.Interfaces;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class EjemploUsuarios {
    public static void main(String[] args) {
        IUsuario usuario1 = new Usuario();
        usuario1.setNombre("Fernando");
        usuario1.setCorreo("fernando@test.com");
        System.out.println(usuario1.toString());

        IUsuario usuario2 = new Usuario();
        usuario2.setNombre("Stefani");
        usuario2.setCorreo("stefani@test.com");
        System.out.println(usuario2.toString());
    }
}

class Usuario implements IUsuario {
    private String nombre;
    private String correo;

    public Usuario(){
        
    }

    public Usuario(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "\n[USUARIO]: \nNombre: " + getNombre() + "\nCorreo: " + getCorreo();
    }
}

interface IUsuario {
    public String getNombre();

    public void setNombre(String nombre);

    public String getCorreo();

    public void setCorreo(String correo);

    public String toString();
}