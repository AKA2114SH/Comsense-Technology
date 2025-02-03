package Employee_Salary;

import java.util.Scanner;

public class TestEmployee {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		permanantEmployee PE=new permanantEmployee();
		TemporaryEmployee TE=new TemporaryEmployee();
		System.out.println("1. Permanat Employee Details");
		System.out.println("2. Temporary Employee Details");
 
		
		int choice;
		System.out.println("enter your choice : ");
		choice=sc.nextInt();
		sc.nextLine();
		switch(choice){
		case 1:
			System.out.println("-----------Permanant Employee Details-------------");
			PE.getData();
		       PE.printSlip();
		       break;
		case 2:
			System.out.println("-----------Temporary Employee Details-------------");
			TE.getData();
		       TE.printSlip();
		       break;
		       default:
		    	   System.out.println("Exit");
		}
		sc.close();

	}
 
}