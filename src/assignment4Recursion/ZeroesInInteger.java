//find number of zeroes in an integer
package assignment4Recursion;

public class ZeroesInInteger {

	public static int countZeroes(int a)
	{
		if(a == 0)
		{
			return 0;
		}
		
		if(a%10 == 0)
			return 1 + countZeroes(a/10);
		else
		{
			return countZeroes(a/10);
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(countZeroes(3040000));

	}

}
