package lecture11LinkedList;

public class SwapTwoElements {

	
	public static Node<Integer> swap(Node<Integer> head, int pos1, int pos2)
	{
		if(pos1 > Node.length(head) || pos2 > Node.length(head))
			return head;
		if(pos1 == 0)
		{
			int diff = pos2 - pos1;
			Node<Integer> temp = head;
			while(diff!=0)
			{
				temp = temp.next;
				diff--;
			}
			head.next = temp;
		}
		
		head.next = deleteAtI(head.next, pos-1);
		return head;
	}
	
	public static void main(String[] args) {
		
		Node<Integer> head = LinkedListExample.linkedInput();
		LinkedListExample.print(head);
		System.out.println("\n");
		head = swap(head, 2,4);
		LinkedListExample.print(head);
		
	}

}
