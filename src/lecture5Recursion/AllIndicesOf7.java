package lecture5Recursion;

public class AllIndicesOf7 {

	public static int[] printAllIndicesOf7(int a[])
	{
		if(a.length == 0 )
		{
			return new int[0];
		}
	
		int[] b = new int[a.length-1];
		
		for(int j = 1; j < a.length; j++)
		{
			b[j-1] = a[j];
		}
		
		int result[] = printAllIndicesOf7(b);
		
		if(a[0] == 7)
		{
			int[] result2 = new int[result.length + 1];
			result2[0] = 0;
			for(int j = 1; j <result2.length;j++)
			{
				result2[j] = result[j-1] + 1;
			}
			return result2;
		}
		else if(result.length == 0)
		{
			return result;
		}
		else 
		{
			for(int i = 0; i < result.length; i++)
			{
				result[i] = result[i] + 1;
			}
			return result;
		}
		}
		
	
	
	public static void main(String[] args) {
		
		int[] a = {2,2,2,2,7,7};
		
		int x[] = printAllIndicesOf7(a);
		
		for (int i = 0; i < x.length; i++)
		{
			System.out.print(x[i] + " ");
		}
	}

}
