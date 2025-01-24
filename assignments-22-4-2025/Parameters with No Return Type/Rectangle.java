public class Rectangle {
    // Method to calculate and print area of rectangle (parameters with no return type)
    public void calculateArea(double length, double width) {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.calculateArea(10.0, 5.0); // Call the method with parameters
        // Output: Area of Rectangle: 50.0
    }
}