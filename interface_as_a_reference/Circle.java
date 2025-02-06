package interface_as_a_reference;

import java.util.Scanner;

public class Circle implements Shape{
	Scanner sc=new Scanner(System.in);
	@Override
	public void calculateArea() {
		System.out.println("Enter the radius: ");
		double r=sc.nextDouble();
		double area=r*r;
		System.out.println(area);
		
	}
}
