//Compute sum or product 1...n 

package Assignment2a;

import java.util.Scanner;

public class SumOrProduct {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the value of n: ");
		int n = s.nextInt();
		
		System.out.println("Input choice: \n Enter 1 for sum \n Enter 2 for product");
		int ch = s.nextInt();
		
		int i = 1;
		int sum = 0;
		int product = 1;
		if(ch == 1){
			while(i <= n){
				sum = sum + i;
				i++;
			}
			System.out.println("Sum is: " + sum);
			return;
		}
		
		if(ch == 2){
			while(i <= n){
				product = product * i;
				i++;
			}
			System.out.println("Product is: " + product);
		}

	}

}
