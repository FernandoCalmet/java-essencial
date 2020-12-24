package Excercises.PDD.MiBanco.MiBanco1;

import java.util.*;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class MiBanco {
    private HashMap<Integer, Integer> cuentas = new HashMap<>();
    private double tasa = 0.01;
    private int nextacct = 0;
    private int actual = 0;
    private Scanner scanner;
    private boolean done = false;

    public static void main(String[] args) {
        MiBanco programa = new MiBanco();
        programa.run();
    }

    private void run() {
        scanner = new Scanner(System.in);

        while (!done) {
            System.out.println("Ingresa la opcion (" + "0=salir," + "1=nueva," + "2=seleccionar," + "3=depositar,"
                    + "4=prestamo," + "5=mostrar," + "6=interes)");

            int cnum = scanner.nextInt();
            procesarComando(cnum);
        }

        scanner.close();
    }

    private void procesarComando(int cnum) {
        if (cnum == 0)
            salir();
        else if (cnum == 1)
            nuevaCuenta();
        else if (cnum == 2)
            seleccionar();
        else if (cnum == 3)
            depositar();
        else if (cnum == 4)
            authorizarPrestamo();
        else if (cnum == 5)
            mostrarTodo();
        else if (cnum == 6)
            agregarInteres();
        else
            System.out.println("Comando ilegal");
    }

    private void salir() {
        done = true;
        System.out.println("Hasta luego!");
    }

    private void nuevaCuenta() {
        actual = nextacct++;
        cuentas.put(actual, 0);
        System.out.println("Tu nuevo numero de cuenta es " + actual);
    }

    private void seleccionar() {
        System.out.println("Ingresar el # de cuenta: ");
        actual = scanner.nextInt();
        int balance = cuentas.get(actual);
        System.out.println("El balance de la cuenta " + actual + "es " + balance);
    }

    private void depositar() {
        System.out.println("Ingrese la cantidad a depositar: ");
        int amt = scanner.nextInt();
        int balance = cuentas.get(actual);
        cuentas.put(actual, balance + amt);
    }

    private void authorizarPrestamo() {
        System.out.println("Ingresa la cantidad a prestar: ");
        int loanamt = scanner.nextInt();
        int balance = cuentas.get(actual);
        if (balance >= loanamt / 2)
            System.out.println("Tu prestamo esta aprobado");
        else
            System.out.println("Tu prestamo es denegado");
    }

    private void mostrarTodo() {
        Set<Integer> accts = cuentas.keySet();
        System.out.println("El banco tiene " + accts.size() + "cuentas.");
        for (int i : accts)
            System.out.println("\tCuenta " + i + ": balance=" + cuentas.get(i));
    }

    private void agregarInteres() {
        Set<Integer> accts = cuentas.keySet();
        for (int i : accts) {
            int balance = cuentas.get(i);
            int newbalance = (int) (balance * (1 + tasa));
            cuentas.put(i, newbalance);
        }
    }
}
