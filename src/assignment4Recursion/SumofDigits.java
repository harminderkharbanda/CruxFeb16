package assignment4Recursion;

public class SumofDigits {

	public static int computeSum(int a)
	{
		if(a/10 == 0)
			return a;
		
		int sum = a%10 + computeSum(a/10);
		return sum;
	}
	public static void main(String[] args) {
		
		System.out.println(computeSum(1200004));

	}

}
