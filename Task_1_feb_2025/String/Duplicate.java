package String;
import java.util.HashSet;

public class Duplicate {
    public static void main(String[] args) {
        String str = "Akash";
        HashSet<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (set.add(ch)) {
                result.append(ch);
            }
        }

        System.out.println("String after removing duplicates: " + result.toString());
    }
}