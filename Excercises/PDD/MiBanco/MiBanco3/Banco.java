package MiBanco.MiBanco3;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Banco {
    private ICuentaBancaria cuenta;

    protected void setCuenta(ICuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    protected void crearCuenta() {
        this.cuenta.crear();
    }

    protected void seleccionarCuenta(int accountNumber) {
        cuenta.seleccionar(accountNumber);
    }

    protected void depositoCuenta(int amount) {
        cuenta.deposito(amount);
    }

    protected void prestamoCuenta(int loanamount) {
        cuenta.prestamo(loanamount);
    }

    protected void mostrarEstadosCuentas() {
        cuenta.mostrar();
    }

    protected void interesCuenta() {
        cuenta.interes();
    }
}