import java.util.Scanner;

//print the given pattern

public class PatternPg19Copy {

	public static void main(String args[]){
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the number of rows: ");
		int row = s.nextInt();
		
		int col = 1;
		int space = 1;
		
		while(col <= row){
		
			int i = col;
			space = col;
			
			while(space < row){
				System.out.print(" ");
				space = space + 1;
			}
			
			
			
			int j = 1;
			while(j <= col){
				System.out.print(i);
				j = j + 1;
				i = i + 1;
			}
			
			i = (2 * col) - 2;
			
			int counter = 1;
			
			while(counter <= col-1){
				System.out.print(i);
				i = i - 1;
				counter = counter + 1;
				
			}
			
			col = col + 1;
			System.out.println();
			
		}
		
	}
}
