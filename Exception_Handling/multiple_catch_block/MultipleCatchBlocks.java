package Exception.src.com.multiple_catch_block;

import java.util.Scanner;

public class MultipleCatchBlocks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter a number: ");
            String input = sc.next();  
            int number = Integer.parseInt(input); 
            System.out.println("You entered: " + number);

            int result = 10 / 1; 
            System.out.println("Result: " + result);
            
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception caught: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception caught: " + e.getMessage());
        }

        System.out.println("Program execution completed.");
        sc.close();
    }
}
