package lecture4;

public class MergeSortedArrays {

	public static void MergeArrays(int[]a, int[]b)
	{
		int lena = a.length;
		int lenb = b.length;
		int lenc = lena + lenb;
		int c[] = new int[lenc];
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
		
		for(int p = 0; p < lenc; p++)
		{	
			System.out.print(c[p] + " ");
		}
	}
	
	
	
	public static void main(String[] args) {
		
		int[] a = {1,2,5,7};
		int[] b = {2,4,6,8,9};
		
		MergeArrays(a, b);

	}

}
