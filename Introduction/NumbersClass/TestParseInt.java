package NumbersClass;

public class TestParseInt {
    public static void main(String args[]) {
        int x = Integer.parseInt("9");
        double c = Double.parseDouble("5");
        int b = Integer.parseInt("444", 16);

        System.out.println(x);
        System.out.println(c);
        System.out.println(b);
    }
}