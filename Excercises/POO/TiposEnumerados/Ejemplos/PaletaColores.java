package Excercises.POO.TiposEnumerados.Ejemplos;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PaletaColores {
    enum Colores {
        ROJO, VERDE, AZUL
    };

    enum ColoresSecundarios {
        YELLOW("Amarillo"), PURPLE("Morado"), ORANGE("Anaranjado");

        private String color;

        private ColoresSecundarios(String color) {
            this.color = color;
        }

        public String Estado() {
            return this.color;
        }
    }

    public static void main(String[] args) {
        // Insertar elementos en una variable de tipo enumerado
        Colores r = Colores.ROJO;
        Colores g = Colores.VERDE;
        Colores b = Colores.AZUL;
        // Mostrar datos de los elementos de la variable de tipo enumerado
        System.out.println("Mis colores primarios son " + r.name() + ", " + g.name() + ", " + b.name());

        // Insertar elementos en un metodo de tipo enumerado
        ColoresSecundarios paleta1 = Enum.valueOf(ColoresSecundarios.class, "YELLOW");
        ColoresSecundarios paleta2 = Enum.valueOf(ColoresSecundarios.class, "PURPLE");
        ColoresSecundarios paleta3 = Enum.valueOf(ColoresSecundarios.class, "ORANGE");
        // Mostrar datos de los elementos del metodo de tipo enumerado
        System.out.println("Paleta 1: " + paleta1.Estado());
        System.out.println("Paleta 2: " + paleta2.Estado());
        System.out.println("Paleta 3: " + paleta3.Estado());
    }
}