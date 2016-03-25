//reverse a number

package Assignment2a;

import java.util.Scanner;

public class ReverseNumber {

	
	public static void reverseNumber(int num){
		int dig = num % 10;
		System.out.print("Reversed number is: " + dig);
		num = num / 10;
		
		while(num / 10 > 0){
			dig = num % 10;
			num = num / 10;
			System.out.print(dig);
		}
			System.out.print(num);
	}
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = s.nextInt();
		
		reverseNumber(num);	
	}

}
