public class Circle {
    double radius = 5.0; // Hardcoded radius

    // Method to calculate and print area of circle (no parameters with no return type)
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.calculateArea(); // Call the method
        // Output: Area of Circle: 78.53981633974483
    }
}