//print wave

package lecture4;

public class PrintWave {

	public static void WaveReturn(int[][] a){
		
		int x = a[0].length;
		for(int i = 0; i < x; i++)
		{
			if(i%2 == 0)
			{
				for(int j=0; j<a.length;j++)
				{
					System.out.println(a[j][i]);
				}
			}
			else
			{
				for(int j=a.length-1; j>=0;j--)
				{
					System.out.println(a[j][i]);
				}
			}
		}
		
		}
		
		
		
		
		
		
	
	
	
	public static void main(String[] args) {
		
		int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int b[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		WaveReturn(a);
		System.out.println('\n');
		WaveReturn(b);
	}

}
