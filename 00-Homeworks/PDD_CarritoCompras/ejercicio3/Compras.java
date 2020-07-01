package ejercicio3;

public class Compras {
    public static void main(String[] args) {

        //TODO: Falta terminar

        ItemSubject subject = new ItemSubject();

        new ItemA(subject);
        new ItemB(subject);

        System.out.println("Primer estado: 10");
        subject.setState(10);

        System.out.println("Primer estado: 100");
        subject.setState(100);
    }
}