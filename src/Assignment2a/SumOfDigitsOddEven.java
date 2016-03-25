//Print sum of odd and even digits of a number separately

package Assignment2a;

import java.util.Scanner;

public class SumOfDigitsOddEven {

	public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	
	System.out.print("Enter the number: ");
	int n = s.nextInt();
	
	int odd = n % 10;
	int even = 0;
	
	while(n/10 > 0){
		n = n / 10;
		even = even + (n % 10);
		if(n / 10 > 0){
			n = n / 10;
			odd = odd + (n % 10);
		}
	}
	
	System.out.println("Sum of odd digits is: " + odd);
	System.out.println("Sum of even digits is: " + even);
	
	
	}
	
}
