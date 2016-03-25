//Multiply 2 numbers by using addition and subtraction by using recursion
package assignment4Recursion;

public class MultipleUsingRecursion {

	public static int multiply(int m, int n)
	{
		if(m == 0 || n == 0)
			return 0;
		
		if(m > 0 && n < 0)
		{
			return m + (-multiply(m, -(n-1)));
		}
		
		if(n > 0 && m < 0)
		{
			m = 0-m;
		    return -(m + multiply(m, n-1));
		}
		
		if ((m < 0) && (n < 0)) 
		{ 
			m= 0-m; 
			n= 0-n; 
			return m + multiply(m, n-1); 
		} 
		
		return m + multiply(m, n-1);
	}
	
	public static void main(String[] args) {
	
		System.out.println(multiply(-3, -5));

	}

}
