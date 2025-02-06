package Employee_Management_System;

abstract class Employee {
String name;
int id;
double salary;
	public Employee(String name,int id,double salary) {
		 this.name = name;
	        this.id = id;
	        this.salary = salary;
	}
	 // Abstract method to be implemented by subclasses
    public abstract double calculateBonus();
    
    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

}
