package Exception.src.com.number_format_exception;

import java.util.Scanner;

public class NumberFormatException {

	public static void main(String[] args) {
	try{
		Scanner sc=new Scanner(System.in);
		String input;
		System.out.println("Enter the number:- ");
		input=sc.next();
		Integer.parseInt(input);
		System.out.println(input);
	}catch(Exception e){
		System.out.println("Number format exception");
	}


	}

}
