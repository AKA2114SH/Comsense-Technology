package Employee_Management_System;

public class Control {
	public static void main(String[] args) {
		// Creating objects
		FullTimeEmployee fullTimeEmp = new FullTimeEmployee("Akash Khatale", 101, 50000);
		PartTimeEmployee partTimeEmp = new PartTimeEmployee("Abhinav Gavande", 102, 20000);

		// Displaying details and bonuses
		System.out.println("Full-Time Employee Details:");
		fullTimeEmp.displayDetails();
		System.out.println("Bonus: " + fullTimeEmp.calculateBonus());
		System.out.println("---------------------------");

		System.out.println("Part-Time Employee Details:");
		partTimeEmp.displayDetails();
		System.out.println("Bonus: " + partTimeEmp.calculateBonus());
	}
}
