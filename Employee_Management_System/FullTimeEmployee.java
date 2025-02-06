package Employee_Management_System;

public class FullTimeEmployee extends Employee{

	 // Constructor
    public FullTimeEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }
    // Implementing abstract method
    @Override
    public double calculateBonus() {
        return salary * 0.20; // 20% of salary
    }

}
