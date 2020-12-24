package Excercises.PDD.MiBanco.MiBanco2;

import java.util.Scanner;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class BancoCliente {
    private static Banco banco;
    private static Scanner scanner;
    private static int opcion;
    private static int accountNumber;

    public static void main(String[] args) {
        banco = new Banco();
        scanner = new Scanner(System.in);

        do {
            System.out.print("\n" + "\n0 = Salir del programa" + "\n1 = Crear cuenta" + "\n2 = Seleccionar cuenta"
                    + "\n3 = Deposito de cuenta" + "\n4 = Prestamo de cuenta" + "\n5 = Mostrar estado de una cuenta"
                    + "\n6 = Ver interes de cuenta\n" + "Ingresa una opcion del menu:");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 0:
                    banco.salir();
                    break;
                case 1:
                    banco.crearCuenta();
                    break;
                case 2:
                    System.out.println("\nIngresar el numero de cuenta que desea seleccionar: ");
                    accountNumber = scanner.nextInt();
                    banco.seleccionarCuenta(accountNumber);
                    break;
                case 3:
                    System.out.println("\nIngrese la cantidad a depositar: ");
                    int amount = scanner.nextInt();
                    banco.depositoCuenta(amount);
                    break;
                case 4:
                    System.out.println("\nIngresa la cantidad a prestar: ");
                    int loanamount = scanner.nextInt();
                    banco.prestamoCuenta(loanamount);
                    break;
                case 5:
                    banco.mostrarEstadosCuentas();
                    break;
                case 6:
                    banco.interesCuenta();
                    break;
                default:
                    System.out.println("\nComando ilegal!");
            }
        } while (opcion < 8);
    }
}