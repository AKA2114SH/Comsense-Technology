import java.util.Scanner;

public class ShapeAreaCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***** Shape Area Calculator *****");
        System.out.println("Menu Bar : ");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.println("4. Triangle");
        System.out.println("5. Exit");
        System.out.print("Enter your choice : ");
        int choice = scanner.nextInt();

        double area = 0;

        switch (choice) {
            case 1: // Circle
                System.out.print("Enter radius: ");
                double radius = scanner.nextDouble();
                if (radius <= 0) {
                    System.out.println("Invalid radius! Please enter a positive number.");
                } else {
                    area = Math.PI * radius * radius;
                    System.out.println("Area of the Circle: " + area);
                }
                break;

            case 2: // Rectangle
                System.out.print("Enter length: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width: ");
                double width = scanner.nextDouble();
                if (length <= 0 || width <= 0) {
                    System.out.println("Invalid dimensions! Please enter positive numbers.");
                } else {
                    area = length * width;
                    System.out.println("Area of the Rectangle: " + area);
                }
                break;

            case 3: // Square
                System.out.print("Enter side: ");
                double side = scanner.nextDouble();
                if (side <= 0) {
                    System.out.println("Invalid side! Please enter a positive number.");
                } else {
                    area = side * side;
                    System.out.println("Area of the Square: " + area);
                }
                break;

            case 4: // Triangle
                System.out.print("Enter base: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height: ");
                double height = scanner.nextDouble();
                if (base <= 0 || height <= 0) {
                    System.out.println("Invalid dimensions! Please enter positive numbers.");
                } else {
                    area = 0.5 * base * height;
                    System.out.println("Area of the Triangle: " + area);
                }
                break;

            case 5: // Exit
                System.out.println("Exiting the program. Goodbye!");
                break;

            default:
                System.out.println("Invalid choice! Please try again.");
        }

        scanner.close(); // Close the scanner
    }
}