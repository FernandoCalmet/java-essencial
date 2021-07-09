package Excercises.POO.UPAO.Figuras.Ejercicio6;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
import java.util.ArrayList;

public class BaseDatosFiguras {

    private ArrayList<Figura3D> figuras;

    public BaseDatosFiguras() {
        this.figuras = new ArrayList<>();
    }

    public String agregarFigura3D(Figura3D oF) {
        this.figuras.add(oF);

        return this.figuras.toString();
    }

    public String listarFiguras3D() {
        return this.figuras.toString();
    }

    public ArrayList buscarFiguras3D(double radio) {
        ArrayList listaFiguras = new ArrayList();
        for (Figura3D figura : this.figuras) {
            if (figura.getRadio() == radio) {
                listaFiguras.add(figura);
            } else {
                System.out.println("No se encontro ninguna figura con ese radio.");
            }
        }

        return listaFiguras;
    }
}
