package MiBanco2;

import java.util.*;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public class Cuenta {
    private HashMap<Integer, Integer> cuentas = new HashMap<>();
    private double tasa = 0.01;
    private int nextAccount = 0;
    private int currentAccount;

    protected void crear() {
        this.currentAccount = nextAccount++;
        this.cuentas.put(currentAccount, 0);
        System.out.println("\nTu nuevo numero de cuenta es " + currentAccount);
    }

    protected void seleccionar(int accountNumber) {
        if (this.cuentas.get(accountNumber) != null) {
            int balance = this.cuentas.get(accountNumber);
            System.out.println("\nEl balance de la cuenta " + accountNumber + " es " + balance);
        } else {
            System.out.println("\nLa cuenta no existe.");
        }
    }

    protected void deposito(int amount) {
        int balance = cuentas.get(this.currentAccount);
        cuentas.put(this.currentAccount, balance + amount);
    }

    protected void prestamo(int loanamount) {
        int balance = cuentas.get(this.currentAccount);
        if (balance >= loanamount / 2)
            System.out.println("\nTu prestamo esta aprobado");
        else
            System.out.println("\nTu prestamo es denegado");
    }

    protected void mostrarTodas() {
        Set<Integer> accounts = this.cuentas.keySet();
        System.out.println("\nEl banco tiene " + accounts.size() + " cuenta(s).");
        for (int i : accounts)
            System.out.println("Cuenta " + i + ": balance = " + this.cuentas.get(i));
    }

    protected void interes() {
        Set<Integer> accounts = this.cuentas.keySet();
        for (int i : accounts) {
            int balance = this.cuentas.get(i);
            int newbalance = (int) (balance * (1 + this.tasa));
            this.cuentas.put(i, newbalance);
        }
    }
}