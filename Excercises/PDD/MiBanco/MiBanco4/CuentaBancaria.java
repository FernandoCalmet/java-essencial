package miBanco.miBanco4;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public interface CuentaBancaria {

    public int getNumeroCuenta();

    public int getBalance();

    public void depositar(int monto);

    public boolean tieneFondosSuficientes(int montoPrestamo);

    @Override
    public String toString();
}
