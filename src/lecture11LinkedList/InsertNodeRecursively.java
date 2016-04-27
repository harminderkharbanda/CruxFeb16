package lecture11LinkedList;

public class InsertNodeRecursively {

	public static Node<Integer> insertAtI(Node<Integer> head, int pos, int element)
	{
		if(pos > Node.length(head))
			return head;
		if(pos == 0)
		{
			Node<Integer> newNode = new Node<Integer>(element);
			newNode.next = head;
			return newNode;
		}
		
		head.next = insertAtI(head.next, pos-1, element);
		return head;
	}
	
	public static void main(String[] args) {
		Node<Integer> head = LinkedListExample.linkedInput();
		LinkedListExample.print(head);
		System.out.println("\n");
		head = insertAtI(head, 1, 99);
		LinkedListExample.print(head);
		
	}

}
