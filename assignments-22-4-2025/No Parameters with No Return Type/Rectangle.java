public class Rectangle {
    private double length = 10.0; // Hardcoded length
    private double width = 5.0;   // Hardcoded width

    // Method to calculate and print area of rectangle (no parameters with no return type)
    public void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.calculateArea(); // Call the method
        // Output: Area of Rectangle: 50.0
    }
}