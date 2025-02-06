package interface_as_a_reference;

import java.util.Scanner;

public class Rectangle implements Shape{
Scanner sc=new Scanner(System.in);

public void calculateArea() {
	System.out.println("Enter the length: ");
	double l=sc.nextDouble();
	System.out.println("Enter the width: ");
	double w=sc.nextDouble();
	double area=l*w;
	System.out.println(area);
	
}



}
