package lecture7;

public class StringRecursion {

	
	public static boolean check(String bigString,String smallString)
	{
	
		if(smallString.length() == 0)
		{
			return true;
		}
		if(bigString.length()==0)
			return false;
		
		boolean flag = false;
		
			if(smallString.charAt(0) == bigString.charAt(0))
				flag = check(bigString.substring(1),smallString.substring(1));
			else
				flag = check(bigString.substring(1),smallString);
		
		return flag;
	}
	
	public static void main(String[] args) {

		System.out.println(check("abcdondinghk", "coding"));
		System.out.println(check("coding", "coding"));
		System.out.println(check("abcdoninghk", "coding"));
		System.out.println(check("kkkk", "coding"));
		System.out.println(check("cod", "coding"));

	}

}
