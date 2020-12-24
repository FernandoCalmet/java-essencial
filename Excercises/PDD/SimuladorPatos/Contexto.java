package Excercises.PDD.SimuladorPatos;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Contexto {
    public IPato pato;

    public void setStrategy(IPato pato) {
        this.pato = pato;
    }

    public String descripcion() {
        return this.pato.descripcion();
    }

    public String cuaquear() {
        return this.pato.cuaquear();
    }

    public String nadar() {
        return this.pato.nadar();
    }

    public String mostrar() {
        return this.pato.mostrar();
    }
}