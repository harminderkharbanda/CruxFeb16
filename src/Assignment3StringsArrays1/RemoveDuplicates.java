//print string without printing consecutive duplicates

package Assignment3StringsArrays1;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		String str = s.next();
		
		int i = 0;
		
		while(i < str.length()){
			char present = str.charAt(i);
			System.out.print(present);
			int j = i+1;
			while(j < str.length()){
				if(str.charAt(i) != str.charAt(j)){
					i++;
					break;
				}
				j++;
				i++;
			}
			if(i == str.length()-1)
			{
				
				break;
			}
		}
	}

}
