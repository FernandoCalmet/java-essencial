package LogicalOperators;

public class Logicos {

    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 5;

        /*
         * Mayor que : >
         */
        if (number1 > number2) {
            System.out.println(number1 + " es mayor que " + number2);
        } else {
            System.out.println(number1 + " no es mayor que " + number2);
        }

        /*
         * Menor que : >
         */
        if (number1 < number2) {
            System.out.println(number1 + " es menor que " + number2);
        } else {
            System.out.println(number1 + " no es menor que " + number2);
        }

        /*
         * Diferente que : !=
         */
        if (number1 != number2) {
            System.out.println(number1 + " es diferente que " + number2);
        } else {
            System.out.println(number1 + " no es diferente que " + number2);
        }

        /*
         * Igual que : ==
         */
        if (number1 == number2) {
            System.out.println(number1 + " es igual que " + number2);
        } else {
            System.out.println(number1 + " no es igual que " + number2);
        }

        /*
         * Y logico (AND) : &&
         */
        if (number1 == 10 && number2 == 5) {
            System.out.println(number1 + " es igual a 10 y el " + number2 + " es igual a 5");
        } else {
            System.out.println(number1 + " no es igual a 10 y el " + number2 + " no es igual a 5");
        }

        /*
         * O logico (OR) : ||
         */
        if (number1 != 10 || number2 != 5) {
            System.out.println(number1 + " es diferente a 10 o el " + number2 + " es diferente a 5");
        } else {
            System.out.println(number1 + " no es diferente a 10 o el " + number2 + " no es diferente a 5");
        }

    }

}
