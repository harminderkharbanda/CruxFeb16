package lecture11LinkedList;

public class BubbleSortLinkedList {

	public static Node<Integer> bubbleSort(Node<Integer> head)
	{
		
		Node<Integer> current = head;
		Node<Integer> prev = null;
		Node<Integer> temp;
 		
		int count = 0;
		while(current!=null)
		{
			count++;
			current = current.next;
		}
		
//		System.out.println(count);
		current = head;
		

		
		for(int i=0 ; i<count-1;i++)
		{
			for(int j=0; j<count-i-1;j++)
			{
				if(j==0 && (current.getData() > current.next.getData()))
				{
					head = current.next;
					temp = current.next.next;
					current.next.next = current;
					current.next = temp;
					current = head.next;
					prev = head;
					
				}
				else if(j==0)
				{
					prev = head;
					current = current.next;
				}
				else 
				{
					if(current.next != null && (current.getData() > current.next.getData()))
					{
						prev.next = current.next;
						prev = current.next;
						temp = current.next.next;
						current.next.next = current;
						current.next= temp;
					}
					else
					{
						prev = current;
						current = current.next;
					}
					
				}
			
			}
			prev = null;
			current = head;
		}
		return head;
	}
	
	public static void main(String[] args) {
		
		Node<Integer> head = LinkedListExample.linkedInput();
		LinkedListExample.print(head);
		head = bubbleSort(head);
		System.out.println("\n");
		LinkedListExample.print(head);
		

	}

}
