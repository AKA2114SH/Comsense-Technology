package taks_8_feb_2025;

import java.util.Scanner;

public class stringreverse {
	public static void main(String[] args) {
		System.out.println("Enter the String : ");
		Scanner sc = new Scanner(System.in);
		String Input = sc.nextLine();
		System.out.println("\nOriginal String : "+Input);
		System.out.print("reversed string : ");
		for (int i = Input.length()-1;i>=0;i--){
			System.out.print(Input.charAt(i));
		}
		sc.close();
	}

}
