// split a sequence into decreasing and increasing

package Assignment2a;

import java.util.Scanner;

public class IncreaseingDecreasingSequence {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Input value of n: ");
		int n = s.nextInt();
		
		System.out.println("Enter " + n + " numbers: ");
		int i = 2;
		int flag1 = 0;
		int flag2 = 0;
		
		int x = s.nextInt();
		
		while(i <= n){
			int num = s.nextInt();
			if (num > x){
				flag1 = 1;
				x = num;
				i++;
				break;
			} 
			x = num;
			i++;
		}
		
		while(i <= n){
			int num = s.nextInt();
			if(num < x){
				flag2 = 1;
				i++;
				break;
			}
			x = num;
			i++;
		}
		
		while(i <= n){
			int num = s.nextInt();
			i++;
		}

		
		if(flag1 == 1 && flag2 == 0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
