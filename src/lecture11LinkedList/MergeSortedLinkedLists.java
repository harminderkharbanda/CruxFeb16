package lecture11LinkedList;

public class MergeSortedLinkedLists {

	public static Node<Integer> mergeLinkedLists(Node<Integer> head1, Node<Integer> head2)
	{
		Node<Integer> oh = null;
		Node<Integer> ot = null;
		
		if(head1.getData()<=head2.getData())
		{
			oh = head1;
			ot = head1;
			head1 = head1.next;
		}
		else
		{
			oh = head2;
			ot = head2;
			head2 = head2.next;
					
		}
		while(head1 != null && head2 != null)
		{
			if(head1.getData()<=head2.getData())
			{
				ot.next = head1;
				ot = head1;
				head1 = head1.next;
			}
			else
			{
				ot.next = head2;
				ot = head2;
				head2 = head2.next;
						
			}
		}
		
		while(head1 != null)
		{
			ot.next = head1;
			ot = head1;
			head1 = head1.next;
		}
		
		while(head2 != null)
		{
			ot.next = head2;
			ot = head2;
			head2 = head2.next;
		}
		
		return oh;
		
	}
	
	public static void main(String[] args) {
		
		Node<Integer> head1 = LinkedListExample.linkedInput();
		LinkedListExample.print(head1);
		System.out.println("\n");
		Node<Integer> head2 = LinkedListExample.linkedInput();
		LinkedListExample.print(head2);
		System.out.println("\n");
		Node<Integer> head = mergeLinkedLists(head1, head2);
		LinkedListExample.print(head);

	}

}
