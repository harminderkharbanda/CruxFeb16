package lecture13Trees;

import java.util.Scanner;

import apple.laf.JRSUIUtils.Tree;
import lecture12StacksNQueques.QueueUsingLinkedList;



public class TreeUse {

	
	
	public static void InsertIntoTree(TreeNode<Integer> root)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the data of the root : ");
		root.setData(scan.nextInt());
		QueueUsingLinkedList<TreeNode<Integer>> l1= new QueueUsingLinkedList<TreeNode<Integer>>();
		l1.Enqueue(root);
		while(!l1.isEmpty())
		{
			try{
			TreeNode<Integer> node= l1.Dequeue();
			System.out.println("Enter the number of children for "+node.getData()+" :");
			int num_of_children=scan.nextInt();
			for(int i=0;i<num_of_children;i++)
			{
				System.out.println("Enter the "+i +"th of children for "+node.getData()+" :");
			int root_child=scan.nextInt();
			TreeNode<Integer> child= new TreeNode<Integer>(root_child);
			
			l1.Enqueue(child);
			node.children.add(child);
			//System.out.println(root.child.size())	;
			
			}
			}
			catch(Exception e){
				System.out.println("Fuck");//Never reach here
			}
			
		}
	scan.close();	
	}

	
	public static int findHeightOfTree(TreeNode<Integer> root)
	{
		if(root.children.size()==0)
		{
			return 1;
		}
		int height = Integer.MIN_VALUE;
		for(int i = 0; i < root.children.size();i++) {
			int ht = findHeightOfTree(root.children.get(i));
			if(ht > height)
			{
				height = ht;
			}
		}
		return 1 + height;
	}
	
	public static void printNodesAtDepthK(TreeNode<Integer> root, int depth)
	{
		if(depth == 0)
		{
			return;
		}
		
		for(int i=0; i<root.children.size();i++)
		{
			printNodesAtDepthK(root, depth-1);
			System.out.println(root.children.get(i).getData());
		}
	}
	
	public static int numNodesGreaterThanX(TreeNode<Integer> root, int x)
	{
		if(root.children.size()==0)
		{
		}
		int num = 0;
		for(int i=0; i<root.children.size();i++)
	}
	
	
	
	
//	public static TreeNode<Integer> takeTreeInput()
//	{
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter root data");
//		int rootData = s.nextInt();
//		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
//		
//		System.out.println("Enter number of children for " + rootData);
//		int numChildren = s.nextInt();
//		for(int i = 0; i < numChildren; i++)
//		{
//			root.children.add(i);
//		}
//		return root;
//	}
//	
//	baseQ(TreeNode<Integer> root)
//	{
//		QueueUsingLinkedList<Integer> queue = new QueueUsingLinkedList<>();
//		queue.Enqueue(root);
//		queue.Enqueue(null);
//		int max = Integer.MAX_VALUE;
//		
//		while(!queue.isEmpty())
//		{
//			TreeNode<Integer> node = queue.Dequeue();
//		
//		if(node==null)
//		{
//			if(!queue.isEmpty()){
//				queue.enqueue(null);
//			}
//		}
//		
//		for(int i=0;i< node.children.size();i++)
//		{
//			queue.Enqueue(node.children.get(i));
//		}
//	}
	
	
	public static void main(String[] args) {

		TreeNode<Integer> root = new TreeNode<Integer>(1);
		InsertIntoTree(root);
		System.out.println("Height of tree is " + findHeightOfTree(root));
		printNodesAtDepthK(root, 1);
		
	}

}
