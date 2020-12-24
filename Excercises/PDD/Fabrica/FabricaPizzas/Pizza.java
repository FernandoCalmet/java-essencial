package Excercises.PDD.Fabrica.FabricaPizzas;

import java.util.ArrayList;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public abstract class Pizza implements IPizza {
    public String nombre;
    public String masa;
    public String salsa;
    public ArrayList<String> adicionales = new ArrayList<String>();

    public void preparar() {
        System.out.println("Preparando pedido de " + this.nombre);
        System.out.println(toString());
    }

    public void hornear() {
        System.out.println("Hornear por 25 minutos a 160 grados " + this.nombre);
    }

    public void cortar() {
        System.out.println("Cortar la pieza en rebanadas diagonales " + this.nombre);
    }

    public void envasar() {
        System.out.println("Envasar la pizza en su caja respectiva " + this.nombre);
    }

    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String toString() {
        // code to display pizza name and ingredients
        StringBuffer display = new StringBuffer();
        display.append("---- " + this.nombre + " ----\n");
        display.append(this.masa + "\n");
        display.append(this.salsa + "\n");
        for (int i = 0; i < this.adicionales.size(); i++) {
            display.append((String) this.adicionales.get(i) + "\n");
        }
        return display.toString();
    }
}