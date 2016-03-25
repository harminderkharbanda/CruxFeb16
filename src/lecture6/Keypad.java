//Map the keypad of a mobile phone. Ex - press 2: Output - d,e,f
//Press 23: Output - ad,ae,af,bd,be,bf,cd,ce,cf

package lecture6;

public class Keypad {

	public static String[] returnKeypad(String str)
	{
		
		if(str.length()==0)
		{
			String[] output = new String[1];
			output[0] = "";
			return output;
		}
		
		
		String[] smallOutput = returnKeypad(str.substring(1));
		String getValue = getOptions(str.charAt(0));
		String output[] = new String[smallOutput.length*getValue.length()];
		
		
		int k = 0;
		for(int i = 0 ; i < smallOutput.length; i++)
		{
			for(int j = 0 ; j < getValue.length() ; j++)
			{
				output[k] = getValue.charAt(j) + smallOutput[i];
				k++;
			}
		}
		return output;
	
	}
	
	public static String getOptions(char i)
	{
		if(i=='2')
			return "abc";
		if(i=='3')
			return "def";
		if(i=='4')
			return "ghi";
		if(i=='5')
			return "pqrs";
		
		System.out.println("Invalid input");
		return "";
					
	}
	
	
	public static void main(String[] args) {
		
		String[] a = returnKeypad("23");
		
		for(int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}

	}

}
