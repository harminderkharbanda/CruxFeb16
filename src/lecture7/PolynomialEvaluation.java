package lecture7;

public class PolynomialEvaluation {

	public static int result(int[] arr, int x)
	{
		int sum = 0;
		
		int n =1;
		
		for(int i=0; i<arr.length;i++)
		{
			sum += arr[i]*n;
			n *= x;
		}
		return sum;
	}
	
	public static void main(String[] args) {

		int a[] = {1,2,3};
		System.out.println(result(a, 2));
	}

}
