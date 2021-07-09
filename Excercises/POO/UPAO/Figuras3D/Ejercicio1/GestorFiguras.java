package Excercises.POO.UPAO.Figuras3D.Ejercicio1;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class GestorFiguras {

    public Figuras crearCilindro(double r, double h) {
        return new Cilindro(r, h);
    }

    public Figuras modificarCilindro(Object c, double r, double h) {
        Cilindro cilindro = (Cilindro) c;
        cilindro.setRadio(r);
        cilindro.setAltura(h);
        return cilindro;
    }

    public Figuras crearCono(double r, double h, double g) {
        return new Cono(r, h, g);
    }

    public Figuras modificarCono(Object c, double r, double h, double g) {
        Cono cono = (Cono) c;
        cono.setRadio(r);
        cono.setAltura(h);
        cono.setGeneratriz(g);
        return cono;
    }

    public Figuras crearCubo(double l) {
        return new Cubo(l);
    }

    public Figuras modificarCubo(Object c, double l) {
        Cubo cubo = (Cubo) c;
        cubo.setLado(l);
        return cubo;
    }

    public Figuras crearEsfera(double r) {
        return new Esfera(r);
    }

    public Figuras modificarEsfera(Object e, double r) {
        Esfera esfera = (Esfera) e;
        esfera.setRadio(r);
        return esfera;
    }
}