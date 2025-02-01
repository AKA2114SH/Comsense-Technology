package Task_30_jan_2025;
import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = num;

        while (result != 1 && result != 4) {
            result = isHappyNumber(result);
        }

        if (result == 1) {
            System.out.println(num + " is a happy number.");
        } else {
            System.out.println(num + " is an unhappy number.");
        }
        sc.close();
    }

    public static int isHappyNumber(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}