package Introduction. CharacterClass;

public class TestIsWhitespace {
    public static void main(String args[]) {
        System.out.println(Character.isWhitespace('c'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isWhitespace('\n'));
        System.out.println(Character.isWhitespace('\t'));
    }
}