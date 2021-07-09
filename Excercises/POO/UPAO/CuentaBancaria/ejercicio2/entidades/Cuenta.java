package Excercises.POO.UPAO.CuentaBancaria.ejercicio2.entidades;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Cuenta {
    private long nro;
    private double saldo;
    private String moneda;
    private Cliente cli;
    private static int nCta = 0;

    public Cuenta(double saldo, String moneda, Cliente cl) {
        nCta++;
        this.nro = nCta;
        this.saldo = saldo;
        this.moneda = moneda;
        this.cli = cl;
    }

    public long getNro() {
        return nro;
    }

    public void setNro(long numero) {
        this.nro = numero;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public void deposito(double cant) {
        saldo = saldo + cant;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "nro=" + nro + ", saldo=" + saldo + ", moneda=" + moneda + '}';
    }

    public boolean retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            return true;
        } else {
            return false;
        }
    }

    public boolean depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(Cuenta cDest, double monto) {
        if (this.retirar(monto) == true) {
            cDest.depositar(monto);
            return true;
        } else {
            return false;
        }
    }
}
