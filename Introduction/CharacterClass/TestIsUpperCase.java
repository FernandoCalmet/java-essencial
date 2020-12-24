package Introduction. CharacterClass;

public class TestIsUpperCase {
    public static void main(String args[]) {
        System.out.println(Character.isUpperCase('c'));
        System.out.println(Character.isUpperCase('C'));
        System.out.println(Character.isUpperCase('\n'));
        System.out.println(Character.isUpperCase('\t'));
    }
}