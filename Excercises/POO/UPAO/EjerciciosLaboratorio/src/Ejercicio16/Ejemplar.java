package Excercises.POO.UPAO.EjerciciosLaboratorio.src.Ejercicio16;

public class Ejemplar {

    private int codigo;
    private static int contador = 1;
    private String titulo;
    private int nroPag;
    private String autor;
    private String estado;

    public Ejemplar(String titulo, int nroPag, String autor) {
        this.codigo = contador++;
        this.titulo = titulo;
        this.nroPag = nroPag;
        this.autor = autor;
        this.estado = "Disponible";
    }

    public int ObtenerCodigo() {
        return this.codigo;
    }

    public String Prestar() {
        this.estado = "Prestado";
        return this.estado;
    }

    public String Devolver() {
        this.estado = "Disponible";
        return this.estado;
    }

    public String MostrarDatos() {
        return "Ejemplar " + this.codigo + "{" + "titulo=" + titulo + ", nroPag=" + nroPag + ", autor=" + autor + ", estado=" + estado + '}';
    }

    public void ModificarPaginas(int nroPag) {
        this.nroPag = nroPag;
    }

    public int MostrarPaginas() {
        return this.nroPag;
    }

    public String MostrarEjemplar(Ejemplar ejemplar) {
        return "Ejemplar " + ejemplar.codigo + "{" + "titulo=" + ejemplar.titulo + ", nroPag=" + ejemplar.nroPag + ", autor=" + ejemplar.autor + ", estado=" + ejemplar.estado + '}';
    }
}
