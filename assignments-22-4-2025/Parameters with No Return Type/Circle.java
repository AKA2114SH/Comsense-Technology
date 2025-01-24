public class Circle {
    // Method to calculate and print area of circle (parameters with no return type)
    public void calculateArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.calculateArea(5.0); // Call the method with parameter
        // Output: Area of Circle: 78.53981633974483
    }
}