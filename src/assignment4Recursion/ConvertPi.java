package assignment4Recursion;

public class ConvertPi {

	public static String piToNumeric(String str)
	{
		if(str.length() < 2)
			return str;
		
		String s1 = str.substring(0, 2);
		
		if(s1.equals("pi"))
			return 3.14 + piToNumeric(str.substring(2));
		return str.charAt(0) + piToNumeric(str.substring(1));
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(piToNumeric("xpix"));
		System.out.println(piToNumeric("pipi"));


	}

}
