import java.util.Scanner;

//Sum of all odd and even numbers in first N natural numbers

public class SumOddEvenN {

	public static void main(String[] args) {
		
		int sumOdd = 0;
		int sumEven = 0;
		int i = 1;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the value of N: ");
		int n = s.nextInt();
		
		while(i <= n){
			
			if(i % 2 == 0){
				sumEven = sumEven + i;
			}else{
				sumOdd = sumOdd + i;
			}
			
			i = i + 1;
		}
		
		System.out.println("Sum of even numbers: " + sumEven);
		System.out.println("Sum of odd numbers: " + sumOdd);
		
		

	}

}
