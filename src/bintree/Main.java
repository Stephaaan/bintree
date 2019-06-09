package bintree;

public class Main {
	public static void main(String[] args) {
		Tree tree = new Tree(new Node(50));
		tree.addNode(new Node(30));
		tree.addNode(new Node(20));
		tree.addNode(new Node(40));
		tree.addNode(new Node(70));
		tree.addNode(new Node(60));
		tree.addNode(new Node(80));
		tree.addNode(new Node(150));
		tree.addNode(new Node(2));
		tree.printInOrder();
	}
}
