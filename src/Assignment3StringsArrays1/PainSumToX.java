package Assignment3StringsArrays1;

import java.util.Scanner;

public class PainSumToX {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a[] = new int[5];
		int sumNegative = 0;
		int sumPositive = 0;
		
		System.out.println("Enter the array of numbers: ");
		for (int i = 0; i < 5; i++)
		{
			a[i] = s.nextInt();
		}
		System.out.println("Print a number to find matching pairs: ");
		int sum = s.nextInt();
		
		for(int i = 0; i < 5; i++)
		{
			for(int j = i+1;j < 5;j++)
			{
				if(a[i]+a[j] == sum)
				{
					System.out.println("Pair" + a[i] + " " + a[j]);
				}
			}
		}

	}

}
