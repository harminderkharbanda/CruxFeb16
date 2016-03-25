package lecture8;

public class PairOfSumBetter {


		public static void merge(int[] input)
		{
			
			if(input .length == 1)
				return;
			
			int mid = input.length/2;
			int[] firstHalf = new int[mid];
			int[] secondHalf = new int[input.length - mid];
			
			for(int i = 0; i < mid; i++)
			{
				firstHalf[i] = input[i];
			}
			int x = mid;
			for(int i = 0; i<input.length-mid; i++)
			{
				secondHalf[i] = input[x];
				x++;
			}
			
			merge(firstHalf);
			merge(secondHalf);
			
			merge2(firstHalf, secondHalf, input);
			
		}
		
		
		public static void merge2(int a[], int b[], int c[])
		{
			
			int lena = a.length;
			int lenb = b.length;
			
			int i = 0, j = 0, k = 0;
			
			while(i < lena && j < lenb)
			{
				if(a[i] <= b[j])
				{
					c[k] = a[i];
					i++;
					k++;
				}
				else
				{
					c[k] = b[j];
					j++;
					k++;
				}
			}
			
			while(i < lena)
			{
				c[k] = a[i];
				i++;
				k++;
			}
			
			while(j < lenb)
			{
				c[k] = b[j];
				j++;
				k++;
			}
			
		}
		
		public static void power(int[] a,int n)
		{
			
			int i = 0;
			int j = a.length-1;
			while(i < j)
			{
				if(a[i] + a[j] == n)
				{
					System.out.println(a[i] + " and " + a[j]);
					
					i++;
					j--;
				}
				else if(a[i] + a[j] < n)
					i++;
				else
					j--;
			}
			
		}
		public static void main(String[] args) {
			
			int x[] = {5,-2,6,-7,1,2,-5};
			
			merge(x);
			
//			for(int i = 0; i < x.length; i++)
//			{
//				System.out.println(x[i]);
//			}
			
			power(x,6);
			
		}

	}
