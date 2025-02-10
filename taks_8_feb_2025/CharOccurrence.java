package taks_8_feb_2025;

import java.util.Scanner;

public class CharOccurrence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String input = sc.nextLine();
		String lc = input.toLowerCase();
		int Count = 0;
		System.out.println("Enter the character to count : ");
		char targetChar = sc.next().toLowerCase().charAt(0);

		sc.close();
		for (int i = 0; i < input.length(); i++) {

			if (lc.charAt(i) == targetChar) {
				Count++;
			}

		}
		System.out.println("Character '" + targetChar + "' Occurs " + Count + " time : ");

	}

}
