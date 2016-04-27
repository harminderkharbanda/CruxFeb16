package lecture12StacksNQueques;

public class StackUsingQueue {

	QueueUsingLinkedList<Integer> primary;
	QueueUsingLinkedList<Integer> secondary;
	int count=0;
	
	public StackUsingQueue()
	{
		primary = new QueueUsingLinkedList<>();
		secondary = new QueueUsingLinkedList<>();
	}
	
	public void push(int element)
	{
		primary.Enqueue(element);
		count++;
	}
	
	public int pop() throws StackEmptyException, QueueEmptyException
	{
		
		int toBeReturned=0;
		if(size() == 0)
		{
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		try{
			while(primary.size() !=1)
			{
				int elem = primary.Dequeue();
				secondary.Enqueue(elem);
			}
		
		toBeReturned = primary.Dequeue();
		QueueUsingLinkedList<Integer> temp = primary;
		primary = secondary;
		secondary = temp;
		
		}catch(QueueEmptyException e)
		{
			System.out.println("Stack empty");
		}
		count--;
		return toBeReturned;
		
	}
	
	public int top() throws StackEmptyException, QueueEmptyException
	{
		int toBeReturned=0;
		if(size() == 0)
		{
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		try{
			while(primary.size() !=1)
			{
				int elem = primary.Dequeue();
				secondary.Enqueue(elem);
			}
		
		toBeReturned = primary.Dequeue();
		secondary.Enqueue(toBeReturned);
		QueueUsingLinkedList<Integer> temp = primary;
		primary = secondary;
		secondary = temp;
		
		}catch(QueueEmptyException e)
		{
			System.out.println("Stack empty");
		}
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
