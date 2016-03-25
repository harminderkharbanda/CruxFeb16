package assignment4Recursion;

public class StringToNumber {

	public static int convertStringToNumber(String str)
	{
		if(str.length()==1)
			return str.charAt(0) - '0';

		int smallOutput = convertStringToNumber(str.substring(0, str.length()-1));
		return smallOutput*10 + (str.charAt(str.length()-1) - '0');

	}
	public static void main(String[] args) {

		System.out.println(convertStringToNumber("1234"));

	}

}
