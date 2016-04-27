package lecture12StacksNQueques;

public class StackUse {

	public static void main(String[] args) {
		
//		StackUsingArray s = new StackUsingArray();
//		
//		s.push(10);
//		s.push(20);
//		s.push(30);
//		
//		
//		while(!s.isEmpty())
//			try
//			{
//				System.out.println(s.pop());
//			}catch(Exception e)
//			{
//				System.out.println("Seems like stack is empty");
//			}
//		
//		try
//		{
//			System.out.println(s.pop());
//		}catch(Exception e)
//		{
//			System.out.println("Seems like stack is empty");
//		}
//	}
	
	//-------------------using linked list------------------------
	
//	StackUsingLinkedList<Integer> s = new StackUsingLinkedList<Integer>();
//	
//	s.push(10);
//	s.push(20);
//	s.push(30);
//
//	System.out.println(s.size());
//	
//	while(!s.isEmpty())
//		try
//		{
//			System.out.println(s.pop());
//		}catch(Exception e)
//		{
//			System.out.println("Seems like stack is empty");
//		}
//	
//	System.out.println(s.size());
//	try
//	{
//		System.out.println(s.pop());
//	}catch(Exception e)
//	{
//		System.out.println("Seems like stack is empty");
//	}
//	
//	s.push(30);
//	s.push(40);
//	
//	try
//	{
//		System.out.println(s.top());
//	}catch(Exception e)
//	{
//		System.out.println("Seems like stack is empty");
//	}
//	
//	System.out.println(s.isEmpty());
//	System.out.println(s.size());
	
	
	//----------------------------Stack using queues---------------------
	
StackUsingQueue s = new StackUsingQueue();
	
	s.push(10);
	s.push(20);
	s.push(30);

	System.out.println(s.size());
	
	while(!s.isEmpty())
		try
		{
			System.out.println(s.pop());
		}catch(Exception e)
		{
			System.out.println("Seems like stack is empty");
		}
	
	System.out.println(s.size());
	try
	{
		System.out.println(s.pop());
	}catch(Exception e)
	{
		System.out.println("Seems like stack is empty");
	}
	
	s.push(30);
	s.push(40);
	
	try
	{
		System.out.println(s.top());
	}catch(Exception e)
	{
		System.out.println("Seems like stack is empty");
	}
	
	System.out.println(s.isEmpty());
	System.out.println(s.size());
	
}

}
