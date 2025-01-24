public class SimpleInterestCalculator {
    private double principal = 1000.0; // Hardcoded principal
    private double rate = 5.0;        // Hardcoded rate
    private double time = 2.0;        // Hardcoded time

    // Method to calculate and print simple interest (no parameters with no return type)
    public void calculateSimpleInterest() {
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
    }

    public static void main(String[] args) {
        SimpleInterestCalculator calculator = new SimpleInterestCalculator();
        calculator.calculateSimpleInterest(); // Call the method
        // Output: Simple Interest: 100.0
    }
}