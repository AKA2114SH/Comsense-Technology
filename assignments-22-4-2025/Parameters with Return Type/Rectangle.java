public class Rectangle {
    // Method to calculate area of rectangle (parameters with return type)
    public double calculateArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        double area = rectangle.calculateArea(10.0, 5.0); // Call the method with parameters
        System.out.println("Area of Rectangle: " + area); // Output: Area of Rectangle: 50.0
    }
}