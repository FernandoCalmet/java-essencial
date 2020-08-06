package Fabrica.FabricaSimplePizzas;

import java.util.ArrayList;

public abstract class Pizza {
    public String nombre;
    public String masa;
    public String salsa;
    public ArrayList<String> adicionales = new ArrayList<String>();

    public void preparar() {
        System.out.println("Preparando " + this.nombre);
    }

    public void hornear() {
        System.out.println("Horneando " + this.nombre);
    }

    public void cortar() {
        System.out.println("Cortando " + this.nombre);
    }

    public void envasar() {
        System.out.println("Envolviendo " + this.nombre);
    }

    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String toString() {
        StringBuffer pizzaString = new StringBuffer();
        pizzaString.append("---- " + this.nombre + " ----\n");
        pizzaString.append(this.masa + "\n");
        pizzaString.append(this.salsa + "\n");
        for (int i = 0; i < this.adicionales.size(); i++) {
            pizzaString.append((String) this.adicionales.get(i) + "\n");
        }
        return pizzaString.toString();
    }
}