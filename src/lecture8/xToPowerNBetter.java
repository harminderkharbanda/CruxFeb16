//time complexity = O(logbase2n)
package lecture8;

public class xToPowerNBetter {

	public static int powerN(int num, int power)
	{
		if(power == 0)
		{
			return 1;
		}
		
		int mid = powerN(num,power/2);
		
		if(power % 2 == 0)
			return mid * mid;
		else 
			return mid * mid * num;
		
	
	}
	
	public static void main(String[] args) {
		
		System.out.println(powerN(2,7));
	}

}
