package Assignment3StringsArrays1;

import java.util.Scanner;


public class SumEvenOdd {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a[] = new int[5];
		int sumNegative = 0;
		int sumPositive = 0;
		
		System.out.println("Enter the array of numbers: ");
		for (int i = 0; i < 5; i++)
		{
			a[i] = s.nextInt();
			if(a[i] < 0)
			{
				sumNegative += a[i]; 
			}
			else if (a[i] > 0)
			{
				sumPositive += a[i];
			}
		}
		
		System.out.println("Sum of positiven numbers is: " + sumPositive);
		System.out.println("Sum of negative numbers is: " + sumNegative);
	}

}
