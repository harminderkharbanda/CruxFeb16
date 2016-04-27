package lecture12StacksNQueques;

public class QueueUse {

	public static void main(String[] args) {
		
//		QueueUsingLinkedList<Integer> que = new QueueUsingLinkedList<>();
//		
//		que.Enqueue(1);
//		que.Enqueue(2);
//		que.Enqueue(3);
//		System.out.println(que.size());
//		
//		
//		while(!que.isEmpty())
//		{
//			try {
//				System.out.println(que.Dequeue());
//			} catch (QueueEmptyException e) {
//				System.out.println("Queue is empty");
//			}
//		}
//		
//		try {
//			que.Dequeue();
//		} catch (QueueEmptyException e) {
//			System.out.println("Queue is empty");
//		}
//		
//		System.out.println(que.isEmpty());
		
		//--------------------------queue using stacks------------------
		
		QueueUsingStack que = new QueueUsingStack();
		
		que.Enqueue(1);
		que.Enqueue(2);
		que.Enqueue(3);
		System.out.println(que.size());
		
		
		while(!que.isEmpty())
		{
			try {
				System.out.println(que.Dequeue());
			} catch (Exception e) {
				System.out.println("Queue is empty");
			}
		}
		
		try {
			que.Dequeue();
		} catch (Exception e) {
			System.out.println("Queue is empty");
		}
		
		System.out.println(que.isEmpty());
		
		
		
		
		
	}

}
