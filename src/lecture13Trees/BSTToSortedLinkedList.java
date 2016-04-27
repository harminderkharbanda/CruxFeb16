package lecture13Trees;

import lecture11LinkedList.LinkedListExample;
import lecture11LinkedList.Node;

public class BSTToSortedLinkedList {

	public static NodeDoubleReturn convertBSTToLinkedList(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			NodeDoubleReturn newNode = new NodeDoubleReturn(null,null);
			return newNode;
		}
		if(root.left==null&&root.right==null)
		{
			NodeDoubleReturn newNode = new NodeDoubleReturn(new Node<Integer>(root.data),new Node<Integer>(root.data));
			return newNode;
		}

		
		NodeDoubleReturn result1 = convertBSTToLinkedList(root.left);
		NodeDoubleReturn result2 = convertBSTToLinkedList(root.right);
		


		Node<Integer> nodeRoot = new Node<Integer>(root.data);
		result1.tail.next = nodeRoot;
		nodeRoot.next = result2.head;
		NodeDoubleReturn newNode = new NodeDoubleReturn(result1.head, result2.tail);
		
		return newNode;
			
	}
//		if(root.left == null && root.right == null)
//			return new Node<Integer>(root.data);
//		
//		
//	}
	
	public static void main(String[] args) {
	BinaryTreeNode<Integer> root = BinaryTreeUse.takeBTInput();
	NodeDoubleReturn node = convertBSTToLinkedList(root);
	LinkedListExample.print(node.head);

	}

}
