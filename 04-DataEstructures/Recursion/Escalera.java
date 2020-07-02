public class Escalera {
    public static void main(String[] args) {
        bajarEscalera(5);
    }

    public static void bajarEscalera(int escalones) {
        if (escalones == 0) {
            // Caso base, respuesta explicita
            System.out.println("Has terminado de bajar la escalera.");
        } else {
            // Dominio, problema -1
            System.out.println("Bajando escalon " + escalones);
            bajarEscalera(escalones - 1);
        }
    }
}