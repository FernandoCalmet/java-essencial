package VariableTypes;

public class Test1 {
    public void pupAge() {
        int age = 0;
        age = age + 7;
        System.out.println("Puppy age is : " + age);
    }

    public static void main(String args[]) {
        Test1 test = new Test1();
        test.pupAge();
    }
}