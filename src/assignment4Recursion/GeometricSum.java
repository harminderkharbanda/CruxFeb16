//given k, find geometric sum of 1 + 1/2 ....+ 1/2*k
package assignment4Recursion;

public class GeometricSum {

	public static double findSum(int k)
	{
		if(k == 0)
			return 1;
		
		double result = 1.0/(2.0*k);
		return result + findSum(k-1);
	}
	
	public static void main(String[] args) {
		
		System.out.println(findSum(2));
	}
}
