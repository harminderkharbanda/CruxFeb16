//Simple Calculator

package Assignment2;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int result;
		
		System.out.print("Enter first integer: ");
		int num1 = s.nextInt();
		
		System.out.print("Enter second integer: ");
		int num2 = s.nextInt();
		
		System.out.print("Enter the operator: ");
		char op = s.next().charAt(0);
		
		if(op == '+'){
			result = num1 + num2;
			System.out.println("Sum is: " + result);
			return;
		}
		
		if(op == '-'){
			result = num1 - num2;
			System.out.println("Difference is: " + result);
			return;
		}
		
		if(op == '*'){
			result = num1 * num2;
			System.out.println("Product is: " + result);
			return;
		}
		
		if(op == '/'){
			result = num1 / num2;
			System.out.println("Quotient is: " + result);
			return;
		}
		
		if(op == '%'){
			result = num1 % num2;
			System.out.println("Remainder is: " + result);
			return;
		}

	}

}
