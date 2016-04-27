package lecture11LinkedList;

public class DeleteNodeRecursively {

	public static Node<Integer> deleteAtI(Node<Integer> head, int pos)
	{
		if(pos > Node.length(head))
			return head;
		if(pos == 0)
		{
			return head.next;
		}
		
		head.next = deleteAtI(head.next, pos-1);
		return head;
	}
	
	
	public static void main(String[] args) {
		
		Node<Integer> head = LinkedListExample.linkedInput();
		LinkedListExample.print(head);
		System.out.println("\n");
		head = deleteAtI(head, 2);
		LinkedListExample.print(head);
		
	}

}
