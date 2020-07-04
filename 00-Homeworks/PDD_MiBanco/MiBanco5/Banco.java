import java.util.*;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public class Banco {
    private HashMap<Integer, CuentaBancaria> cuentas;
    private static int contadorCuenta = 1;
    private int numeroCuenta;
    private CuentaBancaria cuenta;

    public Banco(HashMap<Integer, CuentaBancaria> cuentas) {
        this.cuentas = cuentas;
    }

    public int nuevaCuenta(int tipo) {
        this.numeroCuenta = contadorCuenta++;
        switch (tipo) {
            case 1:
                this.cuenta = new CuentaCorriente(this.numeroCuenta);
                this.cuentas.put(this.numeroCuenta, this.cuenta);
                break;
            case 2:
                this.cuenta = new CuentaAhorros(this.numeroCuenta);
                this.cuentas.put(this.numeroCuenta, this.cuenta);
                break;
        }
        return this.numeroCuenta;
    }

    public int getBalance(int numeroCuenta) {
        this.cuenta = this.cuentas.get(numeroCuenta);
        return this.cuenta.getBalance();
    }

    public void depositar(int monto) {
        this.cuenta = this.cuentas.get(this.numeroCuenta);
        this.cuenta.depositar(this.cuenta.getBalance() + monto);
        this.cuentas.put(this.numeroCuenta, this.cuenta);
    }

    public boolean autorizarPrestamo(int numeroCuenta, int montoPrestamo) {
        this.cuenta = cuentas.get(numeroCuenta);
        return this.cuenta.tieneFondosSuficientes(montoPrestamo);
    }

    public void agregarInteres() {
        for (CuentaBancaria cta : cuentas.values()) {
            if (cta instanceof CuentaAhorros) {
                CuentaAhorros ctaAhorros = (CuentaAhorros) this.cuenta;
                ctaAhorros.agregarInteres();
            }
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