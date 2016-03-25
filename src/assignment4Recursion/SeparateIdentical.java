package assignment4Recursion;

public class SeparateIdentical {

	
	public static String separate(String str)
	{
		if(str.length()==1)
			return str;
		
		if(str.charAt(0)==str.charAt(1))
			return str.charAt(0) + "*" + separate(str.substring(1));
		else
			return str.charAt(0) + separate(str.substring(1));
		
	}
	
	public static void main(String[] args) {
		System.out.println(separate("hello"));
		System.out.println(separate("xxyy"));
		System.out.println(separate("aaaa"));
	}

}
