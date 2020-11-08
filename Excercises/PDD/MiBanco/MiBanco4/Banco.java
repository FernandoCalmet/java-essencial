package miBanco.miBanco4;

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

    public int nuevaCuenta(int tipo) {
        this.nextacct = nextacct + 1;
        switch (tipo) {
            case 1:
                CuentaBancaria ctaCorriente = new CuentaCorriente(this.nextacct);
                this.cuentas.put(this.nextacct, ctaCorriente);
                System.out.println("\nLa cuenta se creo exitosamente! Tu nuevo numero de cuenta corriente es " + nextacct);
                break;
            case 2:
                CuentaBancaria ctaAhorros = new CuentaAhorros(this.nextacct);
                this.cuentas.put(this.nextacct, ctaAhorros);
                System.out.println("\nLa cuenta se creo exitosamente! Tu nuevo numero de cuenta de ahorros es " + nextacct);
                break;
        }

        return this.nextacct;
    }

    public double getBalance(int acctnum) {
        return this.cuentas.get(acctnum).getBalance();
    }

    public void depositar(int acctnum, int amt) {
        CuentaBancaria cuenta = this.cuentas.get(acctnum);
        cuenta.depositar(cuenta.getBalance() + amt);
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
        CuentaAhorros ctaAhorros = new CuentaAhorros(nextacct);
        CuentaBancaria cuenta;
        Set<Integer> ctas = this.cuentas.keySet();
        for (int i : ctas) {
            cuenta = this.cuentas.get(i);
            ctaAhorros.agregarInteres();
            this.cuentas.put(i, cuenta);
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