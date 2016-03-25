package lecture8;

public class NoOfSubPalindromes {

	
	public static int count(String str)
	{
		
		//for single character palindromes
		int num = str.length();
		
		//for odd
		for(int i = 0; i < str.length(); i++)
		{
			for(int j = 1; j < str.length()/2;j++)
			{
				int left = i - j;
				int right = i + j; 
				if(left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right))
					num++;
				else
					break;
			}
			
		}
		
		//for even
		for(int i = 0; i < str.length(); i++)
		{
			if(i+1 < str.length() && str.charAt(i) == str.charAt(i+1))
			{
				num++;
				
				for(int j = 1; j < str.length()/2;j++)
				{
					int left = i - j;
					int right = i + j + 1; 
					if(left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right))
						num++;
					else
						break;
				}
			}
			
		}
		return num;
	}
	
	
	public static void main(String[] args) {
	
		System.out.println(count("abacbcd"));
		System.out.println(count("abacbcdd"));

	}

}
