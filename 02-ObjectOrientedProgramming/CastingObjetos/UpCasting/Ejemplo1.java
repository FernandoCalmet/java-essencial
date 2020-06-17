package UpCasting;

public class Ejemplo1 {
    public static void main(String[] args) {
        // Crear objeto Capa1 con instancia de clase hija Capa2
        Capa1 objCapaX = new Capa2();
        // El objeto Capa2 solo puede usar los metodos del objeto padre Capa1
        System.out.println(objCapaX.mensajeCapa1());

        Capa1 objCapaY = new Capa3();
        System.out.println(objCapaY.mensajeCapa1());
    }
}

class Capa1 {
    public String mensajeCapa1() {
        return "Este metodo es de la capa 1";
    }
}

class Capa2 extends Capa1 {
    public String mensajeCapa2() {
        return "Este metodo es de la capa 2";
    }
}

class Capa3 extends Capa1 {
    public String mensajeCapa3() {
        return "Este metodo es de la capa 3";
    }
}