package Assignment2a;

import java.util.Scanner;

public class PrintSeries {

	public static void main(String[] args) {
		
//		Scanner s = new Scanner(System.in);
//		
//		System.out.print("Enter value of n in 3n+2: ");
//		int n = s.nextInt();
		
		int i = 1;
		int x = 1;
		
		while(x <= 20){
			int res = 3 * i + 2;
			if(res % 4 != 0){
				System.out.println(res);
				i++;
				x++;
			}
			i++;
			
		}

	}

}
