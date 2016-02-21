import java.util.Scanner;

//to check if a number is prime or not
public class IsPrime {

	public static void main(String[] args) {
		
		int i = 2;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		int num = s.nextInt();
		
		if(num == 1){
			System.out.println(num + " is neither prime nor composite");
		}
		
		while(i < num){
			
			if(num % i == 0){
				System.out.println(num + " is not prime");
				return;
			}
			i = i + 1;
		}
		
		if(num != 1){
			System.out.println(num + " is prime");
		}
	}

}
