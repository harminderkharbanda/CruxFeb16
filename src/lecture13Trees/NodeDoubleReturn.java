package lecture13Trees;

import lecture11LinkedList.Node;

public class NodeDoubleReturn {

	public Node<Integer> head;
	public Node<Integer> tail;
	
	public NodeDoubleReturn(Node<Integer> left, Node<Integer> right) {
		this.head = left;
		this.head = right;
	}
}
