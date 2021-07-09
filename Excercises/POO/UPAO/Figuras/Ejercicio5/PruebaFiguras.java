package Excercises.POO.UPAO.Figuras.Ejercicio5;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PruebaFiguras {

    public static void main(String[] args) {
        Figura3D oCi1 = new Cilindro("Cilindro 1", 5, 10, 4, 2.6);
        Figura3D oCi2 = new Cilindro("Cilindro 2", 6, 14, 8, 4.2);
        Figura3D oCo1 = new Cono("Cono 1", 4, 2, 6, 4.2);
        Figura3D oCo2 = new Cono("Cono 2", 50, 45, 30, 6.6);
        Figura3D oEs1 = new Esfera("Esfera 1", 12, 45, 8, 12.5);
        Figura3D oEs2 = new Esfera("Esfera 2", 15, 30, 25, 5.5);

        BaseDatosFiguras bdFiguras = new BaseDatosFiguras();
        bdFiguras.agregarFigura3D(oCi1);
        bdFiguras.agregarFigura3D(oCi2);
        bdFiguras.agregarFigura3D(oCo1);
        bdFiguras.agregarFigura3D(oCo2);
        bdFiguras.agregarFigura3D(oEs1);
        bdFiguras.agregarFigura3D(oEs2);
        System.out.println(bdFiguras.listarFiguras3D());
        System.out.println("Figuras encontradas: " + bdFiguras.buscarFiguras3D(12.5));
    }
}
