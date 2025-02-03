package Employee_Salary;

import java.util.Scanner;
 
public class permanantEmployee extends company{
	Scanner sc=new Scanner(System.in);
	int empId;
	String empName,department,designation,grade;
	double basicSalary,grossSalary,HRA,DA,PF,allow;
	long contact;
	void getData(){
		getdata();
		System.out.println("enter empId");
		empId=sc.nextInt();
		sc.nextLine();
		System.out.println("enter emp name : ");
		empName=sc.nextLine();
		System.out.println("enter your number : ");
		contact=sc.nextLong();
		sc.nextLine();
		System.out.println("enter department");
		department=sc.nextLine();
		System.out.println("designation");
		designation=sc.nextLine();
		System.out.println("basicSalary");
		basicSalary=sc.nextDouble();
		sc.nextLine();
		System.out.println("grade");
		grade=sc.next();
		HRA=basicSalary*0.20;
	    DA=basicSalary*0.5;
	    PF=basicSalary*0.11;	
	    switch(grade.toUpperCase()){
	    case "A":
	    	allow=1700;
	    	break;
	    case "B":
	    	allow=1500;
	    	break;
	    case "C":
	    	allow=1300;
	    	break;
	    	default:
	    		System.out.println("invalid grade");
	    		allow=0;
	    }

	}
	void printSlip(){
		grossSalary=basicSalary+HRA+DA+allow-PF;
		System.out.println("----------Details-----------");
	    System.out.println(compName);
	    System.out.println(compAddress);
	    System.out.println("--------------------------------------------");
	    System.out.println(empId+"             "+empName  );
		System.out.println(contact+"        "+department+"   "+designation);
		System.out.println("--------------------------------------------");
		System.out.println("Basic Salary : "+basicSalary);
		System.out.println("Grade : "+ grade);
		System.out.println("HRA : " +HRA);
		System.out.println("DA : " +DA);
		System.out.println("Allow : " +allow);
		System.out.println("PF : " +PF);
		System.out.println("Gross Salary : " +grossSalary);
	}

 
}