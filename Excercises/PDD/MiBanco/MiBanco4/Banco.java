package MiBanco.MiBanco4;

import java.util.*;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Banco {
    private HashMap<Integer, ICuentaBancaria> cuentas = new HashMap<>();
    private CuentaCorriente ctaCorriente;
    private CuentaAhorros ctaAhorros;
    private static int contadorCuenta = 1;
    private int numeroCuenta;
    private ICuentaBancaria cuenta;

    public Banco() {
    }

    public int nuevaCuenta(int tipo) {
        this.numeroCuenta = contadorCuenta++;
        switch (tipo) {
            case 1:
                this.ctaCorriente = new CuentaCorriente(this.numeroCuenta);
                this.cuentas.put(this.numeroCuenta, ctaCorriente);
                break;
            case 2:
                this.ctaAhorros = new CuentaAhorros(this.numeroCuenta);
                this.cuentas.put(this.numeroCuenta, ctaAhorros);
                break;
        }
        return this.numeroCuenta;
    }

    public int getBalance(int numeroCuenta) {
        return this.cuentas.get(numeroCuenta).getBalance();
    }

    public void depositar(int monto) {
        this.cuenta = this.cuentas.get(this.numeroCuenta);
        this.cuenta.depositar(this.cuenta.getBalance() + monto);
        this.cuentas.put(this.numeroCuenta, this.cuenta);
    }

    public boolean autorizarPrestamo(int numeroCuenta, int montoPrestamo) {
        return this.cuenta.tieneFondosSuficientes(montoPrestamo);
    }

    public void agregarInteres() {
        Set<Integer> ctas = this.cuentas.keySet();
        for (int i : ctas) {
            this.cuenta = this.cuentas.get(i);
            this.ctaAhorros.agregarInteres();
            this.cuentas.put(i, this.cuenta);
        }
    }

    @Override
    public String toString() {
        Set<Integer> ctas = this.cuentas.keySet();
        String resultado = "El banco tiene " + ctas.size() + " cuentas.";
        for (int i : ctas)
            resultado += "\t\n" + this.cuentas.get(i).toString() + " Nro. " + this.cuentas.get(i).getNumeroCuenta()
                    + ": Balance = " + this.cuentas.get(i).getBalance();
        return resultado;
    }
}