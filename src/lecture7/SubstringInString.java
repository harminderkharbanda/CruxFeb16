//to check if a string is present in another string in the correct order

package lecture7;

public class SubstringInString {

	public static boolean check(String bigString, String smallString)
	{
		
			int flag = 0;
			int j = 0;
			
			for(int i = 0; i < bigString.length(); i++)
			{
				if(smallString.charAt(i) == bigString.charAt(j))
			}
				if(flag == 0)
					return false;
				else
					return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println(check("abcdondinghk", "coding"));
		//ornciofjdkeinkjgpp

	}

}
