package Excercises.POO.UPAO.CuentaBancaria.ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class ClasePrincipal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Capturar Datos del objeto
        System.out.println("Ingresar DNI del cliente: ");
        String dni = br.readLine();
        System.out.println("Ingresar saldo en la cuenta: ");
        double saldo = Double.parseDouble(br.readLine());
        System.out.println("Ingresar saldo de interes mensual a la cuenta: ");
        double interesMensual = Double.parseDouble(br.readLine());
        // Creacion del Objeto vacio
        CuentaBancaria cuenta1 = new CuentaBancaria();
        // Ver estado del objeto vacio
        System.out.println("\nEstado: " + cuenta1.toString());
        // Insertar Datos al objeto
        cuenta1.setDni(dni);
        cuenta1.setInteresMensual(interesMensual);
        // Ingresar saldo al objeto
        cuenta1.IngresarSaldo(saldo);
        System.out.println("\nSe ingreso " + cuenta1.getSaldo() + " de saldo a la cuenta.");
        // Retirar saldo del objeto
        cuenta1.RetirarSaldo(1);
        System.out.println("\nSe retiro " + cuenta1.getSaldo() + " de saldo a la cuenta.");
        // Actualizar saldo del objeto
        cuenta1.ActualizarSaldo(500);
        System.out.println("\nSe actualizo a " + cuenta1.getSaldo() + " de saldo a la cuenta.");
        // Ver todos los datos del objeto
        System.out.println(cuenta1.toString());
    }
}
