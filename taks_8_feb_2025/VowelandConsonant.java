package taks_8_feb_2025;

import java.util.Scanner;

public class VowelandConsonant {
  public static void main(String[] args) {
	  int vowelCount = 0;
	  int consonantCount = 0;
	System.out.println("Enter the String : ");
 Scanner sc = new Scanner (System.in);
   String input = sc.nextLine();
   String lc = input.toLowerCase();
   for (int i = 0; i < lc.length(); i++) {
	    char ch = lc.charAt(i);
	    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	        vowelCount++;  
	    } else if (ch >= 'a' && ch <= 'z') {
	        consonantCount++;  
	    }
	}
   System.out.println("Vowel Count : "+vowelCount);
   System.out.println("consonant Count : "+consonantCount);
   sc.close();
  }
}
