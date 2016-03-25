//sort array of strings by length
package Assignment3StringsArrays1;

import java.util.Scanner;

public class SortStringsByLength {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		String value[] = new String[5];
		int length[] = new int[5];
		String newString[] = new String[5];
		int i = 0;
		while(i < 5)
		{
			System.out.println("Input string " + 1);
			value[i] = s.next();
			length[i] = value[i].length();
			i++;
		}
		
		i = 0;
		while(i < 4)
		{
			int j = i+1;
			while(j < 5)
			{
				if(length[i] > length[j])
				{
					int temp = length[i];
					String s1 = value[i];
					length[i] = length[j];
					value[i] = value[j];
					length[j] = temp;
					value[j] = s1;
				}
				j++;		
			}
			i++;
		}
		
		i = 0;
		System.out.println("Sorted strings are: ");
		while(i < 5)
		{
			System.out.println(value[i]);
			i++;
		}
	}

}
