import java.util.Scanner;

public class Employee {
  
    String compliance = "The Baap Company";
    String compAddress = "Paregaon, Ahilayanagar, MH";

   
    int empId;
    String empName;
    String contact;
    String department;
    String designation;
    double basicSalary;
    String grade;

    // Parameterized constructor
    public Employee(int empId, String empName, String contact, String department, String designation, double basicSalary, String grade) {
        this.empId = empId;
        this.empName = empName;
        this.contact = contact;
        this.department = department;
        this.designation = designation;
        this.basicSalary = basicSalary;
        this.grade = grade;
    }

    // Method to calculate gross salary
    public double calculateGrossSalary() {
        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.50;
        double allowance = 0;

        switch (grade) {
            case "A":
                allowance = 1700;
                break;
            case "B":
                allowance = 1500;
                break;
            case "C":
                allowance = 1300;
                break;
            default:
                System.out.println("Invalid grade entered.");
                return 0;
        }

        double pf = basicSalary * 0.11;
        return basicSalary + hra + da + allowance - pf;
    }

    // Method to display employee details and salary components
    public void displayDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("Company: " + compliance);
        System.out.println("Address: " + compAddress);
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Contact: " + contact);
        System.out.println("Department: " + department);
        System.out.println("Designation: " + designation);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Grade: " + grade);

        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.50;
        double allowance = 0;

        switch (grade) {
            case "A":
                allowance = 1700;
                break;
            case "B":
                allowance = 1500;
                break;
            case "C":
                allowance = 1300;
                break;
        }

        double pf = basicSalary * 0.11;

        System.out.println("\nCalculated Salary Components:");
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Allowance: " + allowance);
        System.out.println("PF: " + pf);
        System.out.println("\nGross Salary: " + calculateGrossSalary());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input employee details
        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();
        System.out.print("Enter Contact: ");
        String contact = scanner.nextLine();
        System.out.print("Enter Department: ");
        String department = scanner.nextLine();
        System.out.print("Enter Designation: ");
        String designation = scanner.nextLine();
        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Grade (A, B, or C): ");
        String grade = scanner.nextLine();

        // Create Employee object using constructor
        Employee employee = new Employee(empId, empName, contact, department, designation, basicSalary, grade);

        // Display employee details and gross salary
        employee.displayDetails();

        scanner.close();
    }
}