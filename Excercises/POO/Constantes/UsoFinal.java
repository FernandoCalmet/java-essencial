package Excercises.POO.Constantes;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class UsoFinal {
    public static void main(String[] args) {
        Foco foco = new Foco(false);
        System.out.println("Estado inicial del foco: " + foco.getEstado());
        System.out.println("Estado del foco: " + foco.getEstado());
        foco.setApagar(false);
        System.out.println("Estado final del foco: " + foco.getEstado());
    }
}

class Foco {
    private final boolean estado = true;

    public Foco(boolean estado) {
        estado = false;
    }

    public void setApagar(boolean estado) {
        estado = false;
    }

    public boolean getEstado() {
        return estado;
    }
}
