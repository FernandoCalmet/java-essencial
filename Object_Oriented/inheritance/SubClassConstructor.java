package Object_Oriented.inheritance;

public class SubClassConstructor extends SuperClassConstructor {
    SubClassConstructor(int age) {
        super(age);
    }

    public static void main(String args[]) {
        SubClassConstructor s = new SubClassConstructor(24);
        s.getAge();
    }
}
