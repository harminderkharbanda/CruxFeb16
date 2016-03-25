//Given an array
//a. Check if it contains 7

package lecture5Recursion;



public class CheckFor7 {

	public static boolean Check7(int a[])
	{
		if(a.length == 0)
			return false;
		if(a[0] == 7)
			return true;
		
		int b[] = new int[a.length - 1];
		
		for(int i = 1; i < a.length; i ++)
		{
			b[i-1] = a[i];
		}
		boolean is7Present = Check7(b);
		
		return is7Present;
	}
	
	public static void main(String[] args) {
		
		int a[] = {1,2,7,9,3};
		
		System.out.println(Check7(a));
	}

}
