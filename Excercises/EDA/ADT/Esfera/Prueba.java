package Excercises.EDA.ADT.Esfera;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Prueba {
    public static void main(String[] args) {
        EsferaTDA esfera = new EsferaTDA(3);
        System.out.println("Radio: " + esfera.getRadio());
        System.out.println("Diametro: " + esfera.getDiametro());
        System.out.println("Circunferencia: " + esfera.getCircunferencia());
        System.out.println("Volumen: " + esfera.getVolumen());
        System.out.println("Area: " + esfera.getArea());
    }
}