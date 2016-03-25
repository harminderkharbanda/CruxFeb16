package Assignment3StringsArrays1;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		
		int a[] = {1,2,4};
		int b[] = {4,5,6};
		int c[] = new int[3];
		int carry = 0;
		
		for(int i = 2; i >= 0; i--)
		{
			c[i] = (a[i] + b[i] + carry)%10;
			if((a[i] + b[i]) > 9)
			{
				carry = 1;
			}
			else
			carry = 0;
		}
		
		System.out.println("Array after sum: ");
		for(int i = 0; i<3;i++)
		{
			System.out.print(c[i] + " ");
		}

	}

}
