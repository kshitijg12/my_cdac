package binarySearchTree;

public class BinarySearchTree {

	static class Node {

		private int data;

		private Node left;

		private Node right;

		public Node() {
			this.data = 0;
			this.left = null;
			this.right = null;
		}

		public Node(int val) {
			this.data = val;
			this.left = null;
			this.right = null;
		}

	}

	private Node root;

	public BinarySearchTree() {
		this.root = null;
	}

	public void addNode(int val) {
		Node newNode = new Node(val);
		Node trav = root;

		if (root == null) {
			root = newNode;
			return;
		}

		while (true) {
			if (val < trav.data) {
				if (trav.left != null) {
					trav = trav.left;
				} else {
					trav.left = newNode;
					return;
				}
			}
			else {
				if (trav.right != null) {
					trav = trav.right;
				} else {
					trav.right = newNode;
					return;
				}
			}
		}
	}
	
	private void displayPreOrder(Node trav)
	{
	 if(trav == null)
		 return;
	 System.out.print(trav.data+" ");
	 displayPreOrder(trav.left);
	 displayPreOrder(trav.right);
		
	}
	//wrapper for accessing private members
	public void displayPreOrder()
	{
		displayPreOrder(root);
	}
	
	private void displayInOrder(Node trav)
	{
	 if(trav == null)
		 return;
	 displayInOrder(trav.left);
	 System.out.print(trav.data+" ");
	 displayInOrder(trav.right);
		
	}
	//wrapper for accessing private members
	public void displayInOrder()
	{
		displayInOrder(root);
	}
	
	private void displayPostOrder(Node trav)
	{
	 if(trav == null)
		 return;
	 displayPostOrder(trav.left);
	 displayPostOrder(trav.right);
	 System.out.print(trav.data+" ");
		
	}
	//wrapper for accessing private members
	public void displayPostOrder()
	{
		displayPostOrder(root);
	}

}
