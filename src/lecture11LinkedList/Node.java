package lecture11LinkedList;

public class Node<T> {

	public T data;
	public Node<T> next;
	
	public Node(T data)
	{
		this.data = data;
		this.next = null;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	public static<T> int length(Node<T> head) {
		int count = 0;
		while (head != null) {
			head = head.next;
			count++;
		}
		return count;
	}
//	public Node<T> getNext() {
//		return next;
//	}
//	public void setNext(Node<T> next) {
//		this.next = next;
//	}
	
}
