//Convert binary to decimal

package Assignment2a;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the binary number: ");
		int num = s.nextInt();
		
		int dig = num % 10;
		int i = 0;
		double sum = 0;
		
		sum = sum + (Math.pow(2, i) * dig);
		num = num / 10;
		i++;
		
		while(num / 10 > 0){
			dig = num % 10;
			num = num / 10;
			sum = sum + (Math.pow(2, i) * dig);
			i++;
			
		}
		
		sum = sum + (Math.pow(2, i) * num);
		
		System.out.println("The decimal number is: " + (int)sum);
	}

	}


