public class SimpleInterestCalculator {
    // Method to calculate and print simple interest (parameters with no return type)
    public void calculateSimpleInterest(double principal, double rate, double time) {
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
    }

    public static void main(String[] args) {
        SimpleInterestCalculator calculator = new SimpleInterestCalculator();
        calculator.calculateSimpleInterest(1000.0, 5.0, 2.0); // Call the method
        // Output: Simple Interest: 100.0
    }
}