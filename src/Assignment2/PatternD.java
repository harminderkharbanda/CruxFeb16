//Q7 pattern d

package Assignment2;

public class PatternD {

	public static void main(String[] args) {
		
		int i = 2;
		int k = 1;
		
		System.out.print(1);
		System.out.println();
		
		while(i <= 5){
			
			int j = 1;
		
			while(j <= i){
					
				if(j == 1 || j == i)
					System.out.print(k);
				else
					System.out.print(0);
				j++;
				
			}
			System.out.println();
			i++;
			k++;
		}

	}

}
