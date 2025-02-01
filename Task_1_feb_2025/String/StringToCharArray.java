package String;
public class StringToCharArray {
    public static void main(String[] args) {
        String str = "Akash";
        char[] charArray = str.toCharArray();

        for (char ch : charArray) {
            System.out.println(ch);
        }
    }
}