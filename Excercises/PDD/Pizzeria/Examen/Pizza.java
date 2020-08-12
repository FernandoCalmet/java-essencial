package Pizzeria.Examen;

import java.util.ArrayList;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public abstract class Pizza {
    public String nombre;
    public String masa;
    public String salsa;
    public ArrayList<String> adicionales = new ArrayList<String>();

    public void preparar() {
        System.out.println("--- " + this.nombre + " ---");
        System.out.println("Preparando una " + this.nombre);
        System.out.print(toString());
    }

    public void hornear() {
        System.out.println("Hornea por 25 minutos a 160 grados");
    }

    public void cortar() {
        System.out.println("Cortando la Pizza en rodajas diagonales");
    }

    public void envolver() {
        System.out.println("Colocar la pizza en la caja oficial de la Pizzeria");
    }

    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String toString() {
        StringBuffer atributos = new StringBuffer();
        atributos.append("Estirando la masa: " + this.masa + "\n");
        atributos.append("Agregando la salsa: " + this.salsa + "\n");
        atributos.append("Agregando adicionales: \n");
        for (int i = 0; i < this.adicionales.size(); i++) {
            atributos.append("\t"+(String) this.adicionales.get(i) + "\n");
        }
        return atributos.toString();
    }
}