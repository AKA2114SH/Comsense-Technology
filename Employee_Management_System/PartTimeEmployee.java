package Employee_Management_System;

public class PartTimeEmployee extends Employee{

	 // Constructor
    public PartTimeEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }
    // Implementing abstract method
    @Override
    public double calculateBonus() {
        return salary * 0.10; // 20% of salary
    }

}
