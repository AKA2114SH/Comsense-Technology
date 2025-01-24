public class Circle {
    private double radius = 5.0; // Hardcoded radius

    // Method to calculate area of circle (no parameters with return type)
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        double area = circle.calculateArea(); // Call the method
        System.out.println("Area of Circle: " + area); // Output: Area of Circle: 78.53981633974483
    }
}