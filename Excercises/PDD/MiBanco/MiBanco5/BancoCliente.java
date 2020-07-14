package MiBanco.MiBanco5;

import java.util.Scanner;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public class BancoCliente {
    private int numeroCuenta;
    private int opcion;
    private Scanner scanner;
    private Banco banco;

    public BancoCliente(Scanner scanner, Banco banco) {
        this.banco = banco;
        this.scanner = scanner;
    }

    public void run() {
        do {
            System.out.println("\n0 = Salir del programa\n1 = Crear cuenta\n2 = Seleccionar cuenta"
                    + "\n3 = Deposito a cuenta\n4 = Verificar solicitud de prestamo\n5 = Mostrar balance de cuentas"
                    + "\n6 = Agregar interes\nINGRESA UNA OPCIÓN DEL MENÚ: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 0:
                    salir();
                    break;
                case 1:
                    nuevaCuenta();
                    break;
                case 2:
                    seleccionar();
                    break;
                case 3:
                    depositar();
                    break;
                case 4:
                    autorizarPrestamo();
                    break;
                case 5:
                    mostrar();
                    break;
                case 6:
                    agregarInteres();
                    break;
                default:
                    System.out.println("\nComando ilegal!");
            }
        } while (opcion < 8);
    }

    private void salir() {
        System.out.println("\nGracias por su preferencia, hasta luego!");
        System.exit(0);
    }

    private void nuevaCuenta() {
        System.out.println("\nTipos de cuenta: 1 = Cuenta Corriente, 2 = Cuenta de Ahorros"
                + "\nINGRESAR EL TIPO DE CUENTA QUE DESEA CREAR: ");
        int tipo = scanner.nextInt();

        if (tipo == 1 || tipo == 2) {
            System.out.println("\nSe creo la cuenta Nro. " + banco.nuevaCuenta(tipo));
        } else {
            System.out.println("\nComando ilegal!");
        }
    }

    private void seleccionar() {
        System.out.print("Ingresa el numero de cuenta: ");
        this.numeroCuenta = scanner.nextInt();
        int balance = banco.getBalance(this.numeroCuenta);
        System.out.println("\nEl balance de la cuenta " + this.numeroCuenta + " es " + balance);
    }

    private void depositar() {
        System.out.print("Ingresa la cantidad a depositar: ");
        int monto = scanner.nextInt();
        banco.depositar(monto);
    }

    private void autorizarPrestamo() {
        System.out.print("Ingresa la cantidad a prestar: ");
        int montoPrestamo = scanner.nextInt();
        if (banco.autorizarPrestamo(this.numeroCuenta, montoPrestamo))
            System.out.println("Tu prestamo ha sido aprobado.");
        else
            System.out.println("Tu prestamo ha sido denegado.");
    }

    private void mostrar() {
        System.out.println(banco.toString());
    }

    private void agregarInteres() {
        banco.agregarInteres();
    }
}