//Given an array, find first index of 7

package lecture5Recursion;

public class FirstIndex7 {

	
	public static int findFirstIndex7(int a[])
	{
		
		if(a.length == 0)
		{
			return -1;
		}
		
		if(a[0] == 7)
		{
			return 0;
		}
		
		int[] b = new int[a.length-1];
		
		for(int j = 1; j < a.length; j++)
		{
			b[j-1] = a[j];
		}
		
		int x = findFirstIndex7(b);
		
		if(x == -1)
			return -1;
		else
			return ++x;
	}
	
	public static void main(String[] args) {
		
		int[] a = {1,2,2,7,2};
		System.out.println(findFirstIndex7(a));
	}

}
