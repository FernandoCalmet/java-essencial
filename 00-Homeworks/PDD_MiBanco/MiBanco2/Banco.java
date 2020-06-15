public class Banco {
    private Cuenta cuenta = new Cuenta();

    protected void salir() {
        System.out.println("Hasta luego!");
        System.exit(0);
    }

    protected void crearCuenta() {
        this.cuenta.crear();
        System.out.println("La cuenta se a creado exitosamente.");
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
        cuenta.mostrarTodas();
    }

    protected void interesCuenta() {
        cuenta.interes();
    }
}