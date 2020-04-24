package Ejemplos;

import javax.swing.JOptionPane;

public class Vehiculos {
    public static void main(String[] args) {
        Moto moto = new Moto();
        Automovil auto = new Automovil();
        JOptionPane.showMessageDialog(null,"La Motocicleta tiene "+moto.ruedas+" ruedas y pesa "+moto.peso);
        JOptionPane.showMessageDialog(null,"El Automovil tiene "+auto.ruedas+" ruedas y es de color "+auto.color);
    }
}

class Moto{
    int ruedas;
    int peso;
    public Moto(){      
        ruedas = 2;
        peso = 200;
    }
}

class Automovil{
    int ruedas;
    String color;
    public Automovil(){
        ruedas = 4;
        color = "Rojo";
    }
}


