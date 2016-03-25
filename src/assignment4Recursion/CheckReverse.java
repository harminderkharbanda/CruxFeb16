package assignment4Recursion;

public class CheckReverse {
	
	public static boolean reverse(String a, String b)
	{
		
		if(a.length() > 0 && b.length() > 0){
		if((a.length() == 1 && b.length() == 1) && (a.charAt(0) == b.charAt(0)))
			return true;
		}
		else 
			return false;
		
		if(a.length() > 0 && b.length() > 0)
		{if(a.charAt(0) == b.charAt(b.length()-1))
			return reverse(a.substring(1), b.substring(0,b.length()-1));}
		return false;
	}

	public static void main(String[] args) {
	
		boolean result = reverse("haha", "hah111a");
		boolean result2 = reverse("nnnnn", "nnn");
		boolean result3 = reverse("haha", "ahah");
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);

	}

}
