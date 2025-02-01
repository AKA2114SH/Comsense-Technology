package String;
public class SubstringCheck {
    public static void main(String[] args) {
        String mainStr = "Hello Akash";
        String subStr = "Akash";

        if (mainStr.contains(subStr)) {
            System.out.println("The string contains the substring.");
        } else {
            System.out.println("The string does not contain the substring.");
        }
    }
}