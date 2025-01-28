package com.tbc.userinput;

import java.util.Scanner;

public class Addition {
	int num1,num2,result;
	Scanner sc = new Scanner(System.in);
	void sum(){
		System.out.println("Welcome user : ");
		System.out.println("Enter num 1 : ");
	    num1 = sc.nextInt();
	    System.out.println("Enter num 2 : ");
	    num2 = sc.nextInt();
	    result = num1 + num2;
	    System.out.println("Sum : "+result);
	}

	public static void main(String[] args) {
		Addition obj = new Addition();
		obj.sum();

	}

}
