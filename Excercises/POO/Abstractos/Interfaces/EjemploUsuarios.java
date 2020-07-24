package Abstractos.Interfaces;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class EjemploUsuarios {
    private static IUsuario usuario;

    public static void main(String[] args) {
        usuario = new Usuario();
        usuario.setNombre("Fernando");
        usuario.setCorreo("fercalmet@gmail.com");
        System.out.println(usuario.toString());
    }
}

class Usuario implements IUsuario {
    private String nombre;
    private String correo;

    public Usuario() {

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
        return "\nUSUARIO: \nNombre: " + getNombre() + "\nCorreo: " + getCorreo();
    }
}

interface IUsuario {
    public String getNombre();

    public void setNombre(String nombre);

    public String getCorreo();

    public void setCorreo(String correo);

    public String toString();
}