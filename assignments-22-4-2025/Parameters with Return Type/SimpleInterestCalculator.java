public class SimpleInterestCalculator {

    // Method to calculate simple interest (parameters with return type)
    public double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        SimpleInterestCalculator calculator = new SimpleInterestCalculator();

        // Example inputs
        double principal = 1000.0; // Principal amount
        double rate = 5.0;        // Rate of interest (5%)
        double time = 2.0;        // Time period in years

        // Call the method
        double simpleInterest = calculator.calculateSimpleInterest(principal, rate, time);

        // Output the result
        System.out.println("Simple Interest: " + simpleInterest); // Output: Simple Interest: 100.0
    }
}