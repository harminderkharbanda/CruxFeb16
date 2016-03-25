//Print all permutations of a string
// For abc: abc,bca, bac, acb, cab, cba

package lecture6;

public class PermutationOfString {

		public static String[] computePermutation(String str)
		{
			
			if(str.length()==0)
			{
				String[] output = new String[1];
				output[0] = "";
				return output;
			}
			
			
			int k = 1;
			for(int i = 1; i <= str.length(); i++)
			{
				k = k * i;
			}
			
			
			String[] arr = new String[k];
			
			int n = 0;
			for (int i=0; i< str.length(); i++)
			{
				String small_arr[] = computePermutation(str.substring(0,i) + str.substring(i+1));
				for(int j = 0; j < small_arr.length;j++)
				{
					arr[n] = str.charAt(i) + small_arr[j];
					n++;
				}
			}
			return arr;
		}
		
		

	
	
		public static void main(String args[])
		{
			String a[] = computePermutation("abc");
			for(int i = 0; i < a.length; i++)
			{
				System.out.println(a[i]);
			}
		}
}
