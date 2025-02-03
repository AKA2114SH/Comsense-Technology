package shape_area;
import java.util.Scanner;

public class Control {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();
        Shape circle = new Circle(radius);
        circle.calculateArea();

        
        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double width = scanner.nextDouble();
        Shape rectangle = new Rectangle(length, width);
        rectangle.calculateArea();

       
        System.out.print("Enter side length of square: ");
        double side = scanner.nextDouble();
        Shape square = new Square(side);
        square.calculateArea();

        scanner.close();
    }
}
