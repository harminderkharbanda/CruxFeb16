package hashMaps;

import lecture6.PermutationOfString;

public class PatternMatching {

	//pattern matching using brute force
	public static int bruteForce(String a, String pattern)
	{
		boolean flag = false;
		for(int i=0;i<=(a.length() - pattern.length()); i++)
		{
			for(int j=0; j<pattern.length();j++)
			{
				if(a.charAt(i+j)!=pattern.charAt(j))
				{
					break;
				}
				if(j==pattern.length()-1)
					flag = true;
			}
			if(flag==true)
				return i;
		}
		return -1;
	}
	
	public static int greaterPermutations(int num)
	{
		int count = 0;
		String s = Integer.toString(num);
		String arr[] = PermutationOfString.computePermutation(s);
		for(int i=0; i<arr.length;i++)
		{
			if(Integer.parseInt(arr[i]) > num )
				count++;
		}
		return count;
	}
	
	
	
	
	public static void main(String[] args) {
		String str = "helloabc";
		
		System.out.println("***********Pattern Matching Brute Force***********");
		System.out.println(bruteForce(str, "oa"));
		System.out.println("***********Permutations > given number***********");
		System.out.println(greaterPermutations(312));

	}

}
