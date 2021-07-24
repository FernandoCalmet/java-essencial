package Excercises.POO.UPAO.Matrices.ejercicio3.logica;

public class Matriz {

    // ATRIBUTOS
    private Integer M[][];
    private Integer nroFilas;
    private Integer nroColumnas;

    // CONSTRUCTOR
    public Matriz() { /* constructor sin parametros */
        /* para inicializar los valores */
        M = new Integer[3][3];
    }

    public Matriz(Integer nroFilas, Integer nroColumnas) {/* constructor con parametros */
        M = new Integer[nroFilas][nroColumnas];
        this.setNroFilas(nroFilas);
        this.setNroColumnas(nroColumnas);
    }

    // METODOS
    /* set es para asignar */
    public void setValor(Integer fila, Integer columna, Integer x) {
        M[fila][columna] = x;
    }
    /* get es para retornar */

    public Integer getValor(Integer fila, Integer columna) {
        return M[fila][columna];
    }

    public Integer getNroColumnas() {
        return nroColumnas;
    }

    public void setNroColumnas(Integer nroColumnas) {
        this.nroColumnas = nroColumnas;
    }

    public Integer getNroFilas() {
        return nroFilas;
    }

    public void setNroFilas(Integer nroFilas) {
        this.nroFilas = nroFilas;
    }
}