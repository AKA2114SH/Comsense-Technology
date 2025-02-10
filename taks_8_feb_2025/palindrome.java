package taks_8_feb_2025;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		System.out.println("Enter the string : ");
		Scanner sc = new Scanner (System.in);
		String input = sc.nextLine();
		String lc = input.toLowerCase();
		 String reversed = "";
		sc.close();
		for (int i=lc.length()-1;i>=0;i--){
			reversed += lc.charAt(i);}
			if (lc.equals(reversed)){
				System.out.println("Palindrome ");
			}else{
				System.out.println("not-palindrome");
			}

		}

	}


