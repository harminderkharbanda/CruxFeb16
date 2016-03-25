//Q7 pattern e

package Assignment2;

public class PatternE {

	public static void main(String[] args) {
		

		int i = 1;
		
		while(i <= 5){
			int j = 1;
			
			while(j <= i){
				if(j == 1 || j == i)
					System.out.print(1);
				else
					System.out.print(2);
				j++;
			}
			System.out.println();
			i++;
			
		}

	}

}
