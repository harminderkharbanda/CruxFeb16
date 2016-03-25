
//PrintSpiral
package lecture4;

public class PrintSpiral {

	public static void printSPiral(int[][] a)
	{
		
//		int rowStart = 0;
//		int rowEnd = a.length;
//		int colStart = 0;
//		int colEnd = a[0].length;
//
		
//		while(rowStart < rowEnd && colStart < colEnd)
//		{
//			for(int i = colStart; i <colEnd; i++)
//			{
//				System.out.print(a[rowStart][i] + " ");
//			}
//			rowStart++;
//			
//			for(int j = rowStart; j < rowEnd; j++)
//			{
//				System.out.print(a[j][colEnd-1] + " ");
//			}
//			colEnd--;
//			
//			for(int i = colEnd-1; i >=colStart; i--)
//			{
//				System.out.print(a[rowEnd-1][i] + " ");
//			}
//			rowEnd--;
//			
//			for(int j = rowEnd-1; j >= rowStart; j--)
//			{
//				System.out.print(a[j][colStart] + " ");
//			}
//			colStart++;
//		}
		
		
		int rowStart = 0;
		int rowEnd = a.length-1;
		int colStart = 0;
		int colEnd = a[0].length-1;

		
		while(rowStart <= rowEnd && colStart <= colEnd)
		{
			for(int i = colStart; i <=colEnd; i++)
			{
				System.out.print(a[rowStart][i] + " ");
			}
			rowStart++;
			if(rowStart>rowEnd){
				break;
			}
			for(int j = rowStart; j <= rowEnd; j++)
			{
				System.out.print(a[j][colEnd] + " ");
			}
			colEnd--;
			if(colStart>colEnd){
				break;
			}
			for(int i = colEnd; i >=colStart; i--)
			{
				System.out.print(a[rowEnd][i] + " ");
			}
			rowEnd--;
			if(rowStart>rowEnd){
				break;
			}
			for(int j = rowEnd; j >= rowStart; j--)
			{
				System.out.print(a[j][colStart] + " ");
			}
			colStart++;
			if(colStart>colEnd){
				break;
			}
		}
		System.out.println();
		
	}
	
	
	public static void main(String[] args) {
	
		int[][] a = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		int [][] b = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int [][] c = {{1,2,3},{4,5,6},{7,8,9}};
		int [][] d = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int [][] e={{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18}};
		printSPiral(a);
		printSPiral(b);
		printSPiral(c);
		printSPiral(d);
		printSPiral(e);
	}

}
