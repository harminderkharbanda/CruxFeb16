import java.util.Scanner;

// print all Fibonacci numbers less than N

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the value of N: ");
		int n = s.nextInt();
		
		int num1 = 0;
		int num2 = 1;
		int num3;
		
		if (n < num1){
			return;
		}else{
			System.out.print(num1 + " ");
		}
		
		
		int i = 1;
		
		while(num2 < n){
			
			System.out.print(num2 + " ");
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			
		}
		

	}

}
