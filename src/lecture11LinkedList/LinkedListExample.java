package lecture11LinkedList;

import java.util.Scanner;

public class LinkedListExample {

	public static Node<Integer> linkedInput()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first input: ");
		Node<Integer> head = null;
		Node<Integer> tail = null;
		int nextElement = s.nextInt();
		
		while(nextElement != -1)
		{
		Node<Integer> nextNode = new Node<>(nextElement); 
		
		
		
		if(head == null)
		{
			head = nextNode;
			tail = nextNode;
		}
		else
		{
			tail.next = nextNode;
			tail = nextNode;
		}
		System.out.println("Enter next element: ");
		nextElement = s.nextInt();
		}
		return head;
		
	}
	
	public static void print(Node<Integer> head)
	{
		while(head != null)
		{
			System.out.print(head.getData() + "-->");
			head = head.next;
		}
	}
	
	public static<T> Node<T> deleteNode(Node<T> head, int pos)
	{
		int i = 1;
		Node<T> prev = head;
		
		if(pos == 0)
		{
			return head.next;
		}else
		{
		while(i < pos)
		{
			prev = prev.next;
			i++;
		}
		
		prev.next = prev.next.next;
		
		return head;
		}
	}
	
	
	public static void main(String[] args) {
		
		
		Node<Integer> head = linkedInput();
		print(head);
		System.out.println("\n");
		head = deleteNode(head,2);
		print(head);

	}

}
