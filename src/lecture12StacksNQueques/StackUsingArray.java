package lecture12StacksNQueques;

public class StackUsingArray{

	private int[] data;
	private int nextIndex;
	
	public StackUsingArray()
	{
		data = new int[100];
		nextIndex = 0;
	}
	
	public void push(int element)
	{
		//nextIndex = 100
		data[nextIndex] = element;
		nextIndex++;
	}
	
	public int pop() throws StackEmptyException
	{
		if(size() == 0)
		{
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		nextIndex--;
		int toBeReturned = data[nextIndex];
		data[nextIndex] = 0;
		return toBeReturned;
	}
	
	public int top()
	{
		//size == 0
		return data[nextIndex -1];
	}
	
	public int size()
	{
		return nextIndex;
	}
	
	public boolean isEmpty()
	{
		return size()==0;
	}
}
