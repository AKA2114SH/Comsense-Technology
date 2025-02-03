package Employee_Salary;

import java.util.Scanner;
public class company {
Scanner sc=new Scanner(System.in);
	String compName;
	String compAddress;
	String compEmail;
	long compContact;
	void getdata(){
		System.out.println("enter company Name : ");
		compName=sc.nextLine();
		System.out.println("enter company Address : ");
		compAddress=sc.nextLine();
		System.out.println("enter company Email : ");
		compEmail=sc.nextLine();
		System.out.println("enter company Contact : ");
		compContact=sc.nextLong();
		sc.nextLine();
	}
}