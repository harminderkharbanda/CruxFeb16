package lecture9OOP;

public class LexographicOrder {

	
	public static void printLexo(int n){
		int[] arr = new int[n];
		for(int i = 1;i <= n; i++)
		{
			arr[i-1] = i;
		}
		
//		int dig = 0;
//		while(n > 0)
//		{
//			n = n/10;
//			dig++;
//		}
//		int num = 1;
		for(int i=1;i<10;i++)
		{
			System.out.println(arr[i-1]);

				 for(int j = 0;j<=9;j++)
				{
					String s = Integer.toString(arr[i-1]) + Integer.toString(j);
					while(Integer.parseInt(s)<=n)
					{
						System.out.println(s);
						s = s + Integer.toString(j);
					}
				}

		}
		
	}
	
	public static void main(String[] args) {

		printLexo(1000);
	}

}
