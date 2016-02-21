import java.util.Scanner;

//Read N numbers and print the largest number

public class LargestN {

	public static void main(String[] args) {
		
		int max = -100000;
		int i = 1;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Specify how many numbers you want to enter: ");
		int n = s.nextInt();
		
		while(i <= n ){
			System.out.print("Enter the number: ");
			int num = s.nextInt();
			if (num >= max){
				max = num;
			}
			
			i = i + 1;
		}
		
		System.out.println("Largest number is: " + max);

	}

}
