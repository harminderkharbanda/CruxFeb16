//Find duplicate number in an array of size n with numbers from 0 to n-2
package Assignment3StringsArrays1;

import java.util.Scanner;

public class DuplicateNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array: ");
		int a[] = new int[5];
		
		for(int i = 0; i < 5; i++)
		{
			a[i] = s.nextInt();
		}
		int dup = a[0];
		
		for(int i = 0; i < 5; i++)
		{
			for(int j = i+1; j < 5; j++){
				if(a[i] == a[j])
				{
					dup = a[i];
				}
			}
		}
		
		System.out.println("Duplicate number is: " + dup);
	}

}
