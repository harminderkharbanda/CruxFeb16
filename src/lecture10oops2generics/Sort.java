package lecture10oops2generics;

public class Sort {

	
	public static <T extends CompareInterface<T>> void bubbleSort(T input[])
	{
		for(int i = 0; i < input.length-1; i++)
		{
			for(int j = 0; j < input.length-i-1;j++)
			{
				if(input[j].compareTo(input[j+1])==1)
				{
					T temp = input[j];
					input[j] = input[j+1];
					input[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		Student[] s = new Student[10];
		for(int i = 0; i < 10; i++)
		{
			s[i] = new Student();
			s[i].marks = 100 - i;
		}
		bubbleSort(s);
		for(int i = 0; i < 10; i++)
		{
			System.out.println(s[i].marks);
		}
	}

}
