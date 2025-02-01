package String;
public class StringVsStringBuffer {
    public static void main(String[] args) {
        String str = "Akash";
        StringBuffer strBuffer = new StringBuffer("Akash");

        System.out.println("String: " + str);
        System.out.println("StringBuffer: " + strBuffer);

        
        strBuffer.append(" World");
        System.out.println("Modified StringBuffer: " + strBuffer);
    }
}