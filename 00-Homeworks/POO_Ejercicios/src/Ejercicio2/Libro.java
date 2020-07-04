package Ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public class Libro {
    private int codigo;
    private static int contador = 1;
    private String titulo;
    private String autor;
    private String editorial;
    private int nroPag;

    public Libro() {
        this.codigo = contador++;
        this.titulo = "Programación con Java";
        this.autor = "Luis Joyanes Aguilar";
        this.editorial = "Prentice-Hall, 11 Abril de 2011";
        this.nroPag = 1200;
    }

    public Libro(String titulo, String autor, String editorial, int nroPag) {
        this.codigo = contador++;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.nroPag = nroPag;
    }

    @Override
    public String toString() {
        return "\nCodigo: " + "L" + this.codigo + "\nTitulo: " + this.titulo + "\nAutor: " + this.autor
                + "\nEditorial: " + this.editorial + "\nNumero de paginas: " + this.nroPag;
    }

    public void ModificarPaginas(int nroPag) {
        this.nroPag = nroPag;
    }

    public int MostrarPaginas() {
        return this.nroPag;
    }

    public void ModificarEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String MostrarEditorial() {
        return this.editorial;
    }
}
