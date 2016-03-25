package assignment4Recursion;

public class Palindrome {

	public static boolean checkPalindrome(String x)
	{
		int len = x.length();
		if(len == 0 || len == 1)
			return true;
		
		String str = x.substring(1,len-1);
		
		if(x.charAt(0) == x.charAt(len-1))
			return checkPalindrome(str);
		return false;
		
	}
	
	public static void main(String[] args) {
	
		boolean result = checkPalindrome("1dadnnnndad");
		
		if(result)
			System.out.println("It is a palindrome.");
		else
			System.out.println("It is not a palindrome.");

	}

}
