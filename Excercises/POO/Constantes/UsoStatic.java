package Constantes;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class UsoStatic {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Fernando");
        System.out.println(usuario1.getDatos());

        Usuario usuario2 = new Usuario("Andres");
        System.out.println(usuario2.getDatos());

        Usuario usuario3 = new Usuario("Enki");
        System.out.println(usuario3.getDatos());
    }
}

class Usuario {
    private static int id;
    private static int idSiguiente = 1;
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
        id = idSiguiente++;
    }

    public String getDatos() {
        return "Id: " + id + " Nombre: " + nombre;
    }
}
