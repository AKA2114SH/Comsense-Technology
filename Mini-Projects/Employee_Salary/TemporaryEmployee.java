package Employee_Salary;

import java.util.Scanner;

public class TemporaryEmployee extends company {
	Scanner sc=new Scanner(System.in);
	String empName,department;
	long contact;
	int wagePerDay,presentDays;
	void getData(){
		getdata();
		System.out.println("enter employee name : ");
		empName=sc.nextLine();
		System.out.println("enter department");
		department=sc.nextLine();
		System.out.println("enter your number : ");
		contact=sc.nextLong();
		sc.nextLine();
		System.out.println("enter wage perDay: ");
		wagePerDay=sc.nextInt();
		sc.nextLine();
		System.out.println("enter present days: ");
		presentDays=sc.nextInt();
		sc.nextLine();
	}
	void printSlip(){
		int salary = wagePerDay*presentDays;
		  System.out.println(compName);
		    System.out.println(compAddress);
		    System.out.println("--------------------------------------------");
		    System.out.println("name = "+empName  );
		System.out.println("Gross Salary = "+salary);
	}

 
}