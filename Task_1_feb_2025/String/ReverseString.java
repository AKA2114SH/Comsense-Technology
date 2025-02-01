package String;

public class ReverseString {
    public static void main(String[] args) {
        String str = "The Baap Company";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed String: " + reversed);
    }
}