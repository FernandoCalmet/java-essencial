package EjerciciosLaboratorio.src.Ejercicio3;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class VideoJuego {
    private String titulo;
    private int horasEstimadas;
    // private boolean entregado = false;
    private String genero;
    private String compania;

    public VideoJuego() {
        this.titulo = "No hay ningun titulo seleccionado";
        this.horasEstimadas = 10;
        this.genero = "No hay ningun genero seleccionado";
        this.compania = "No hay ninguna compañia seleccionada";
    }

    public VideoJuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = "No hay ningun genero seleccionado";
        this.compania = "No hay ninguna compañia seleccionada";
    }

    public VideoJuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "\nTitulo: " + getTitulo() + "\nHoras estimadas: " + getHorasEstimadas() + "\nGenero: " + getGenero()
                + "\nCompañia: " + getCompania();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

}
