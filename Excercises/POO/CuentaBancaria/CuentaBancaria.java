package CuentaBancaria;

import javax.swing.JOptionPane;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class CuentaBancaria {

    public static void main(String[] args) {

        String dni = JOptionPane.showInputDialog("Ingresar el numero de DNI");
        String nombre = JOptionPane.showInputDialog("Ingresar el nombre");
        String direccion = JOptionPane.showInputDialog("Ingresar la direccion");

        Cliente cliente1 = new Cliente(dni, nombre, direccion);

        Cuenta cuenta1 = new Cuenta("001", 0, "Soles", cliente1);
        Cuenta cuenta2 = new Cuenta("002", 0, "Soles", cliente1);

        cliente1.agregarCuenta(cuenta1);
        cliente1.agregarCuenta(cuenta2);

        cuenta1.deposito(300);
        JOptionPane.showMessageDialog(null, "\nSe deposito " + cuenta1.getSaldo() + " a la cuenta 1.");

        cuenta2.deposito(700);
        JOptionPane.showMessageDialog(null, "\nSe deposito " + cuenta2.getSaldo() + " a la cuenta 2.");
        cuenta2.retiro(300);
        JOptionPane.showMessageDialog(null, "\nSe retiro " + cuenta2.getSaldo() + " de la cuenta 2.");

        JOptionPane.showMessageDialog(null, "\nREPORTE DEL CLIENTE: " + cliente1.reporte());
        JOptionPane.showMessageDialog(null, "\nREPORTE DE CUENTAS: " + cliente1.listarCuentas());
    }
}

class Cliente {
    private String dni;
    private String nombre;
    private String direccion;
    private Cuenta cuentas[];
    private int nroCuentas;

    public Cliente(String c_dni, String c_nom, String c_dir) {
        this.dni = c_dni;
        this.nombre = c_nom;
        this.direccion = c_dir;
        cuentas = new Cuenta[10];
        nroCuentas = 0;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }

    public int getNroCuentas() {
        return nroCuentas;
    }

    public void setNroCuentas(int nroCuentas) {
        this.nroCuentas = nroCuentas;
    }

    public String reporte() {
        return "\nDni: " + dni + "\nNombre: " + nombre + "\nDireccion: " + direccion;
    }

    public boolean agregarCuenta(Cuenta objCta) {
        if (nroCuentas < 10) {
            cuentas[nroCuentas] = objCta;
            nroCuentas++;
            return true;
        } else
            return false;
    }

    public String listarCuentas() {
        String lstaCtas = "";
        for (int i = 0; i < nroCuentas; i++)
            lstaCtas = lstaCtas + cuentas[i].reporte() + "\n";
        return lstaCtas;
    }
}

class Cuenta {
    private String numero, moneda;
    private double saldo;
    private Cliente cli;

    public Cuenta(String nu, double sa, String mo, Cliente cl) {
        this.numero = nu;
        this.saldo = sa;
        this.moneda = mo;
        this.cli = cl;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
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

    public void retiro(double cant) {
        if (cant <= saldo)
            saldo = saldo - cant;
        else
            System.out.println("Cantidad a retirar es mayor al Saldo.");
    }

    public String reporte() {
        return "\nNumero: " + numero + "\nSaldo: " + saldo + "\nMoneda: " + moneda;
    }
}