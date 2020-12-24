package Excercises.PDD.MiBanco.MiBanco3;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Banco {
    private HashMap<Integer, CuentaBancaria> cuentas = new HashMap<>();
    private final double tasa = 0.01;
    private int nextacct = 0;

    public int nuevaCuenta() {
        this.nextacct = nextacct + 1;
        this.cuentas.put(this.nextacct, new CuentaBancaria(this.nextacct));
        System.out.println("\nLa cuenta se creo exitosamente! Tu nuevo numero de cuenta es " + nextacct);
        return this.nextacct;
    }

    public double getBalance(int acctnum) {
        return this.cuentas.get(acctnum).getBalance();
    }

    public void depositar(int acctnum, int amt) {
        double newbalance = this.cuentas.get(acctnum).getBalance() + amt;
        CuentaBancaria cuenta = this.cuentas.get(acctnum);
        cuenta.setBalance(newbalance);
        this.cuentas.put(acctnum, cuenta);
    }

    public boolean autorizarPrestamo(int acctnum, int loanamt) {
        boolean status = false;
        double balance = this.cuentas.get(acctnum).getBalance();
        if (balance >= loanamt / 2) {
            System.out.println("\nTu prestamo esta aprobado");
            status = true;
        } else {
            System.out.println("\nTu prestamo es denegado");
        }
        return status;
    }

    public void agregarInteres() {
        Set<Integer> accounts = this.cuentas.keySet();
        for (int i : accounts) {
            double newbalance = this.cuentas.get(i).getBalance() * (1 + this.tasa);
            this.cuentas.get(i).setBalance(newbalance);
            this.cuentas.put(i, this.cuentas.get(i));
        }
    }

    @Override
    public String toString() {
        Set<Integer> ctas = this.cuentas.keySet();
        String resultado = "El banco tiene " + ctas.size() + " cuentas.";
        for (int i : ctas) {
            resultado += "\t\n" + this.cuentas.get(i).toString() + " Nro. " + this.cuentas.get(i).getNumeroCuenta()
                    + ": Balance = " + this.cuentas.get(i).getBalance();
        }
        return resultado;
    }
}