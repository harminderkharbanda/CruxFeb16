package lecture13Trees;

import java.util.Scanner;

public class BinaryTreeUse {

		private static Scanner s = new Scanner(System.in);
		
		//sum of all nodes of a binary tree (ass. Q1)
		
		public static int sumOfNodes(BinaryTreeNode<Integer> root)
		{
			if(root==null)
				return 0;
			int sum = root.data;
			sum = sum + sumOfNodes(root.left) + sumOfNodes(root.right);
			
			return sum;
		}
		
		//check if 2 binary trees are structurally identical (Ass. Q2)
		
		public static boolean isStructurallyIdentical(BinaryTreeNode<Integer> root1, BinaryTreeNode<Integer> root2)
		{
			if(root1==null && root2==null)
				return true;
			if(root1==null || root2==null)
				return false;
			boolean result1 = isStructurallyIdentical(root1.left, root2.left);
			boolean result2 = isStructurallyIdentical(root1.right, root2.right);
			if(result1 && result2)
				return true;
			else 
				return false;		
		}
		
		//check if a binary tree is balanced, i.e. depth of the left and right subtrees of every
		//node differ by 1 or less. (Ass. Q3)
		
		public static boolean isBalanced(BinaryTreeNode<Integer> root)
		{
			if(root==null)
				return true;
			int left = findHeight(root.left);
			int right = findHeight(root.right);
			int diff = right-left;
			if(Math.abs(diff) > 1)
			{
				return false;
			}
			
			boolean result1 = isBalanced(root.left);
			boolean result2 = isBalanced(root.right);
			
			if(result1 && result2)
				return true;
			else 
				return false;
		}
		
		//print nodes which don't have a sibling (Ass. Q5)
		
		public static void noSibling(BinaryTreeNode<Integer> root)
		{
			if(root==null)
				return;
			if(root.left != null && root.right == null)
				System.out.println(root.left.data);
			if(root.right != null && root.left == null)
				System.out.println(root.right.data);
			
			noSibling(root.left);
			noSibling(root.right);
		}
		
		//remove all the leaves of a binary tree
		
		public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root)
		{
			if(root==null)
				return null;
			if(root.left==null && root.right==null)
				return null;
			root.left = removeLeaves(root.left);
			root.right = removeLeaves(root.right);
			
			return root;
		}
		
		//count number of nodes of a binary tree
		
		public static int countNumNodes(BinaryTreeNode<Integer> root) {
			if (root == null) {
				return 0;
			}
			
			int count = 1;
			count = count + countNumNodes(root.left) + countNumNodes(root.right);
			return count;
		}
		
		//print a binary tree
		
		public static void printBT(BinaryTreeNode<Integer> root) {
			if (root == null)
				return;
			
			String toBePrinted = root.data + ":";
			if (root.left != null) {
				toBePrinted = toBePrinted + root.left.data;
			}
			
			if (root.right != null) {
				toBePrinted = toBePrinted + "," +  root.right.data;
			}
			System.out.println(toBePrinted);
			printBT(root.left);
			printBT(root.right);
		}
		
		//print preOrder of a binary tree
		
		public static void printPreOrder(BinaryTreeNode<Integer> root)
		{
			if(root == null)
				return;
			
			System.out.println(root.data);
			
			printPreOrder(root.left);
			printPreOrder(root.right);
		}
		
		//print postOrder of a binary tree
		
		public static void printPostOrder(BinaryTreeNode<Integer> root)
		{
			if(root==null)
				return;
			printPostOrder(root.left);		
			printPostOrder(root.right);
			System.out.println(root.data);
			
		}
		
		//find a given node in binary tree
		
		public static BinaryTreeNode<Integer> findNode(BinaryTreeNode<Integer> root,int num)
		{
		
			if(root == null)
				return null;
			if(root.data == num)
				return root;
			BinaryTreeNode<Integer> smallOutput1;
			BinaryTreeNode<Integer> smallOutput2;

			smallOutput1 = findNode(root.left, num);
			smallOutput2 = findNode(root.right, num);
			if(smallOutput1==null && smallOutput2==null)
				return null;
			else if(smallOutput1 == null)
				return smallOutput2;
			else
				return smallOutput1;		
		}
		
		//find the max node of a binary tree
		
		public static int findMaxNode(BinaryTreeNode<Integer> root)
		{
			if(root==null)
				return -1;
			int max = -1;
			int maxLeft = findMaxNode(root.left);
			int maxRight = findMaxNode(root.right);
			max = maxLeft > maxRight ? maxLeft: maxRight;
			max = max>root.data?max:root.data;
					
			return max;
		}
		
		//find the max node of a binary tree
		
		public static int findMinNode(BinaryTreeNode<Integer> root)
		{
			if(root==null)
				return Integer.MAX_VALUE;
			int min = Integer.MAX_VALUE;
			int minLeft = findMinNode(root.left);
			int minRight = findMinNode(root.right);
			min = minLeft < minRight ? minLeft: minRight;
			min = min < root.data?min:root.data;
					
			return min;
		}		
				
		//find the height of a binary tree
		
		public static int findHeight(BinaryTreeNode<Integer> root)
		{
			if(root==null)
				return 0;
			int height1 = findHeight(root.left);
			int height2 = findHeight(root.right);
			
			
			if(height1>height2)
				return 1 + height1;
			else
				return 1 + height2;
			
		}
		
		//print a mirror image of a binary tree
		
		public static BinaryTreeNode<Integer> findMirror(BinaryTreeNode<Integer> root)
		{
			if(root==null)
				return null;
			
			BinaryTreeNode<Integer> temp;
			findMirror(root.left);
			findMirror(root.right);
			temp = root.left;
			root.left = root.right;
			root.right = temp;
			
			return root;
		}
		
		//check if a binary tree is a BST
		
		public static boolean isBST(BinaryTreeNode<Integer> root)
		{
			if(root.left == null && root.right==null)
			{
				return true;
			}
			
			if(root.left !=null)
			{
				if(findMaxNode(root.left) < root.data)
				return true;
				else 
					return false;
			}
			
			if(root.right != null)
			{	if(findMinNode(root.right) > root.data)
				return true;
			else
				return false;
			}
		
			boolean result1 = isBST(root.left);
			boolean result2 = isBST(root.right);
			if(result1 && result2)
				return true;
			else 
				return false; 	
		}
		
		public static BSTTripleReturn isBSTBetter(BinaryTreeNode<Integer> root)
		{
			if(root==null)
			{
				BSTTripleReturn newBST = new BSTTripleReturn(true, Integer.MIN_VALUE, Integer.MAX_VALUE);
				return newBST;
			}
			
			
			BSTTripleReturn result1 = isBSTBetter(root.left);
			BSTTripleReturn result2 = isBSTBetter(root.right);
			
			int min = Math.min(Math.min(result1.mini, result2.mini), root.data);
			int max = Math.max(Math.max(result1.maxi, result2.maxi), root.data);

			if(root.data > result1.maxi && root.data < result2.mini)
			{
				BSTTripleReturn output = new BSTTripleReturn(result1.isBSTTrue&&result2.isBSTTrue, max, min);
				return output;
			}
			
			BSTTripleReturn output = new BSTTripleReturn(false, max, min);
			return output;
		}
		
		//create a binary tree from preOrder and inOrder traversals
		
//		public static BinaryTreeNode<Integer> binaryFromPreOrderInOrder(int arr1[],int arr2[], int start, int end)
//		{
//			int root = arr1[index1a];
//			index2a = 0;
//			for(int i=0;i<arr2.length;i++)
//			{
//				if(arr2[i] == root)
//				{
//					index2b = i-1;
//					break;
//				}
//				
//			}
//			binaryFromPreOrderInOrder(arr1, arr2, index1a, index1b, index2a, index2b);
//			binaryFromPreOrderInOrder(arr1, arr2, index1a, index1b, index2a, index2b);
//		}
		
		public static BinaryTreeNode<Integer> takeBTInput() {
			System.out.println("Enter root data");
			int data = s.nextInt();
			if (data == -1) {
				return null;
			}
			BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
			root.left = takeBTInput();
			root.right = takeBTInput();
			return root;
		}
		
		public static void main(String[] args) {
			
			// 1 2 4 -1 -1 -1 3  5 -1 -1 6 -1 -1
			BinaryTreeNode<Integer> root = takeBTInput();
			printBT(root);
			
			//1 2 4 -1 -1 2 -1 -1 3  5 -1 -1 6 -1 -1
//			BinaryTreeNode<Integer> root2 = takeBTInput();
			//printBT(root2);
			
//			System.out.println("***********Sum of nodes*******************");
//			System.out.println(sumOfNodes(root));
//			
//			System.out.println("********Is structurally Identical*********");
//			System.out.println(isStructurallyIdentical(root, root2));
//			
//			System.out.println("************Is tree balanced**************");
//			System.out.println(isBalanced(root));
//			
//			System.out.println("*********Nodes with no siblings***********");
//			noSibling(root);
//			
//			System.out.println("***********Remove leaf nodes**************");
//			BinaryTreeNode<Integer> root3 = takeBTInput();
//			BinaryTreeNode<Integer>root4 = removeLeaves(root3);
//			printBT(root4);
//			
////			System.out.println("***********Remove leaf nodes**************");
////			root2 = removeLeaves(root);
////			printBT(root2);
//			
//			System.out.println("***********Number of Nodes****************");
//			System.out.println(countNumNodes(root));
//			
//			System.out.println("***********PreOrder Traversal************");
//			printPreOrder(root);
//			
//			System.out.println("***********PostOrder Traversal************");
//			printPostOrder(root);
//			
//			System.out.println("***********Find a given Node**************");
//			BinaryTreeNode<Integer> rootans = findNode(root, 3);
//			if(rootans == null)
//				System.out.println("Node does not exist");
//			else{
//				System.out.println("Node exists");
//			System.out.println("Left node " + rootans.left.data);
//			System.out.println("Right node " + rootans.right.data);}
//			
//			System.out.println("***********Find max Node******************");
//			System.out.println(findMaxNode(root));
//			
//			System.out.println("***********Find Height *******************");
//			System.out.println(findHeight(root));
//			//4 2 1 -1 -1 13 -1 -1 6 5 -1 -1 7 -1 -1
//			System.out.println("***********Mirror the tree****************");
//			BinaryTreeNode<Integer> root1 = findMirror(root);
//			printBT(root1);
			System.out.println("***********Find max Node******************");
			System.out.println(findMinNode(root));
//			
			System.out.println("***********is the tree BST****************");
			System.out.println(isBSTBetter(root).isBSTTrue);
			
//			System.out.println("***********Tree from PreOrder & Inorder****************");
		}

}
