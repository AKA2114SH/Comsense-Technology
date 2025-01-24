public class Circle {
    // Method to calculate area of circle (parameters with return type)
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        double area = circle.calculateArea(5.0); // Call the method with parameter
        System.out.println("Area of Circle: " + area); // Output: Area of Circle: 78.53981633974483
    }
}