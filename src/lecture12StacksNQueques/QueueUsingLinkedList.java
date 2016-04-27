package lecture12StacksNQueques;

import lecture11LinkedList.Node;

public class QueueUsingLinkedList<T> {

	int count=0;
	Node<T> head = null;
	Node<T> tail = null;
	
	

	public void Enqueue(T element)
	{
		Node<T> newNode = new Node<>(element);
		if(head==null)
		{
			head = newNode;
			tail = newNode;
			count++;
		}
		else
		{
			tail.next = newNode;
			tail = newNode;
			count++;
		}
	}
	
	public T Dequeue() throws QueueEmptyException
	{
		if(size() == 0)
		{
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}
		
		T toBeReturned = head.getData();
		head = head.next;
		count--;
		return toBeReturned;
	}
	
	public T front() throws QueueEmptyException
	{
		if(size() == 0)
		{
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}
		return head.getData();
	}
	
	public int size()
	{
//		int count = 0;
//		tail = head;
//		while(tail!=null)
//		{
//			count++;
//			tail = tail.next;
//		}
		return count;
	}
	
	public boolean isEmpty()
	{
		return size()==0;
	}
}
