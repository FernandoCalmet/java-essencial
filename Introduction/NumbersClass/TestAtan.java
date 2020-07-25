package NumbersClass;

public class TestAtan {
    public static void main(String args[]) {
        double degrees = 45.0;
        double radians = Math.toRadians(degrees);

        System.out.format("The value of pi is very very very approximately %.4f%n", Math.PI);
        System.out.format("The arctangent of %.4f is %.4f degrees %n", Math.cos(radians),
                Math.toDegrees(Math.atan(Math.sin(radians))));
    }
}