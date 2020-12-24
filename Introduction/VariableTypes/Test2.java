package Introduction. VariableTypes;

public class Test2 {
    public void pupAge() {
        int age = 1;
        age = age + 7;
        System.out.println("Puppy age is : " + age);
    }

    public static void main(String args[]) {
        Test2 test = new Test2();
        test.pupAge();
    }
}