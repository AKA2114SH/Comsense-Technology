package Task_30_jan_2025;
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int count = 0;

        while (num != 0) {
            num /= 10;
            count++;
        }
        sc.close();

        System.out.println("Number of digits: " + count);
    }
    
}