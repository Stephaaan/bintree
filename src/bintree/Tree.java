package bintree;

public class Tree {
	private Node root;
	
	public Tree(Node root) {
		this.root = root;
	}
	
	public Node getRoot() {
		return root;
	}
	public void addNode(Node n) {
		boolean added = false;
		Node actual = root;
		
		while(!added) {
			if(actual.getValue() > n.getValue()) {
				if(actual.getLeft() != null) {
					actual = actual.getLeft();
				}else {
					actual.setLeft(n);
					added = true;
				}
			}else {
				if(actual.getRight() != null) {
					actual = actual.getRight();
				}else {
					actual.setRight(n);
					added = true;
				}
			}
		}
	}
	
	
	public void printInOrder()  { 
		inOrder(root); 
	} 
	  
	    // A utility function to do inorder traversal of BST 
	private void inOrder(Node root) { 
		if (root.getLeft() != null) 
			inOrder(root.getLeft()); 
		System.out.println(root.getValue()); 
		if(root.getRight() != null)
			inOrder(root.getRight()); 	 
	}
	public void printPostOrder() {
		postOrder(root);
	}
	private void postOrder(Node n) {
		if(n.getLeft() != null)
			postOrder(n.getLeft());
		if(n.getRight() != null)
			postOrder(n.getRight());
		System.out.println(n.getValue());
		
	}
	  
	
}	
