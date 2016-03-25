// print x^n

package Assignment2a;

import java.util.Scanner;

public class XToPowerN {

	public static int xToPowerN(int x, int n){
		int i=1;
		int x1 = x;
		while(i < n){
			x1 = x1 * x;
			i++;
		}
		
		if(n == 0)
			return 1;
		else
			return x1;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the value of x: ");
		int x = s.nextInt();
		System.out.print("Enter the value of n: ");
		int n = s.nextInt();
		
		System.out.println(xToPowerN(x,n));
		
		

	}

}
