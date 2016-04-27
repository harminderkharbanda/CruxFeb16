package lecture12StacksNQueques;


public class CheckBracketsBalanced {

	public static boolean checkBalanced(String str)
	{
		StackUsingLinkedList<Character> s = new StackUsingLinkedList<>();

		
		try{
			
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='{' || str.charAt(i)=='(' || str.charAt(i)=='[')
			{
				s.push(str.charAt(i));
				//System.out.println("Element pushed");
			}	
			else if(str.charAt(i)=='}')
			{
				if(s.top() == '{')
					s.pop();
				else
					return false;
			}
			else if(str.charAt(i)==']')
			{
				if(s.top() == '[')
					s.pop();
				else
					return false;
			}
			else if(str.charAt(i)==')')
			{
				if(s.top() == '(')
					s.pop();
				else
					return false;
			}	
			}}
			catch(StackEmptyException e)
			{
				return false;
			}
		
		return s.isEmpty();
		}

	public static void main(String[] args) {
	
		String str = "{a+[b+(c+d)]+(e+f)";
		System.out.println(checkBalanced(str));
		
	}

}
