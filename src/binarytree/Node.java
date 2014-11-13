package binarytree;

public class Node {

	private Node left;
	private Node right;
	private int data;
	
	public Node(Node left, Node right, int data) {
		this.left = left;
		this.right = right;
		this.data = data;
	}
	
	public int getSum() {
		int sumLeft = left == null ? 0 : left.getSum();
		int sumRight = right == null ? 0 : right.getSum();
		return data + sumLeft + sumRight;
	}
}
