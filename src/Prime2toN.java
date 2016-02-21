import java.util.Scanner;

// print all prime numbers between 2 to N

public class Prime2toN {
	
	public static void main(String args[]){
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the value of N: ");
		int n = s.nextInt();
		
		if(n < 2){
			return;
		}else{
			System.out.println(2);
		}
		
		int i = 3;
		int flag = 1;
		while(i <= n){
			
			int j = 2;
			
			while(j < i){
				if(i % j == 0){
					flag = 0;
			    }
				j = j + 1;
				
		}
			if (flag == 1){
				System.out.println(i);
			}
			flag = 1;
			i = i + 1;
		}
		
	}

}
