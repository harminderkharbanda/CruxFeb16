package hashMaps;

import java.util.HashMap;

public class HashMapUse {

	
	//remove duplicates from an array
	public static void removeDuplicates(int a[])
	{
		HashMap<Integer, Integer> map = new HashMap<>();
		
		map.put(0, a[0]);
		System.out.println(map.get(0));
		for(int i = 1; i<a.length; i++)
		{
			if(!map.containsValue(a[i]))
			{map.put(i, a[i]);
			System.out.println(map.get(i));}
		}
	}
	
	//find pair of elements in an array which sum to zero
	public static void findPairSumToZero(int a[])
	{
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int ai : a)
		{
			if(map.containsKey(-ai))
			{
				int k = map.get(-ai);
				for(int i = 0; i < k; i++)
				{
				System.out.println(ai + "," + (-ai));
				}				
			}
			if(map.containsKey(ai))
			{
				map.put(ai, map.get(ai)+1);
			}
			else
			{
				map.put(ai, 1);
			}
		}	
	}
	
	//how many numbers are greater than the permutations of given number
	public static int printNumber(int num)
	{
		while(num > 1)
		{
			
		}
	}
	
	
	public static void main (String[] args)
	{
		int a[] = {1,2,3,4,5,2,4};
		int b[] = {1,3,2,-3,-1,-4,4,0,-3};
		System.out.println("***********Remove Duplicates***********");
		removeDuplicates(a);
		System.out.println("***********Pair Sum To Zero************");
		findPairSumToZero(b);
		System.out.println("*Permutations Greater Than Given Number*");
	}
}
