package Ejercicio1;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Teclado {
    private String marca;
    private int canTeclas;
    private int tipo;

    public Teclado() {
        this.marca = "ABC";
        this.canTeclas = 102;
        this.tipo = 3;
    }

    public Teclado(String marca, int canTeclas, int tipo) {
        this.marca = marca;
        this.canTeclas = canTeclas;
        this.tipo = tipo;
    }

    public void CambiarTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "\nMarca: " + this.marca + "\nCantidad de Teclas: " + this.canTeclas + "\nTipo: " + this.tipo;
    }

    public String MostrarTipo() {
        String configuracion = "Por Defecto";
        if (this.tipo == 1) {
            configuracion = "Español";
        }
        if (this.tipo == 2) {
            configuracion = "Latinoamericano";
        }
        if (this.tipo == 3) {
            configuracion = "EEUU";
        }
        return "El teclado esta en tipo " + configuracion;
    }
}
