package lecture12StacksNQueques;

import lecture11LinkedList.Node;

public class StackUsingLinkedList<T> {

	Node<T> head = null;
	Node<T> tail = null;
	
	

	public void push(T element)
	{
		Node<T> newNode = new Node<>(element);
		if(head==null)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			head = newNode;
			head.next = tail;
			tail = newNode;
		}
	}
	
	public T pop() throws StackEmptyException
	{
		if(size() == 0)
		{
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		
		T toBeReturned = head.getData();
		head = head.next;
		return toBeReturned;
	}
	
	public T top() throws StackEmptyException
	{
		if(size() == 0)
		{
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return head.getData();
	}
	
	public int size()
	{
		int count = 0;
		tail = head;
		while(tail!=null)
		{
			count++;
			tail = tail.next;
		}
		return count;
	}
	
	public boolean isEmpty()
	{
		return size()==0;
	}
}
