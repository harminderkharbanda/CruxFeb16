//Q7 pattern e

package Assignment2;

public class PatternF {

	public static void main(String[] args) {
		

		int i = 1;
		int k = 5;
		
		while(i <= 5){
			int j = 1;
			
			while(j <= i){
				System.out.print(k);
				j++;
			}
			System.out.println();
			i++;
			k--;
			
		}

	}

}
