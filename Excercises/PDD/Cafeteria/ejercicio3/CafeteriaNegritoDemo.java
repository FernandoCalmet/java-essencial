package Cafeteria.ejercicio3;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class CafeteriaNegritoDemo {
    public static void main(String[] args) {
        // Crear cafes
        ICoffee expreso = new Expreso();
        ICoffee tostadoNegro = new TostadoNegro();
        ICoffee batido = new Batido();
        ICoffee descafeinado = new Descafeinado();

        // Seleccionar decorado para cafe expreso
        // Mostrar el estado del cafe expreso
        System.out.println(expreso.getDescription() + ", Costo: $" + expreso.getCost());

        // Seleccionar decorado para cafe tostado negro
        ICoffee tostadoNegroMoca = new Moca(tostadoNegro);
        ICoffee tostadoNegroMocaCrema = new Crema(tostadoNegroMoca);
        // Mostrar el estado del cafe tostado negro
        System.out.println(tostadoNegroMocaCrema.getDescription() + ", Costo: $" + tostadoNegroMocaCrema.getCost());

        // Seleccionar decorado para cafe batido
        ICoffee batidoSoya = new Soya(batido);
        ICoffee batidoSoyaMoca = new Moca(batidoSoya);
        ICoffee batidoSoyaMocaCrema = new Crema(batidoSoyaMoca);
        // Mostrar el estado del cafe batido
        System.out.println(batidoSoyaMocaCrema.getDescription() + ", Costo: $" + batidoSoyaMocaCrema.getCost());

        // Seleccionar decorado para cafe descafeinado
        ICoffee descafeinadoLeche = new Leche(descafeinado);
        ICoffee descafeinadoLecheMoca = new Moca(descafeinadoLeche);
        ICoffee descafeinadoLecheMocaCrema = new Crema(descafeinadoLecheMoca);
        ICoffee descafeinadoLecheMocaCremaSoya = new Soya(descafeinadoLecheMocaCrema);
        // Mostrar el estado del cafe descafeinado
        System.out.println(descafeinadoLecheMocaCremaSoya.getDescription() + ", Costo: $"
                + descafeinadoLecheMocaCremaSoya.getCost());
    }
}