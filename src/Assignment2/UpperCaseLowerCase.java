//Check if entered character is upper case, lower case or invalid
package Assignment2;

import java.util.Scanner;

public class UpperCaseLowerCase {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		char ch = s.next().charAt(0);
		
		if(ch >= 65 && ch <= 90){
			System.out.println("Character is in upper case");
			return;
		}
		
		if(ch >= 97 && ch <= 122){
			System.out.println("Character is in lower case");
			return;
		}
		
			System.out.println("Character is invalid");
		

	}

}
