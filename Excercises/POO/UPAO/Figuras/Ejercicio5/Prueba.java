package Excercises.POO.UPAO.Figuras.Ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Prueba {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        GestorFiguras figuras = new GestorFiguras();
        int opcion = 0;
        String pregunta;
        double radio, altura, generatriz, lado;

        do {
            System.out.println("\n** MENU ** ");
            System.out.println("0 = Salir del programa");
            System.out.println("1 = Crear una figura esfera");
            System.out.println("2 = Crear una figura cono");
            System.out.println("3 = Crear una figura cubo");
            System.out.println("4 = Crear una figura cilindro");
            System.out.println("Ingresar el valor de una opcion del menu: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 0:
                    System.out.println("El programa finalizo con exito.");
                    System.exit(0);
                    break;
                case 1:
                    // Crear Figura Esfera
                    System.out.println("** FIGURA ESFERA **");
                    System.out.println("Ingresar el Radio: ");
                    radio = scanner.nextDouble();
                    Figuras esfera = figuras.crearEsfera(radio);
                    System.out.println(esfera.toString());
                    // Preguntar si desea modificar la figura
                    do {
                        System.out.println("¿Desea modificar los valores de la figura? Si/No");
                        pregunta = scanner.next();
                        if (pregunta.toLowerCase().equals("si")) {
                            System.out.println("Ingresar el Radio: ");
                            radio = scanner.nextDouble();
                            esfera = figuras.modificarEsfera(esfera, radio);
                            System.out.println(esfera.toString());
                        }
                    } while (!pregunta.equals("no"));
                    break;
                case 2:
                    // Crear Figura Cono
                    System.out.println("** FIGURA CONO **");
                    System.out.println("Ingresar el Radio: ");
                    radio = scanner.nextDouble();
                    System.out.println("Ingresar la Altura: ");
                    altura = scanner.nextDouble();
                    System.out.println("Ingresar la Generatriz: ");
                    generatriz = scanner.nextDouble();
                    Figuras cono = figuras.crearCono(radio, altura, generatriz);
                    System.out.println(cono.toString());
                    // Preguntar si desea modificar la figura
                    do {
                        System.out.println("¿Desea modificar los valores de la figura? Si/No");
                        pregunta = scanner.next();
                        if (pregunta.toLowerCase().equals("si")) {
                            System.out.println("Ingresar el Radio: ");
                            radio = scanner.nextDouble();
                            System.out.println("Ingresar la Altura: ");
                            altura = scanner.nextDouble();
                            System.out.println("Ingresar la Generatriz: ");
                            generatriz = scanner.nextDouble();
                            cono = figuras.modificarCono(cono, radio, altura, generatriz);
                            System.out.println(cono.toString());
                        }
                    } while (!pregunta.equals("no"));
                    break;
                case 3:
                    // Crear Figura Cubo
                    System.out.println("** FIGURA CUBO **");
                    System.out.println("Ingresar el Lado: ");
                    lado = scanner.nextDouble();
                    Figuras cubo = figuras.crearCubo(lado);
                    System.out.println(cubo.toString());
                    // Preguntar si desea modificar la figura
                    do {
                        System.out.println("¿Desea modificar los valores de la figura? Si/No");
                        pregunta = scanner.next();
                        if (pregunta.toLowerCase().equals("si")) {
                            System.out.println("Ingresar el Lado: ");
                            lado = scanner.nextDouble();
                            cubo = figuras.modificarCubo(cubo, lado);
                            System.out.println(cubo.toString());
                        }
                    } while (!pregunta.equals("no"));
                    break;
                case 4:
                    // Crear Figura Cilindro
                    System.out.println("** FIGURA CILINDRO **");
                    System.out.println("Ingresar el Radio: ");
                    radio = scanner.nextDouble();
                    System.out.println("Ingresar la Altura: ");
                    altura = scanner.nextDouble();
                    Figuras cilindro = figuras.crearCilindro(radio, altura);
                    System.out.println(cilindro.toString());
                    // Preguntar si desea modificar la figura
                    do {
                        System.out.println("¿Desea modificar los valores de la figura? Si/No");
                        pregunta = scanner.next();
                        if (pregunta.toLowerCase().equals("si")) {
                            System.out.println("Ingresar el Radio: ");
                            radio = scanner.nextDouble();
                            System.out.println("Ingresar la Altura: ");
                            altura = scanner.nextDouble();
                            cilindro = figuras.modificarCilindro(cilindro, radio, altura);
                            System.out.println(cilindro.toString());
                        }
                    } while (!pregunta.equals("no"));
                    break;
                default:
                    System.out.println("Opcion no permitida.");
                    opcion = 0;
                    break;
            }
        } while (opcion < 5);
    }
}