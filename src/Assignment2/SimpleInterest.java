// Program to accept the principal amount, rate and time and calculate the
// simple interest and the total amount.

package Assignment2;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the principle amount: ");
		int principle = s.nextInt();
		System.out.print("Enter the rate: ");
		int rate = s.nextInt();
		System.out.print("Enter the time: ");
		int time = s.nextInt();
		
		float amount;
		
		float si = principle * rate * time / 100;
		
		amount = principle + si;
		
		System.out.println("Simple interest is: " + si);
		System.out.println("Amount is: " + amount);
		
		
		

	}

}
