//Q7 pattern b

package Assignment2;

public class PatternB {

	public static void main(String[] args) {
		
		int i = 1;
		
		while(i <= 5){
			int j = 1;
			
			while(j <= i){
				if(j == 1 || j == i)
					System.out.print(1);
				else
					System.out.print(0);
				j++;
			}
			System.out.println();
			i++;
			
		}

	}

}
