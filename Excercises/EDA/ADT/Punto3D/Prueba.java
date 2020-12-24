package Excercises.EDA.ADT.Punto3D;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Prueba {
    public static void main(String[] args) {
        Punto objPunto = new Punto();
        objPunto.setX(54);
        objPunto.setY(12);
        objPunto.setZ(20);
        objPunto.setDimension("3D");

        System.out.println("Dimension: " + objPunto.getDimension());
        System.out.println("Coordenada X: " + objPunto.getX());
        System.out.println("Coordenada Y: " + objPunto.getY());
        System.out.println("Coordenada Z: " + objPunto.getZ());
    }
}