//calculate power(x,n)

package lecture5Recursion;

public class XToPowerN {

	
	public static int calculatePower(int x, int n)
	{
		
		if(n == 0)
			return 1;
		
		int power = x * calculatePower(x, n-1);
		
		return power;
	}
	
	public static void main(String[] args) {
		
		System.out.println(calculatePower(5, 3));

	}

}
