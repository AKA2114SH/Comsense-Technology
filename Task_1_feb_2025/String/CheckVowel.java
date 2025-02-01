package String;
public class CheckVowel {
    public static void main(String[] args) {
        char ch = 'a';

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("The character is a vowel.");
        } else {
            System.out.println("The character is not a vowel.");
        }
    }
}