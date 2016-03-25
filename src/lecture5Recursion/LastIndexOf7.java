//find the last index of 7

package lecture5Recursion;

public class LastIndexOf7 {

	
	public static int findLastIndex7(int a[])
	{
		if(a.length == 0){
			return -1;
		}

		int[] b = new int[a.length-1];
		
		for(int j = 1; j < a.length; j++)
		{
			b[j-1] = a[j];
		}	
		
		int result = findLastIndex7(b);
		
		if(result != -1)
		{
			return result + 1;
		}else
		{
			if(a[0]==7)
				return 0;
			else
				return -1;
		}
	}
	
	public static void main(String[] args) {
		
		int[] a = {1,2,7,2,2,7,2};
		System.out.println(findLastIndex7(a));

	}

}
