package lecture13Trees;

import java.util.ArrayList;

public class TreeNode<T> {

	private T data;
	public ArrayList<TreeNode<T>> children;
	
	public TreeNode(T data)
	{
		this.data = data;
		children = new ArrayList<>();
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

//	public TreeNode<T> getChildren(int i) {
//		return children.get(i);
//	}
//
//	public void setChildren(ArrayList<TreeNode<T>> children) {
//		this.children = children;
	}
	

