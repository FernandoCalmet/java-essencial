package Object_Oriented.inheritance;

public class SuperClassConstructor {
    int age;

    SuperClassConstructor(int age) {
        this.age = age;
    }

    public void getAge() {
        System.out.println("The value of the variable named age in super class is: " + age);
    }
}
