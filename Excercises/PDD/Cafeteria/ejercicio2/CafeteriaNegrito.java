package Cafeteria.ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class CafeteriaNegrito {
    public static void main(String[] args) {
        Cafe expreso = new CafeExpreso();
        Cafe tostadoNegro = new CafeTostadoNegro();
        Cafe batido = new CafeBatido();
        Cafe descafeinado = new CafeDescafeinado();

        // cafe expreso sin decorado
        System.out.println(expreso.getDescripcion() + " Costo: " + expreso.getCosto());
        // cafe tostado negro con decorado
        Cafe tostadoNegroMoca = new ComplementoMoca(tostadoNegro);
        Cafe tostadoNegroMocaCrema = new ComplementoCrema(tostadoNegroMoca);
        System.out.println(tostadoNegroMocaCrema.getDescripcion() + ", Costo: " + tostadoNegroMocaCrema.getCosto());
        // cafe batido con decorado
        Cafe batidoSoya = new ComplementoSoya(batido);
        Cafe batidoSoyaMoca = new ComplementoMoca(batidoSoya);
        Cafe batidoSoyaMocaCrema = new ComplementoCrema(batidoSoyaMoca);
        System.out.println(batidoSoyaMocaCrema.getDescripcion() + ", Costo: " + batidoSoyaMocaCrema.getCosto());
        // cafe descafeinado con decorado
        Cafe descafeinadoLeche = new ComplementoLeche(descafeinado);
        Cafe descafeinadoLecheMoca = new ComplementoMoca(descafeinadoLeche);
        Cafe descafeinadoLecheMocaCrema = new ComplementoCrema(descafeinadoLecheMoca);
        Cafe descafeinadoLecheMocaCremaSoya = new ComplementoSoya(descafeinadoLecheMocaCrema);
        System.out.println(descafeinadoLecheMocaCremaSoya.getDescripcion() + ", Costo: " + descafeinadoLecheMocaCremaSoya.getCosto());
    }
}