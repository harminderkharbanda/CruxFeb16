package lecture12StacksNQueques;

import lecture11LinkedList.Node;

public class QueueUsingStack {
	
	StackUsingArray primary;
	StackUsingArray secondary;
	int count = 0;
	

	public void Enqueue(int element)
	{
		primary.push(element);
	}
	
	public int Dequeue() throws QueueEmptyException, StackEmptyException
	{
		int toBeReturned = 0;
		if(size() == 0)
		{
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}
		
		while(size() != 1)
		{
			int elem = primary.pop();
			secondary.push(elem);
		}
		
		toBeReturned = primary.pop();
		StackUsingArray temp = primary;
		primary = secondary;
		secondary = temp;
		
		count--;
		return toBeReturned;
	}
	
	public int front() throws QueueEmptyException, StackEmptyException
	{
		int toBeReturned = 0;
		if(size() == 0)
		{
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}
		
		while(size() != 1)
		{
			int elem = primary.pop();
			secondary.push(elem);
		}
		
		toBeReturned = primary.pop();
		secondary.push(toBeReturned);
		StackUsingArray temp = primary;
		primary = secondary;
		secondary = temp;
		
		count--;
		return toBeReturned;
	}
	
	public int size()
	{
		return count;
	}
	
	public boolean isEmpty()
	{
		return size()==0;
	}

}
