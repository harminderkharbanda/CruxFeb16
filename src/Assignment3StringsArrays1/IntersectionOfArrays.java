//Given 2 arrays, print their intersection
package Assignment3StringsArrays1;

public class IntersectionOfArrays {

	public static void printIntersection(int a[], int b[])
	{
		int totalLen = a.length + b.length;
		int alen = a.length;
		int c[] = new int[totalLen];
		int k = 0;
		
		//remove duplicates
		for(int i = 0; i < a.length; i++)
		{
			for(int j = i+1; j < a.length; j++)
			{
				if(a[i] == a[j])
				{
					k = j;
					alen--;
					for(;j < a.length-1; j++)
					{
						a[j] = a[j+1];
					}
				}
				j = k;
			}
		}
		
		for(int i = 0; i < alen; i++)
		{
			System.out.print(a[i] + " ");
		}
		
		
		
//		for(int i = 0; i < a.length; i++)
//		{
//			for(int j = 0; j < b.length; j++)
//			{
//				if(a[i] == a[j])
//				{
//					a
//				}
//			}
//		}
	}
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		int b[] = {3,4,5,6};
		
		printIntersection(a,b);

	}

}
