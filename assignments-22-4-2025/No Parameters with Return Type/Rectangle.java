public class Rectangle {
    private double length = 10.0; // Hardcoded length
    private double width = 5.0;   // Hardcoded width

    // Method to calculate area of rectangle (no parameters with return type)
    public double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        double area = rectangle.calculateArea(); // Call the method
        System.out.println("Area of Rectangle: " + area); // Output: Area of Rectangle: 50.0
    }
}