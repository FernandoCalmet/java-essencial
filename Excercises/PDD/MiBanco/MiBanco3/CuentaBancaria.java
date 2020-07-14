package MiBanco.MiBanco3;

import java.util.*;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public class CuentaBancaria implements ICuentaBancaria {
    private HashMap<Integer, Integer> cuentas = new HashMap<>();
    private double tasa = 0.01;
    private int nextAccount = 0;
    private int currentAccount;

    public void crear() {
        this.currentAccount = nextAccount++;
        this.cuentas.put(currentAccount, 0);
        System.out.println("\nLa cuenta se creo exitosamente! Tu nuevo numero de cuenta es " + currentAccount);
    }

    public void seleccionar(int numeroCuenta) {
        if (this.cuentas.get(numeroCuenta) != null) {
            int balance = this.cuentas.get(numeroCuenta);
            System.out.println("\nEl balance de la cuenta " + numeroCuenta + " es " + balance);
        } else {
            System.out.println("\nLa cuenta no existe.");
        }
    }

    public void deposito(int monto) {
        int balance = cuentas.get(this.currentAccount);
        cuentas.put(this.currentAccount, balance + monto);
    }

    public void prestamo(int monto) {
        int balance = cuentas.get(this.currentAccount);
        if (balance >= monto / 2)
            System.out.println("\nTu prestamo esta aprobado");
        else
            System.out.println("\nTu prestamo es denegado");
    }

    public void mostrar() {
        Set<Integer> accounts = this.cuentas.keySet();
        System.out.println("\nEl banco tiene " + accounts.size() + " cuenta(s).");
        for (int i : accounts)
            System.out.println("Cuenta " + i + ": balance = " + this.cuentas.get(i));
    }

    public void interes() {
        Set<Integer> accounts = this.cuentas.keySet();
        for (int i : accounts) {
            int balance = this.cuentas.get(i);
            int newbalance = (int) (balance * (1 + this.tasa));
            this.cuentas.put(i, newbalance);
        }
    }
}