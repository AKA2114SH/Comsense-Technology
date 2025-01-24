public class SimpleInterestCalculator {
    private double principal = 1000.0; // Hardcoded principal
    private double rate = 5.0;        // Hardcoded rate
    private double time = 2.0;        // Hardcoded time

    // Method to calculate simple interest (no parameters with return type)
    public double calculateSimpleInterest() {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        SimpleInterestCalculator calculator = new SimpleInterestCalculator();
        double simpleInterest = calculator.calculateSimpleInterest(); // Call the method
        System.out.println("Simple Interest: " + simpleInterest); // Output: Simple Interest: 100.0
    }
}